# Built by Ficos 16/5/2
# All rights reserved.
#
#
# All test passed.
#
# Attention:
# 1. to use the built-in functions, you need to call "_buffer_init" function without any args before entering the source main function
# 	(jal _buffer_init)
# 2. just paste all of this in front of your MIPS code
#
# All supported functions:
# 		FunctionName			args
# 1.	func__print 			$a0: the string
# 2.	func__println			$a0: the string
# 3.	func__getString			---
# 4.	func__getInt			---
# 5.	func__toString			$a0: the integer
# 6.	func__string.length 	$a0: the string
# 7.	func__string.substring  $a0: the string,  $a1: left pos(int), $a2: right pos(int)
# 8.	func__string.parseInt 	$a0: the string
# 9.	func__string.ord 		$a0: the string,  $a1: pos(int)
# 10.	func__array.size 		$a0: the array
# 11.	func__stringConcatenate $a0: left string, $a1: right string
# 12.	func__stringIsEqual 	$a0: left string, $a1: right string
# 13.	func__stringLess 		$a0: left string, $a1: right string
# 14.	func__stringLeq	 		$a0: left string, $a1: right string
# 15.	func__stringGeq	 		$a0: left string, $a1: right string
# 16.	func__stringNeq	 		$a0: left string, $a1: right string
# 17.	func__stringLarge 		$a0: left string, $a1: right string
#
# Calling Conventions:
# 1. args placed in $a0, $a1, $a2
# 2. return in $v0
# 3. follow the MIPS calling convention, be careful on regs when calling these functions
# 4. all used regs are presented in the front of the function
#
# Conventions in using string:
# 1. string object is simply a register contains the initial address of the string
# 2. front of every initial address of a string are a word containing the length of the string
#    e.g.
#    .data
#  		  .word 6
# 	 str: .asciiz "hello\n"
# 		  .align 2
# 3. every string ends with '\0', which is not counted in the length
#
# Conventions in using array:
# 1. front of every initial address of a array are a word containing the size of the array

.data
_end: .asciiz "\n"
	.align 2
_buffer: .space 256
	.align 2
# 	.word 19
# str: .asciiz "-123456abcdefgh\n"
# 	.align 2

# 	.word 6
# str2: .asciiz "hello\n"
# 	.align 2

.text