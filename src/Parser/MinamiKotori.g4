grammar MinamiKotori;
@header{package Parser;}

program
	:	(function_definition | declaration)* function_definition (function_definition | declaration)*
	;

declaration
	:	variable_declaration
	|	class_declaration
	;

variable_declaration
	:	type init_declarator ';'
	;

type
	:	non_array_type
	|	array_declaration_type
	;

non_array_type
	:	type_name
	|	class_declaration
	;

type_name
	:	builtin_type = ('int' | 'string' | 'bool' | 'void')
	|	Identifier
	;

class_declaration
	:	'class' Identifier Left_brace (type declarator ';')* Right_brace
	;

array_declaration_type
	:	non_array_type (Left_square_bracket Right_square_bracket)+
	;

init_declarator
	:	declarator ('=' initializer)?
	;

declarator
	:	Identifier
	;

initializer
	:	assignment_expression
	;

assignment_expression
	:	(unary_expression assignment_operator)* calculation_expression
	;

assignment_operator
	:	'='
	;

calculation_expression
	:	logical_or_expression
	;

logical_or_expression
	:	logical_and_expression (logical_or_operator logical_and_expression)*
	;

logical_or_operator
    :   '||'
    ;

logical_and_expression
	:	bitwise_or_expression (logical_and_operator bitwise_or_expression)*
	;

logical_and_operator
    :   '&&'
    ;

bitwise_or_expression
	:	bitwise_xor_expression (bitwise_or_operator bitwise_xor_expression)*
	;

bitwise_or_operator
    :   '|'
    ;

bitwise_xor_expression
	:	bitwise_and_expression (bitwise_xor_operator bitwise_and_expression)*
	;

bitwise_xor_operator
    :   '^'
    ;

bitwise_and_expression
	:	equality_expression (bitwise_and_operator equality_expression)*
	;

bitwise_and_operator
    :   '&'
    ;

equality_expression //bool can be the expreesion at the left or the right of equality operator
	:	relation_expression (equality_operators relation_expression)*
	;

equality_operators
    :   (is_equal_operator | not_equal_operator)
    ;

is_equal_operator
	:	'=='
	;

not_equal_operator
	:	'!='
	;

relation_expression //bool can't be the expression at the left or the right of relation operator
	:	shift_expression (relation_operators shift_expression)?
	;

relation_operators
    :   (smaller_operator | bigger_operator | smaller_equal_operator | bigger_equal_operator)
    ;

smaller_operator
	:	'<'
	;

bigger_operator
	:	'>'
	;

smaller_equal_operator
	:	'<='
	;

bigger_equal_operator
	:	'>='
	;

shift_expression
	:	add_expression (shift_operators add_expression)*
	;

shift_operators
    :   (lshift_operator | rshift_operator)
    ;

lshift_operator
	:	'<<'
	;

rshift_operator
	:	'>>'
	;

add_expression
	:	multiply_expression (add_operators multiply_expression)*
	;

add_operators
    :   (plus_operator | minus_operator)
    ;

plus_operator
	:	'+'
	;

minus_operator
	:	'-'
	;

multiply_expression
	:	unary_expression (multiply_operators unary_expression)*
	;

multiply_operators
    :   (multiply_operator | divide_operator | mod_operator)
    ;

multiply_operator
	:	'*'
	;

divide_operator
	:	'/'
	;

mod_operator
	:	'%'
	;

unary_expression
	:	postfix_expression
	|	unary_operator unary_expression
	|	function_call_expression
	|	new_operation
	|	builtin_constant
	|   integer_constant
	;

postfix_expression
	:	primary_expression postfix*
	;

primary_expression
	:	Identifier
	|	constant
	|	Left_bracket expression Right_bracket
	|   function_call_expression
	;

constant
	:	integer_constant
	|	string_constant
	;

integer_constant
	:	Sign? Decimal_constant
	;

string_constant
	:	StringLiteral
	;

