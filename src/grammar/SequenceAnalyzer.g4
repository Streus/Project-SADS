grammar SequenceAnalyzer;

//PARSER RULES
		
init	:	prog+		//allows for multiple branches in tree		
		;
		
prog	:	cmd+			
		;	
cmd		:	//first branch of command hierarchy
			vardef			//variable definition
		|	strcmd			//string command
		|	predef			//predefined function
		|	literal			//string literal
		//|	'print'
		;
		
vardef	:	assignment		
		//|	alphadef		//for future implementation of a user defined alphabet
		;
		
strcmd	:	sub			//substitution command
		|	cmp			//compare command
		;
		
predef	:	ct		//cutting times
		|	sp		//star product
		|	build		
		|	sm		//shift maximality
		|	wordct	//word count
		|	concat	//concatonate
		;
		
//input must be in format sub (data , data)
sub		:	'sub' LP arg1=expr COMMA arg2=expr RP			#SubstitutionOfExpression
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
		
//input must be in format build data or build (data)
build	:	'build'  arg1=expr			#BuildExpression
		|	'build' LP arg1=expr RP		#BuildExpressionInParens
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
		|	'concat' LP arg1=expr COMMA arg2=expr COMMA INT RP	#ConcatOn2ExpressionsAtIndex
		;
		
assignment	:	varName=ID ':=' expr  			#AssignVariableOfExpression	
			;

literal	:	value=STRING_LITERAL		#StringLiteral
		|	value=INT					#IntegerLiteral
		;

expr	:	cmd				#ExpressionOfCommand		//expression as single Command 
		;


//LEXER RULES
ID  	:   LETTER (LETTER | INT)* ;	//defines ID as one letter and 0 or many letters or digits
INT 	:   [0-9]+ ;         // match integers
STRING	:	(LETTER | INT)+;
USER_ALPHA	:	[0-1]+;		 // user defined
LP		:	'(';			//assigns token name to left parenthesis
RP		:	')';			//assigns token name to right parenthesis
COMMA	:	',';			//assigns token name to comma
DBQUOTE	:	'"';
FWDSLSH	:	'/';
STRING_LITERAL : '"' (~('"' | '\\' | '\r' | '\n') | '\\' ('"' | '\\'))* '"';
//SQUOTE	:	'';
//SUB		:	'sub';
//CMP		:	'cmp';
//CT		:	'ct';
//SP		:	'sp';
//BUILD		:	'build';
//SM		:	'sm';
//WC		:	'wc';
//CONCAT	:	'concat';
LETTER	: 	[a-zA-Z]+ ;		//defines letters as lowercase and uppercase
NEWLINE	:	'\r'? '\n' ;    //return newlines to parser (end-statement signal)
LN_COMMENT :   '//' .*? '\n' -> skip;	//skips single line comments
COMMENT	:	'/*' .*? '*/' -> skip ;		//skips block comments
WS  	:   [ \t]+ -> skip ;			/* toss out whitespace*/