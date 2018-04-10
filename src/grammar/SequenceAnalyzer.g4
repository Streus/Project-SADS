grammar SequenceAnalyzer;

//PARSER RULES

init	:	prog		//allows for multiple branches in tree		
		;
		
prog	:	cmd+		#program		
		;	
cmd		:	//first branch of command hierarchy
			vardef			//variable definition
		|	strcmd			//string command
		|	predef			//predefined function
		|	literal			//string literal
		|	array_def
		|	rules
		|	print
		|	derive			
		;
		
vardef	:	assignment		
		|	retreival
		;
		
strcmd	:	sub			//substitution command
		|	cmp			//compare command
		;
		
predef	:	ct		//cutting times
		|	sp		//star product	
		|	sm		//shift maximality
		|	wordct	//word count
		|	concat	//concatonate
		;
		
//input must be in format sub (data , data)
sub		:	'sub' LP arg1=expr COMMA alpha_mapping RP							#SubstitutionOfExpression
		|	'sub' LP arg1=expr COMMA alpha_mapping COMMA iterations=INT RP		#SubstitutionOfExpressionWithIterations
		;
		
//input must be in format cmp (data , data)
cmp		:	'cmp' LP arg1=expr COMMA arg2=expr RP			#ComparisonOfExpression
		;
		
//input must be in format ct data or ct (data)		
ct		:	'ct' arg1=expr							#CuttingTimesOfExpression
		|	'ct' LP arg1=expr RP					#CuttingTimesOfExpressionInParens
		;
		
//input must be in format sp (data , data)		
sp		:	'sp' LP arg1=expr COMMA arg2=expr RP	#StarProductOfExpressions
		;	
		
//input must be in format sm data or sm (data)
sm		:	'sm' arg1=expr							#ShiftMaximalityOfExpression
		|	'sm' LP arg1=expr RP					#ShiftMaximalityOfExpressionInParens
		;
	
//input must be in format wordcount data or wordcount (data, data)	
wordct	:	'wc' LP arg1=expr COMMA arg2=expr RP	#WordCountOfExpression
		;
		
//input must be in format concat (data , data) or concat (data , data , index)	
concat	:	'concat' LP arg1=expr COMMA arg2=expr RP			#ConcatOn2Expressions
		|	'insert' LP arg1=expr COMMA arg2=expr COMMA literal RP	#ConcatOn2ExpressionsAtIndex
		;
		
assignment	:	varName=ID ':=' expr  												#AssignVariableOfExpression	
			;
	
retreival	:	variable=(ID | LAST_COMMAND_CHAR)		#RetrieveVariable		
			;

array_def	:	'def' LCB (STRING_LITERAL) (COMMA STRING_LITERAL)* RCB						#AssignUserAlphabetOfStrings		
			|	'def' LP LCB (STRING_LITERAL) (COMMA STRING_LITERAL)* RCB RP				#AssignUserAlphabetOfStringsInParens
			|	'def' LP LCB (STRING_LITERAL) (COMMA STRING_LITERAL)* RCB COMMA (rules) (COMMA rules)* RP	#AssignUserAlphabetOfStringsWithRules		
			;
			
rules	: 'r' LP (INT) (COMMA INT)* RP
		;

derive	: 'der' LP array_def COMMA INT RP			#DeriveAlphabet
		| 'der' LP alphabetName=ID COMMA INT RP		#DeriveAlphabetWithVariable
		;
			
print	:	'print' array_def			#PrintArray
		|	'print' LP array_def RP		#PrintArrayInParens		
		|	'print' cmd				#PrintCommand
		|	'print' LP cmd RP		#PrintCommandInParens
		;

literal	:	value=STRING_LITERAL		#StringLiteral
		|	value=INT					#IntegerLiteral
		;

expr	:	cmd				#ExpressionOfCommand		//expression as single Command 
		;
		
alpha_mapping	: STRING_LITERAL MAPPING_DELIMETER STRING_LITERAL (COMMA STRING_LITERAL MAPPING_DELIMETER STRING_LITERAL )*;

//LEXER RULES
ID  	:   LETTER (LETTER | INT)* ;	//defines ID as one letter and 0 or many letters or digits
INT 	:   [0-9]+ ;         // match integers
STRING	:	(LETTER | INT)+;
LP		:	'(';			//assigns token name to left parenthesis
RP		:	')';			//assigns token name to right parenthesis
LCB		:	'{';			//assigns token name to left curly bracket
RCB		:	'}';			//assigns token name to right curly bracket
COMMA	:	',';			//assigns token name to comma
DBQUOTE	:	'"';
STRING_LITERAL : '"' (~('"' | '\\' | '\r' | '\n') | '\\' ('"' | '\\'))* '"';
MAPPING_DELIMETER	: '->';
LAST_COMMAND_CHAR	:	'_';
LETTER	: 	[a-zA-Z]+ ;		//defines letters as lowercase and uppercase
NEWLINE	:	'\r'? '\n' ;    //return newlines to parser (end-statement signal)
LN_COMMENT :   '//' .*? '\n' -> skip;	//skips single line comments
COMMENT	:	'/*' .*? '*/' -> skip ;		//skips block comments
WS : [ \t]+ -> skip ;			/* toss out whitespace*/