StringLiteral
	:	'"' SCharSequence? '"'
	;

fragment
SCharSequence
	:	SChar+
	;

fragment
SChar
	:   ~["\\\r\n]
	|   EscapeSequence
	;

fragment
EscapeSequence
	:	SimpleEscapeSequence
	;

fragment
SimpleEscapeSequence
	:	'\\' ['"?abfnrtv\\]
	;

Sign
	:	('+' | '-')
	;

Decimal_constant
	:	Non_zero_digit (Digit)*
	|	'0'
	;

fragment
Non_zero_digit
	:	[1-9]
	;

postfix
	:	Left_square_bracket expression Right_square_bracket
	|	get_member_operator (Identifier | function_call_expression)
	|	plusplus_operator
	|	minusminus_operator
	;

get_member_operator
	:	'.'
	;

plusplus_operator
	:	'++'
	;

minusminus_operator
	:	'--'
	;

unary_operator
	:	not_sign_operator
	|	minus_operator
	|	plusplus_operator
	|	minusminus_operator
	|	bitwise_not_operator
	;

not_sign_operator
	:	'!'
	;

bitwise_not_operator
	:	'~'
	;

expression
	:	assignment_expression (',' assignment_expression)*
	;

function_call_expression
	:	Identifier Left_bracket arguments? Right_bracket
	;

arguments
	:	assignment_expression (',' assignment_expression)*
	;

new_operation
	:	New (array_new_type | class_new_type)
	;

New
    :   'new'
    ;

array_new_type
	:	non_array_type (Left_square_bracket expression Right_square_bracket)+ (Left_square_bracket Right_square_bracket)*
	;

class_new_type
	:	Identifier
	;

builtin_constant
	:	'true'
	|	'false'
	|	'null'
	;

function_definition
	:	type Identifier Left_bracket (parameter_list)? Right_bracket Left_brace base_statement* Right_brace
	;

base_statement
    :   declaration
    |   statement
    ;

parameter_list
	:	parameter (',' parameter)*
	;

parameter
	:	type declarator
	;

statement
	:	assignment_statement
	|	compound_statement
	|	loop_statement
	|	branch_statement
	|   declaration
	;

assignment_statement
	:	expression ';'
	;

compound_statement
	:	Left_brace base_statement* Right_brace
	;

loop_statement
	:	for_loop_statement
	|	while_loop_statement
	;

for_loop_statement
	:	For Left_bracket the_first_for_expression? ';' the_second_for_expression? ';' the_third_for_expression?
	Right_bracket statement
	;

the_first_for_expression
    :   expression
    ;

the_second_for_expression
    :   expression
    ;

the_third_for_expression
    :   expression
    ;

For
	:	'for'
	;

while_loop_statement
	:	While Left_bracket expression Right_bracket statement
	;

While
	:	'while'
	;

branch_statement
	:	if_statement
	|	Return expression? ';'
	|	Break ';'
	|	Continue ';'
	;

if_statement
	:	If Left_bracket expression Right_bracket statement (Else statement)?
	;

If
	:	'if'
	;

Else
	:	'else'
	;

Return
	:	'return'
	;

Break
	:	'break'
	;

Continue
	:	'continue'
	;

Left_bracket
    :   '('
    ;

Right_bracket
    :   ')'
    ;

Left_square_bracket
    :   '[' 
    ;

Right_square_bracket
    :   ']' 
    ;

Left_brace
    :   '{'
    ;

Right_brace
    :   '}'
    ;

Whitespace
    :   [ \t]+
        -> skip
    ;

Identifier
	:	Letter (Letter | Digit)*
	;

fragment
Letter
	:	[a-zA-Z_]
	;

fragment
Digit
	:	[0-9]
	;

Newline
    :   (   '\r' '\n'?
        |   '\n'
        )
        -> skip
    ;

BlockComment
    :   '/*' .*? '*/'
        -> skip
    ;

LineComment
    :   '//' ~[\r\n]*
        -> skip
    ;
