grammar SequenceAnalyzer;

//PARSER RULES
prog	:	cmd+;			//allows for multiple branches in tree

init	:	//declares options for beginning of parse tree
			cmd				
		|	expr
		|	ID
		;
		
cmd		:	//first branch of command hierarchy
			vardef			//variable definition
		|	strcmd			//string command
		|	predef			//predefined function
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
sub		:	'sub' LP file COMMA file RP	#SubstitutionOfFiles
		|	'sub' LP expr COMMA expr RP	#SubstitutionOfExpression
		;
		
//input must be in format cmp (data , data)
cmp		:	'cmp' LP file COMMA file RP	#ComparisonOfFiles
		|	'cmp' LP expr COMMA expr RP	#ComparisonOfExpression
		;
		
//input must be in format ct data or ct (data)		
ct		:	'ct' file			#CuttingTimesOfFile
		|	'ct' LP file RP		#CuttingTimesOfFileInParens
		|	'ct' cmd			#CuttingTimesOfCommand
		|	'ct' LP cmd RP		#CuttingTimesOfCommandInParens
		|	'ct' expr			#CuttingTimesOfExpression
		|	'ct' LP expr RP		#CuttingTimesOfExpressionInParens
		;
		
//input must be in format sp (data , data)		
sp		:	'sp' LP file COMMA file RP		#StarProductOfFiles
		|	'sp' LP cmd COMMA cmd RP		#StarProductOfCommands
		|	'sp' LP expr COMMA expr RP		#StarProductOfExpressions
		;	
		
//input must be in format build data or build (data)
build	:	'build' file			#BuildFile
		|	'build' LP file RP		#BuildFileInParens
		|	'build'  expr			#BuildExpression
		|	'build' LP expr RP		#BuildExpressionInParens
		;
		
//input must be in format sm data or sm (data)
sm		:	'sm' file			#ShiftMaximalityOfFile
		|	'sm' LP file RP		#ShiftMaximalityOfFileInParens
		|	'sm' cmd			#ShiftMaximalityOfCommand
		|	'sm' LP cmd RP		#ShiftMaximalityOfCommandInParens
		|	'sm' expr			#ShiftMaximalityOfExpression
		|	'sm' LP expr RP		#ShiftMaximalityOfExpressionInParens
		;
	
//input must be in format wordcount data or wordcount (data, data)	
wordct	:	'wc' LP file COMMA file RP		#WordCountOfFile
		|	'wc' LP cmd COMMA INT RP		#WordCountOfCommand
		|	'wc' LP expr COMMA INT RP		#WordCountOfExpression
		;
		
//input must be in format concat (data , data) or concat (data , data , index)	
concat	:	'concat' LP file COMMA file RP				#ConcatOn2files	
		|	'concat' LP file COMMA file COMMA INT RP	#ConcatOn2FilesAtIndex
		|	'concat' LP cmd COMMA cmd RP				#ConcatOn2Commands
		|	'concat' LP cmd COMMA cmd COMMA INT RP		#ConcatOn2CommandsAtIndex
		|	'concat' LP expr COMMA expr RP				#ConcatOn2Expressions
		|	'concat' LP expr COMMA expr COMMA INT RP	#ConcatOn2ExpressionsAtIndex
		;
		
assignment	:	ID ':=' cmd  	#AssignVariableOfCommand		//variable assignment syntax
			|	ID ':=' expr  	#AssignVariableOfExpression	
			;


file	:	ID FILE_EXT;		 //file name with . extension

expr	:	INT                    # int        //expression as single Int 
		/*|	USER_ALPHA			   # UserAlpha*///for later implementation of user defined alphabet
		;


//LEXER RULES
ID  	:   LETTER (LETTER | INT)* ;	//defines ID as one letter and 0 or many letters or digits
INT 	:   [0-9]+ ;         // match integers
USER_ALPHA	:	[0-1]+;		 // user defined
FILE_EXT:	'.' ID+ ;		//defines file extension as a '.' followed by one or more IDs
LP		:	'(';			//assigns token name to left parenthesis
RP		:	')';			//assigns token name to right parenthesis
COMMA	:	',';			//assigns token name to comma
//SUB		:	'sub';
//CMP		:	'cmp';
//CT		:	'ct';
//SP		:	'sp';
//BUILD	:	'build';
//SM		:	'sm';
//WC		:	'wc';
//CONCAT	:	'concat';
LETTER	: 	[a-zA-Z]+ ;		//defines letters as lowercase and uppercase
NEWLINE	:	'\r'? '\n' ;    //return newlines to parser (end-statement signal)
LN_COMMENT :   '//' .*? '\n' -> skip;	//skips single line comments
COMMENT	:	'/*' .*? '*/' -> skip ;		//skips block comments
WS  	:   [ \t]+ -> skip ; 			/* toss out whitespace*/