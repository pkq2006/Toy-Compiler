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
main:
sw $ra, -4($sp)
li $v0, 9
li $a0, 32768
syscall
move $t9, $v0
li $a0, 4
li $v0, 9
syscall
sw $v0, 0($t9)
li $a0, 4
li $v0, 9
syscall
sw $v0, 4($t9)
li $a0, 4
li $v0, 9
syscall
sw $v0, 8($t9)
li $a0, 4
li $v0, 9
syscall
sw $v0, 12($t9)
li $a0, 4
li $v0, 9
syscall
sw $v0, -8($sp)
li $s0, 48271
lw $t0, -8($sp)
sw $s0, ($t0)
li $a0, 4
li $v0, 9
syscall
sw $v0, 16($t9)
lw $s0, -8($sp)
lw $s0, ($s0)
lw $t0, 16($t9)
sw $s0, ($t0)
li $a0, 4
li $v0, 9
syscall
sw $v0, -12($sp)
li $s0, 2147483647
lw $t0, -12($sp)
sw $s0, ($t0)
li $a0, 4
li $v0, 9
syscall
sw $v0, 20($t9)
lw $s0, -12($sp)
lw $s0, ($s0)
lw $t0, 20($t9)
sw $s0, ($t0)
li $a0, 4
li $v0, 9
syscall
sw $v0, 24($t9)
li $a0, 4
li $v0, 9
syscall
sw $v0, 28($t9)
li $a0, 4
li $v0, 9
syscall
sw $v0, -16($sp)
li $s0, 1
lw $t0, -16($sp)
sw $s0, ($t0)
li $a0, 4
li $v0, 9
syscall
sw $v0, 32($t9)
lw $s0, -16($sp)
lw $s0, ($s0)
lw $t0, 32($t9)
sw $s0, ($t0)
li $a0, 4
li $v0, 9
syscall
sw $v0, -28($sp)
li $s0, 0
lw $t0, -28($sp)
sw $s0, ($t0)
li $a0, 4
li $v0, 9
syscall
sw $v0, -32($sp)
lw $s0, -28($sp)
lw $s0, ($s0)
lw $t0, -32($sp)
sw $s0, ($t0)
li $a0, 4
li $v0, 9
syscall
sw $v0, -36($sp)
li $s0, 0
lw $t0, -36($sp)
sw $s0, ($t0)
li $a0, 4
li $v0, 9
syscall
sw $v0, -40($sp)
lw $s0, -36($sp)
lw $s0, ($s0)
lw $t0, -40($sp)
sw $s0, ($t0)
li $a0, 4
li $v0, 9
syscall
sw $v0, -44($sp)
li $s0, 0
lw $t0, -44($sp)
sw $s0, ($t0)
li $a0, 4
li $v0, 9
syscall
sw $v0, -48($sp)
lw $s0, -44($sp)
lw $s0, ($s0)
lw $t0, -48($sp)
sw $s0, ($t0)
li $a0, 4
li $v0, 9
syscall
sw $v0, -52($sp)
li $a0, 4
li $v0, 9
syscall
sw $v0, -56($sp)
li $s0, 3
lw $t0, -56($sp)
sw $s0, ($t0)
li $a0, 4
li $v0, 9
syscall
sw $v0, -60($sp)
li $s0, 7
lw $t0, -60($sp)
sw $s0, ($t0)
li $a0, 4
li $v0, 9
syscall
sw $v0, -64($sp)
li $s0, 10
lw $t0, -64($sp)
sw $s0, ($t0)
lw $s0, -56($sp)
lw $s0, ($s0)
lw $s1, -60($sp)
lw $s1, ($s1)
mul $s0, $s0, $s1
lw $s1, -64($sp)
lw $s1, ($s1)
mul $s0, $s0, $s1
lw $t0, -52($sp)
sw $s0, ($t0)
lw $s0, -52($sp)
lw $s0, ($s0)
lw $t0, 0($t9)
sw $s0, ($t0)
li $a0, 4
li $v0, 9
syscall
sw $v0, -68($sp)
li $s0, 0
lw $t0, -68($sp)
sw $s0, ($t0)
lw $s0, -68($sp)
lw $s0, ($s0)
lw $t0, 4($t9)
sw $s0, ($t0)
li $a0, 4
li $v0, 9
syscall
sw $v0, -72($sp)
li $a0, 4
li $v0, 9
syscall
sw $v0, -76($sp)
li $s0, 100
lw $t0, -76($sp)
sw $s0, ($t0)
lw $s0, -76($sp)
lw $s0, ($s0)
move $s1, $s0
li $t0, 4
mul $s0, $s0, $t0
addi $s0, $s0, 4
move $a0, $s0
li $v0, 9
syscall
move $s2, $v0
sw $s1, ($s2)
addi $s2, $s2, 4
lw $t0, -72($sp)
sw $s2, ($t0)
lw $s0, -72($sp)
lw $s0, ($s0)
lw $t0, 12($t9)
sw $s0, ($t0)
li $a0, 4
li $v0, 9
syscall
sw $v0, -80($sp)
lw $s0, 20($t9)
lw $s0, ($s0)
lw $s1, 16($t9)
lw $s1, ($s1)
div $s0, $s0, $s1
lw $t0, -80($sp)
sw $s0, ($t0)
lw $s0, -80($sp)
lw $s0, ($s0)
lw $t0, 24($t9)
sw $s0, ($t0)
li $a0, 4
li $v0, 9
syscall
sw $v0, -84($sp)
lw $s0, 20($t9)
lw $s0, ($s0)
lw $s1, 16($t9)
lw $s1, ($s1)
rem $s0, $s0, $s1
lw $t0, -84($sp)
sw $s0, ($t0)
lw $s0, -84($sp)
lw $s0, ($s0)
lw $t0, 28($t9)
sw $s0, ($t0)
li $a0, 4
li $v0, 9
syscall
sw $v0, -88($sp)
lw $s0, 0($t9)
lw $s0, ($s0)
sw $s0, -92($sp)
sw $sp, -96($sp)
addi $sp, $sp, -96
jal pd
lw $t0, -88($sp)
sw $v0, ($t0)
lw $s0, -88($sp)
lw $s0, ($s0)
seq $s0, $s0, 0
lw $t0, -88($sp)
sw $s0, ($t0)
lw $s0, -88($sp)
lw $s0, ($s0)
beqz $s0, if_false_0
if_true_0:
li $a0, 4
li $v0, 9
syscall
sw $v0, -96($sp)
li $a0, 4
li $v0, 9
syscall
sw $v0, -100($sp)
li $s0, 84
move $a0, $s0
li $v0, 9
syscall
li $s0, 79
sw $s0, ($v0)
addi $v0, $v0, 4
lw $t0, -100($sp)
sw $v0, ($t0)
li $s0, 83
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 111
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 114
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 114
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 121
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 44
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 32
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 116
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 104
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 101
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 32
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 110
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 117
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 109
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 98
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 101
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 114
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 32
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 110
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 32
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 109
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 117
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 115
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 116
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 32
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 98
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 101
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 32
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 97
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 32
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 110
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 117
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 109
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 98
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 101
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 114
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 32
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 115
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 46
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 116
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 46
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 32
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 116
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 104
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 101
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 114
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 101
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 32
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 101
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 120
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 105
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 115
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 116
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 115
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 32
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 105
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 32
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 115
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 97
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 116
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 105
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 115
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 102
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 121
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 105
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 110
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 103
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 32
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 110
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 61
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 49
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 43
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 50
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 43
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 46
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 46
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 46
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 43
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 105
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 0
sb $s0, ($v0)
lw $a0, -100($sp)
lw $a0, ($a0)
addi $sp, $sp, -104
jal func__println
addi $sp, $sp, 104
lw $t0, -96($sp)
sw $v0, ($t0)
li $a0, 4
li $v0, 9
syscall
sw $v0, -104($sp)
li $s0, 1
lw $t0, -104($sp)
sw $s0, ($t0)
lw $v0, -104($sp)
lw $v0, ($v0)
lw $ra, -4($sp)
lw $sp, 0($sp)
jr $ra
j if_end_0
if_false_0:
j if_end_0
if_end_0:
li $a0, 4
li $v0, 9
syscall
sw $v0, -108($sp)
li $a0, 4
li $v0, 9
syscall
sw $v0, -112($sp)
li $s0, 17
move $a0, $s0
li $v0, 9
syscall
li $s0, 12
sw $s0, ($v0)
addi $v0, $v0, 4
lw $t0, -112($sp)
sw $v0, ($t0)
li $s0, 76
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 101
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 116
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 39
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 115
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 32
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 115
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 116
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 97
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 114
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 116
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 33
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 0
sb $s0, ($v0)
lw $a0, -112($sp)
lw $a0, ($a0)
addi $sp, $sp, -116
jal func__println
addi $sp, $sp, 116
lw $t0, -108($sp)
sw $v0, ($t0)
li $a0, 4
li $v0, 9
syscall
sw $v0, -116($sp)
li $a0, 4
li $v0, 9
syscall
sw $v0, -120($sp)
li $s0, 3654898
lw $t0, -120($sp)
sw $s0, ($t0)
lw $s0, -120($sp)
lw $s0, ($s0)
sw $s0, -124($sp)
sw $sp, -128($sp)
addi $sp, $sp, -128
jal initialize
lw $t0, -116($sp)
sw $v0, ($t0)
li $a0, 4
li $v0, 9
syscall
sw $v0, -128($sp)
li $a0, 4
li $v0, 9
syscall
sw $v0, -132($sp)
li $a0, 4
li $v0, 9
syscall
sw $v0, -136($sp)
sw $sp, -140($sp)
addi $sp, $sp, -140
jal random
lw $t0, -136($sp)
sw $v0, ($t0)
li $a0, 4
li $v0, 9
syscall
sw $v0, -140($sp)
li $s0, 10
lw $t0, -140($sp)
sw $s0, ($t0)
lw $s0, -136($sp)
lw $s0, ($s0)
lw $s1, -140($sp)
lw $s1, ($s1)
rem $s0, $s0, $s1
lw $t0, -132($sp)
sw $s0, ($t0)
li $a0, 4
li $v0, 9
syscall
sw $v0, -144($sp)
li $s0, 1
lw $t0, -144($sp)
sw $s0, ($t0)
lw $s0, -132($sp)
lw $s0, ($s0)
lw $s1, -144($sp)
lw $s1, ($s1)
add $s0, $s0, $s1
lw $t0, -128($sp)
sw $s0, ($t0)
lw $s0, -128($sp)
lw $s0, ($s0)
lw $t0, 8($t9)
sw $s0, ($t0)
li $a0, 4
li $v0, 9
syscall
sw $v0, -148($sp)
li $a0, 4
li $v0, 9
syscall
sw $v0, -152($sp)
lw $a0, 8($t9)
lw $a0, ($a0)
addi $sp, $sp, -156
jal func__toString
addi $sp, $sp, 156
lw $t0, -152($sp)
sw $v0, ($t0)
lw $a0, -152($sp)
lw $a0, ($a0)
addi $sp, $sp, -156
jal func__println
addi $sp, $sp, 156
lw $t0, -148($sp)
sw $v0, ($t0)
j for_judge_0
for_judge_0:
li $a0, 4
li $v0, 9
syscall
sw $v0, -156($sp)
li $a0, 4
li $v0, 9
syscall
sw $v0, -160($sp)
li $a0, 4
li $v0, 9
syscall
sw $v0, -164($sp)
li $s0, 1
lw $t0, -164($sp)
sw $s0, ($t0)
lw $s0, 8($t9)
lw $s0, ($s0)
lw $s1, -164($sp)
lw $s1, ($s1)
sub $s0, $s0, $s1
lw $t0, -160($sp)
sw $s0, ($t0)
lw $s0, -32($sp)
lw $s0, ($s0)
lw $s1, -160($sp)
lw $s1, ($s1)
slt $s2, $s0, $s1
lw $t0, -156($sp)
sw $s2, ($t0)
lw $s0, -156($sp)
lw $s0, ($s0)
beqz $s0, for_end_0
for_start_0:
li $a0, 4
li $v0, 9
syscall
sw $v0, -168($sp)
li $a0, 4
li $v0, 9
syscall
sw $v0, -172($sp)
li $a0, 4
li $v0, 9
syscall
sw $v0, -176($sp)
sw $sp, -180($sp)
addi $sp, $sp, -180
jal random
lw $t0, -176($sp)
sw $v0, ($t0)
li $a0, 4
li $v0, 9
syscall
sw $v0, -180($sp)
li $s0, 10
lw $t0, -180($sp)
sw $s0, ($t0)
lw $s0, -176($sp)
lw $s0, ($s0)
lw $s1, -180($sp)
lw $s1, ($s1)
rem $s0, $s0, $s1
lw $t0, -172($sp)
sw $s0, ($t0)
li $a0, 4
li $v0, 9
syscall
sw $v0, -184($sp)
li $s0, 1
lw $t0, -184($sp)
sw $s0, ($t0)
lw $s0, -172($sp)
lw $s0, ($s0)
lw $s1, -184($sp)
lw $s1, ($s1)
add $s0, $s0, $s1
lw $t0, -168($sp)
sw $s0, ($t0)
li $a0, 4
li $v0, 9
syscall
sw $v0, -188($sp)
lw $s0, 12($t9)
lw $s0, ($s0)
lw $t0, -188($sp)
sw $s0, ($t0)
lw $s0, -188($sp)
lw $s0, ($s0)
lw $s1, -32($sp)
lw $s1, ($s1)
li $t0, 4
mul $s1, $s1, $t0
add $s0, $s0, $s1
sw $s0, -188($sp)
lw $s0, -168($sp)
lw $s0, ($s0)
lw $t0, -188($sp)
sw $s0, ($t0)
j while_judge_0
while_judge_0:
li $a0, 4
li $v0, 9
syscall
sw $v0, -192($sp)
li $a0, 4
li $v0, 9
syscall
sw $v0, -196($sp)
li $a0, 4
li $v0, 9
syscall
sw $v0, -200($sp)
lw $s0, 12($t9)
lw $s0, ($s0)
lw $t0, -200($sp)
sw $s0, ($t0)
lw $s0, -200($sp)
lw $s0, ($s0)
lw $s1, -32($sp)
lw $s1, ($s1)
li $t0, 4
mul $s1, $s1, $t0
add $s0, $s0, $s1
sw $s0, -200($sp)
lw $s0, -200($sp)
lw $s0, ($s0)
lw $s1, -40($sp)
lw $s1, ($s1)
add $s0, $s0, $s1
lw $t0, -196($sp)
sw $s0, ($t0)
lw $s0, -196($sp)
lw $s0, ($s0)
lw $s1, 0($t9)
lw $s1, ($s1)
sgt $s2, $s0, $s1
lw $t0, -192($sp)
sw $s2, ($t0)
lw $s0, -192($sp)
lw $s0, ($s0)
beqz $s0, while_end_0
while_start_0:
li $a0, 4
li $v0, 9
syscall
sw $v0, -204($sp)
li $a0, 4
li $v0, 9
syscall
sw $v0, -208($sp)
li $a0, 4
li $v0, 9
syscall
sw $v0, -212($sp)
sw $sp, -216($sp)
addi $sp, $sp, -216
jal random
lw $t0, -212($sp)
sw $v0, ($t0)
li $a0, 4
li $v0, 9
syscall
sw $v0, -216($sp)
li $s0, 10
lw $t0, -216($sp)
sw $s0, ($t0)
lw $s0, -212($sp)
lw $s0, ($s0)
lw $s1, -216($sp)
lw $s1, ($s1)
rem $s0, $s0, $s1
lw $t0, -208($sp)
sw $s0, ($t0)
li $a0, 4
li $v0, 9
syscall
sw $v0, -220($sp)
li $s0, 1
lw $t0, -220($sp)
sw $s0, ($t0)
lw $s0, -208($sp)
lw $s0, ($s0)
lw $s1, -220($sp)
lw $s1, ($s1)
add $s0, $s0, $s1
lw $t0, -204($sp)
sw $s0, ($t0)
li $a0, 4
li $v0, 9
syscall
sw $v0, -224($sp)
lw $s0, 12($t9)
lw $s0, ($s0)
lw $t0, -224($sp)
sw $s0, ($t0)
lw $s0, -224($sp)
lw $s0, ($s0)
lw $s1, -32($sp)
lw $s1, ($s1)
li $t0, 4
mul $s1, $s1, $t0
add $s0, $s0, $s1
sw $s0, -224($sp)
lw $s0, -204($sp)
lw $s0, ($s0)
lw $t0, -224($sp)
sw $s0, ($t0)
j while_judge_0
while_end_0:
li $a0, 4
li $v0, 9
syscall
sw $v0, -228($sp)
li $a0, 4
li $v0, 9
syscall
sw $v0, -232($sp)
lw $s0, 12($t9)
lw $s0, ($s0)
lw $t0, -232($sp)
sw $s0, ($t0)
lw $s0, -232($sp)
lw $s0, ($s0)
lw $s1, -32($sp)
lw $s1, ($s1)
li $t0, 4
mul $s1, $s1, $t0
add $s0, $s0, $s1
sw $s0, -232($sp)
lw $s0, -40($sp)
lw $s0, ($s0)
lw $s1, -232($sp)
lw $s1, ($s1)
add $s0, $s0, $s1
lw $t0, -228($sp)
sw $s0, ($t0)
lw $s0, -228($sp)
lw $s0, ($s0)
lw $t0, -40($sp)
sw $s0, ($t0)
j for_todo_0
for_todo_0:
lw $s0, -32($sp)
lw $s0, ($s0)
addi $s0, $s0, 1
lw $t0, -32($sp)
sw $s0, ($t0)
j for_judge_0
for_end_0:
li $a0, 4
li $v0, 9
syscall
sw $v0, -236($sp)
lw $s0, 0($t9)
lw $s0, ($s0)
lw $s1, -40($sp)
lw $s1, ($s1)
sub $s0, $s0, $s1
lw $t0, -236($sp)
sw $s0, ($t0)
li $a0, 4
li $v0, 9
syscall
sw $v0, -240($sp)
lw $s0, 12($t9)
lw $s0, ($s0)
lw $t0, -240($sp)
sw $s0, ($t0)
li $a0, 4
li $v0, 9
syscall
sw $v0, -244($sp)
li $a0, 4
li $v0, 9
syscall
sw $v0, -248($sp)
li $s0, 1
lw $t0, -248($sp)
sw $s0, ($t0)
lw $s0, 8($t9)
lw $s0, ($s0)
lw $s1, -248($sp)
lw $s1, ($s1)
sub $s0, $s0, $s1
lw $t0, -244($sp)
sw $s0, ($t0)
lw $s0, -240($sp)
lw $s0, ($s0)
lw $s1, -244($sp)
lw $s1, ($s1)
li $t0, 4
mul $s1, $s1, $t0
add $s0, $s0, $s1
sw $s0, -240($sp)
lw $s0, -236($sp)
lw $s0, ($s0)
lw $t0, -240($sp)
sw $s0, ($t0)
li $a0, 4
li $v0, 9
syscall
sw $v0, -252($sp)
sw $sp, -256($sp)
addi $sp, $sp, -256
jal show
lw $t0, -252($sp)
sw $v0, ($t0)
li $a0, 4
li $v0, 9
syscall
sw $v0, -256($sp)
sw $sp, -260($sp)
addi $sp, $sp, -260
jal merge
lw $t0, -256($sp)
sw $v0, ($t0)
j while_judge_1
while_judge_1:
li $a0, 4
li $v0, 9
syscall
sw $v0, -260($sp)
sw $sp, -264($sp)
addi $sp, $sp, -264
jal win
lw $t0, -260($sp)
sw $v0, ($t0)
lw $s0, -260($sp)
lw $s0, ($s0)
seq $s0, $s0, 0
lw $t0, -260($sp)
sw $s0, ($t0)
lw $s0, -260($sp)
lw $s0, ($s0)
beqz $s0, while_end_1
while_start_1:
li $a0, 4
li $v0, 9
syscall
sw $v0, -264($sp)
li $a0, 4
li $v0, 9
syscall
sw $v0, -268($sp)
li $a0, 4
li $v0, 9
syscall
sw $v0, -272($sp)
li $s0, 10
move $a0, $s0
li $v0, 9
syscall
li $s0, 5
sw $s0, ($v0)
addi $v0, $v0, 4
lw $t0, -272($sp)
sw $v0, ($t0)
li $s0, 115
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 116
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 101
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 112
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 32
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 0
sb $s0, ($v0)
li $a0, 4
li $v0, 9
syscall
sw $v0, -276($sp)
lw $s0, -48($sp)
lw $s0, ($s0)
addi $s0, $s0, 1
lw $t0, -48($sp)
sw $s0, ($t0)
lw $a0, -48($sp)
lw $a0, ($a0)
addi $sp, $sp, -280
jal func__toString
addi $sp, $sp, 280
lw $t0, -276($sp)
sw $v0, ($t0)
li $a0, 4
li $v0, 9
syscall
sw $v0, -280($sp)
li $s0, 6
move $a0, $s0
li $v0, 9
syscall
li $s0, 1
sw $s0, ($v0)
addi $v0, $v0, 4
lw $t0, -280($sp)
sw $v0, ($t0)
li $s0, 58
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 0
sb $s0, ($v0)
lw $a0, -272($sp)
lw $a0, ($a0)
lw $a1, -276($sp)
lw $a1, ($a1)
addi $sp, $sp, -284
jal func__stringConcatenate
addi $sp, $sp, 284
move $a0, $v0
lw $a1, -280($sp)
lw $a1, ($a1)
addi $sp, $sp, -284
jal func__stringConcatenate
addi $sp, $sp, 284
move $a0, $v0
lw $t0, -268($sp)
sw $a0, ($t0)
lw $a0, -268($sp)
lw $a0, ($a0)
addi $sp, $sp, -284
jal func__println
addi $sp, $sp, 284
lw $t0, -264($sp)
sw $v0, ($t0)
li $a0, 4
li $v0, 9
syscall
sw $v0, -284($sp)
sw $sp, -288($sp)
addi $sp, $sp, -288
jal move
lw $t0, -284($sp)
sw $v0, ($t0)
li $a0, 4
li $v0, 9
syscall
sw $v0, -288($sp)
sw $sp, -292($sp)
addi $sp, $sp, -292
jal merge
lw $t0, -288($sp)
sw $v0, ($t0)
li $a0, 4
li $v0, 9
syscall
sw $v0, -292($sp)
sw $sp, -296($sp)
addi $sp, $sp, -296
jal show
lw $t0, -292($sp)
sw $v0, ($t0)
j while_judge_1
while_end_1:
li $a0, 4
li $v0, 9
syscall
sw $v0, -296($sp)
li $a0, 4
li $v0, 9
syscall
sw $v0, -300($sp)
li $a0, 4
li $v0, 9
syscall
sw $v0, -304($sp)
li $s0, 12
move $a0, $s0
li $v0, 9
syscall
li $s0, 7
sw $s0, ($v0)
addi $v0, $v0, 4
lw $t0, -304($sp)
sw $v0, ($t0)
li $s0, 84
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 111
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 116
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 97
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 108
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 58
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 32
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 0
sb $s0, ($v0)
li $a0, 4
li $v0, 9
syscall
sw $v0, -308($sp)
lw $a0, -48($sp)
lw $a0, ($a0)
addi $sp, $sp, -312
jal func__toString
addi $sp, $sp, 312
lw $t0, -308($sp)
sw $v0, ($t0)
li $a0, 4
li $v0, 9
syscall
sw $v0, -312($sp)
li $s0, 13
move $a0, $s0
li $v0, 9
syscall
li $s0, 8
sw $s0, ($v0)
addi $v0, $v0, 4
lw $t0, -312($sp)
sw $v0, ($t0)
li $s0, 32
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 115
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 116
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 101
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 112
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 40
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 115
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 41
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 0
sb $s0, ($v0)
lw $a0, -304($sp)
lw $a0, ($a0)
lw $a1, -308($sp)
lw $a1, ($a1)
addi $sp, $sp, -316
jal func__stringConcatenate
addi $sp, $sp, 316
move $a0, $v0
lw $a1, -312($sp)
lw $a1, ($a1)
addi $sp, $sp, -316
jal func__stringConcatenate
addi $sp, $sp, 316
move $a0, $v0
lw $t0, -300($sp)
sw $a0, ($t0)
lw $a0, -300($sp)
lw $a0, ($a0)
addi $sp, $sp, -316
jal func__println
addi $sp, $sp, 316
lw $t0, -296($sp)
sw $v0, ($t0)
li $a0, 4
li $v0, 9
syscall
sw $v0, -316($sp)
li $s0, 0
lw $t0, -316($sp)
sw $s0, ($t0)
lw $v0, -316($sp)
lw $v0, ($v0)
lw $ra, -4($sp)
lw $sp, 0($sp)
jr $ra
lw $ra, -4($sp)
lw $sp, 0($sp)
jr $ra
random:
sw $ra, -4($sp)
li $a0, 4
li $v0, 9
syscall
sw $v0, -8($sp)
li $a0, 4
li $v0, 9
syscall
sw $v0, -12($sp)
li $a0, 4
li $v0, 9
syscall
sw $v0, -16($sp)
lw $s0, 32($t9)
lw $s0, ($s0)
lw $s1, 24($t9)
lw $s1, ($s1)
rem $s0, $s0, $s1
lw $t0, -16($sp)
sw $s0, ($t0)
lw $s0, 16($t9)
lw $s0, ($s0)
lw $s1, -16($sp)
lw $s1, ($s1)
mul $s0, $s0, $s1
lw $t0, -12($sp)
sw $s0, ($t0)
li $a0, 4
li $v0, 9
syscall
sw $v0, -20($sp)
li $a0, 4
li $v0, 9
syscall
sw $v0, -24($sp)
lw $s0, 32($t9)
lw $s0, ($s0)
lw $s1, 24($t9)
lw $s1, ($s1)
div $s0, $s0, $s1
lw $t0, -24($sp)
sw $s0, ($t0)
lw $s0, 28($t9)
lw $s0, ($s0)
lw $s1, -24($sp)
lw $s1, ($s1)
mul $s0, $s0, $s1
lw $t0, -20($sp)
sw $s0, ($t0)
lw $s0, -12($sp)
lw $s0, ($s0)
lw $s1, -20($sp)
lw $s1, ($s1)
sub $s0, $s0, $s1
lw $t0, -8($sp)
sw $s0, ($t0)
li $a0, 4
li $v0, 9
syscall
sw $v0, -28($sp)
lw $s0, -8($sp)
lw $s0, ($s0)
lw $t0, -28($sp)
sw $s0, ($t0)
li $a0, 4
li $v0, 9
syscall
sw $v0, -32($sp)
li $a0, 4
li $v0, 9
syscall
sw $v0, -36($sp)
li $s0, 0
lw $t0, -36($sp)
sw $s0, ($t0)
lw $s0, -28($sp)
lw $s0, ($s0)
lw $s1, -36($sp)
lw $s1, ($s1)
sge $s2, $s0, $s1
lw $t0, -32($sp)
sw $s2, ($t0)
lw $s0, -32($sp)
lw $s0, ($s0)
beqz $s0, if_false_1
if_true_1:
lw $s0, -28($sp)
lw $s0, ($s0)
lw $t0, 32($t9)
sw $s0, ($t0)
j if_end_1
if_false_1:
li $a0, 4
li $v0, 9
syscall
sw $v0, -40($sp)
lw $s0, -28($sp)
lw $s0, ($s0)
lw $s1, 20($t9)
lw $s1, ($s1)
add $s0, $s0, $s1
lw $t0, -40($sp)
sw $s0, ($t0)
lw $s0, -40($sp)
lw $s0, ($s0)
lw $t0, 32($t9)
sw $s0, ($t0)
j if_end_1
if_end_1:
lw $v0, 32($t9)
lw $v0, ($v0)
lw $ra, -4($sp)
lw $sp, 0($sp)
jr $ra
lw $ra, -4($sp)
lw $sp, 0($sp)
jr $ra
initialize:
sw $ra, -4($sp)
li $a0, 4
li $v0, 9
syscall
sw $v0, -8($sp)
lw $s0, 4($sp)
lw $t0, -8($sp)
sw $s0, ($t0)
lw $s0, -8($sp)
lw $s0, ($s0)
lw $t0, 32($t9)
sw $s0, ($t0)
lw $ra, -4($sp)
lw $sp, 0($sp)
jr $ra
swap:
sw $ra, -4($sp)
li $a0, 4
li $v0, 9
syscall
sw $v0, -8($sp)
lw $s0, 8($sp)
lw $t0, -8($sp)
sw $s0, ($t0)
li $a0, 4
li $v0, 9
syscall
sw $v0, -12($sp)
lw $s0, 4($sp)
lw $t0, -12($sp)
sw $s0, ($t0)
li $a0, 4
li $v0, 9
syscall
sw $v0, -16($sp)
lw $s0, 12($t9)
lw $s0, ($s0)
lw $t0, -16($sp)
sw $s0, ($t0)
lw $s0, -16($sp)
lw $s0, ($s0)
lw $s1, -8($sp)
lw $s1, ($s1)
li $t0, 4
mul $s1, $s1, $t0
add $s0, $s0, $s1
sw $s0, -16($sp)
li $a0, 4
li $v0, 9
syscall
sw $v0, -20($sp)
lw $s0, -16($sp)
lw $s0, ($s0)
lw $t0, -20($sp)
sw $s0, ($t0)
li $a0, 4
li $v0, 9
syscall
sw $v0, -24($sp)
lw $s0, 12($t9)
lw $s0, ($s0)
lw $t0, -24($sp)
sw $s0, ($t0)
lw $s0, -24($sp)
lw $s0, ($s0)
lw $s1, -12($sp)
lw $s1, ($s1)
li $t0, 4
mul $s1, $s1, $t0
add $s0, $s0, $s1
sw $s0, -24($sp)
li $a0, 4
li $v0, 9
syscall
sw $v0, -28($sp)
lw $s0, 12($t9)
lw $s0, ($s0)
lw $t0, -28($sp)
sw $s0, ($t0)
lw $s0, -28($sp)
lw $s0, ($s0)
lw $s1, -8($sp)
lw $s1, ($s1)
li $t0, 4
mul $s1, $s1, $t0
add $s0, $s0, $s1
sw $s0, -28($sp)
lw $s0, -24($sp)
lw $s0, ($s0)
lw $t0, -28($sp)
sw $s0, ($t0)
li $a0, 4
li $v0, 9
syscall
sw $v0, -32($sp)
lw $s0, 12($t9)
lw $s0, ($s0)
lw $t0, -32($sp)
sw $s0, ($t0)
lw $s0, -32($sp)
lw $s0, ($s0)
lw $s1, -12($sp)
lw $s1, ($s1)
li $t0, 4
mul $s1, $s1, $t0
add $s0, $s0, $s1
sw $s0, -32($sp)
lw $s0, -20($sp)
lw $s0, ($s0)
lw $t0, -32($sp)
sw $s0, ($t0)
lw $ra, -4($sp)
lw $sp, 0($sp)
jr $ra
pd:
sw $ra, -4($sp)
li $a0, 4
li $v0, 9
syscall
sw $v0, -8($sp)
lw $s0, 4($sp)
lw $t0, -8($sp)
sw $s0, ($t0)
j for_judge_1
for_judge_1:
li $a0, 4
li $v0, 9
syscall
sw $v0, -12($sp)
lw $s0, 4($t9)
lw $s0, ($s0)
lw $s1, -8($sp)
lw $s1, ($s1)
sle $s2, $s0, $s1
lw $t0, -12($sp)
sw $s2, ($t0)
lw $s0, -12($sp)
lw $s0, ($s0)
beqz $s0, for_end_1
for_start_1:
li $a0, 4
li $v0, 9
syscall
sw $v0, -16($sp)
li $a0, 4
li $v0, 9
syscall
sw $v0, -20($sp)
li $a0, 4
li $v0, 9
syscall
sw $v0, -24($sp)
li $a0, 4
li $v0, 9
syscall
sw $v0, -28($sp)
li $s0, 1
lw $t0, -28($sp)
sw $s0, ($t0)
lw $s0, 4($t9)
lw $s0, ($s0)
lw $s1, -28($sp)
lw $s1, ($s1)
add $s0, $s0, $s1
lw $t0, -24($sp)
sw $s0, ($t0)
li $a0, 4
li $v0, 9
syscall
sw $v0, -32($sp)
li $s0, 2
lw $t0, -32($sp)
sw $s0, ($t0)
lw $s0, 4($t9)
lw $s0, ($s0)
lw $s1, -24($sp)
lw $s1, ($s1)
mul $s0, $s0, $s1
lw $s1, -32($sp)
lw $s1, ($s1)
div $s0, $s0, $s1
lw $t0, -20($sp)
sw $s0, ($t0)
lw $s0, -8($sp)
lw $s0, ($s0)
lw $s1, -20($sp)
lw $s1, ($s1)
seq $s2, $s0, $s1
lw $t0, -16($sp)
sw $s2, ($t0)
lw $s0, -16($sp)
lw $s0, ($s0)
beqz $s0, if_false_2
if_true_2:
li $a0, 4
li $v0, 9
syscall
sw $v0, -36($sp)
li $s0, 1
lw $t0, -36($sp)
sw $s0, ($t0)
lw $v0, -36($sp)
lw $v0, ($v0)
lw $ra, -4($sp)
lw $sp, 0($sp)
jr $ra
j if_end_2
if_false_2:
j if_end_2
if_end_2:
j for_todo_1
for_todo_1:
lw $s0, 4($t9)
lw $s0, ($s0)
addi $s0, $s0, 1
lw $t0, 4($t9)
sw $s0, ($t0)
j for_judge_1
for_end_1:
li $a0, 4
li $v0, 9
syscall
sw $v0, -40($sp)
li $s0, 0
lw $t0, -40($sp)
sw $s0, ($t0)
lw $v0, -40($sp)
lw $v0, ($v0)
lw $ra, -4($sp)
lw $sp, 0($sp)
jr $ra
lw $ra, -4($sp)
lw $sp, 0($sp)
jr $ra
show:
sw $ra, -4($sp)
li $a0, 4
li $v0, 9
syscall
sw $v0, -8($sp)
li $a0, 4
li $v0, 9
syscall
sw $v0, -12($sp)
li $s0, 0
lw $t0, -12($sp)
sw $s0, ($t0)
lw $s0, -12($sp)
lw $s0, ($s0)
lw $t0, -8($sp)
sw $s0, ($t0)
j for_judge_2
for_judge_2:
li $a0, 4
li $v0, 9
syscall
sw $v0, -16($sp)
lw $s0, -8($sp)
lw $s0, ($s0)
lw $s1, 8($t9)
lw $s1, ($s1)
slt $s2, $s0, $s1
lw $t0, -16($sp)
sw $s2, ($t0)
lw $s0, -16($sp)
lw $s0, ($s0)
beqz $s0, for_end_2
for_start_2:
li $a0, 4
li $v0, 9
syscall
sw $v0, -20($sp)
li $a0, 4
li $v0, 9
syscall
sw $v0, -24($sp)
li $a0, 4
li $v0, 9
syscall
sw $v0, -28($sp)
li $a0, 4
li $v0, 9
syscall
sw $v0, -32($sp)
lw $s0, 12($t9)
lw $s0, ($s0)
lw $t0, -32($sp)
sw $s0, ($t0)
lw $s0, -32($sp)
lw $s0, ($s0)
lw $s1, -8($sp)
lw $s1, ($s1)
li $t0, 4
mul $s1, $s1, $t0
add $s0, $s0, $s1
sw $s0, -32($sp)
lw $a0, -32($sp)
lw $a0, ($a0)
addi $sp, $sp, -36
jal func__toString
addi $sp, $sp, 36
lw $t0, -28($sp)
sw $v0, ($t0)
li $a0, 4
li $v0, 9
syscall
sw $v0, -36($sp)
li $s0, 6
move $a0, $s0
li $v0, 9
syscall
li $s0, 1
sw $s0, ($v0)
addi $v0, $v0, 4
lw $t0, -36($sp)
sw $v0, ($t0)
li $s0, 32
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 0
sb $s0, ($v0)
lw $a0, -28($sp)
lw $a0, ($a0)
lw $a1, -36($sp)
lw $a1, ($a1)
addi $sp, $sp, -40
jal func__stringConcatenate
addi $sp, $sp, 40
move $a0, $v0
lw $t0, -24($sp)
sw $a0, ($t0)
lw $a0, -24($sp)
lw $a0, ($a0)
addi $sp, $sp, -40
jal func__print
addi $sp, $sp, 40
lw $t0, -20($sp)
sw $v0, ($t0)
j for_todo_2
for_todo_2:
lw $s0, -8($sp)
lw $s0, ($s0)
addi $s0, $s0, 1
lw $t0, -8($sp)
sw $s0, ($t0)
j for_judge_2
for_end_2:
li $a0, 4
li $v0, 9
syscall
sw $v0, -40($sp)
li $a0, 4
li $v0, 9
syscall
sw $v0, -44($sp)
li $s0, 5
move $a0, $s0
li $v0, 9
syscall
li $s0, 0
sw $s0, ($v0)
addi $v0, $v0, 4
lw $t0, -44($sp)
sw $v0, ($t0)
li $s0, 0
sb $s0, ($v0)
lw $a0, -44($sp)
lw $a0, ($a0)
addi $sp, $sp, -48
jal func__println
addi $sp, $sp, 48
lw $t0, -40($sp)
sw $v0, ($t0)
lw $ra, -4($sp)
lw $sp, 0($sp)
jr $ra
win:
sw $ra, -4($sp)
li $a0, 4
li $v0, 9
syscall
sw $v0, -8($sp)
li $a0, 4
li $v0, 9
syscall
sw $v0, -12($sp)
li $a0, 4
li $v0, 9
syscall
sw $v0, -16($sp)
li $a0, 4
li $v0, 9
syscall
sw $v0, -20($sp)
li $s0, 100
lw $t0, -20($sp)
sw $s0, ($t0)
lw $s0, -20($sp)
lw $s0, ($s0)
move $s1, $s0
li $t0, 4
mul $s0, $s0, $t0
addi $s0, $s0, 4
move $a0, $s0
li $v0, 9
syscall
move $s2, $v0
sw $s1, ($s2)
addi $s2, $s2, 4
lw $t0, -16($sp)
sw $s2, ($t0)
li $a0, 4
li $v0, 9
syscall
sw $v0, -24($sp)
lw $s0, -16($sp)
lw $s0, ($s0)
lw $t0, -24($sp)
sw $s0, ($t0)
li $a0, 4
li $v0, 9
syscall
sw $v0, -28($sp)
li $a0, 4
li $v0, 9
syscall
sw $v0, -32($sp)
lw $s0, 8($t9)
lw $s0, ($s0)
lw $s1, 4($t9)
lw $s1, ($s1)
sne $s2, $s0, $s1
lw $t0, -32($sp)
sw $s2, ($t0)
lw $s0, -32($sp)
lw $s0, ($s0)
beqz $s0, if_false_3
if_true_3:
li $a0, 4
li $v0, 9
syscall
sw $v0, -36($sp)
li $s0, 0
lw $t0, -36($sp)
sw $s0, ($t0)
lw $v0, -36($sp)
lw $v0, ($v0)
lw $ra, -4($sp)
lw $sp, 0($sp)
jr $ra
j if_end_3
if_false_3:
j if_end_3
if_end_3:
li $a0, 4
li $v0, 9
syscall
sw $v0, -40($sp)
li $s0, 0
lw $t0, -40($sp)
sw $s0, ($t0)
lw $s0, -40($sp)
lw $s0, ($s0)
lw $t0, -12($sp)
sw $s0, ($t0)
j for_judge_3
for_judge_3:
li $a0, 4
li $v0, 9
syscall
sw $v0, -44($sp)
lw $s0, -12($sp)
lw $s0, ($s0)
lw $s1, 8($t9)
lw $s1, ($s1)
slt $s2, $s0, $s1
lw $t0, -44($sp)
sw $s2, ($t0)
lw $s0, -44($sp)
lw $s0, ($s0)
beqz $s0, for_end_3
for_start_3:
li $a0, 4
li $v0, 9
syscall
sw $v0, -48($sp)
lw $s0, 12($t9)
lw $s0, ($s0)
lw $t0, -48($sp)
sw $s0, ($t0)
lw $s0, -48($sp)
lw $s0, ($s0)
lw $s1, -12($sp)
lw $s1, ($s1)
li $t0, 4
mul $s1, $s1, $t0
add $s0, $s0, $s1
sw $s0, -48($sp)
li $a0, 4
li $v0, 9
syscall
sw $v0, -52($sp)
lw $s0, -24($sp)
lw $s0, ($s0)
lw $t0, -52($sp)
sw $s0, ($t0)
lw $s0, -52($sp)
lw $s0, ($s0)
lw $s1, -12($sp)
lw $s1, ($s1)
li $t0, 4
mul $s1, $s1, $t0
add $s0, $s0, $s1
sw $s0, -52($sp)
lw $s0, -48($sp)
lw $s0, ($s0)
lw $t0, -52($sp)
sw $s0, ($t0)
j for_todo_3
for_todo_3:
lw $s0, -12($sp)
lw $s0, ($s0)
addi $s0, $s0, 1
lw $t0, -12($sp)
sw $s0, ($t0)
j for_judge_3
for_end_3:
li $a0, 4
li $v0, 9
syscall
sw $v0, -56($sp)
li $s0, 0
lw $t0, -56($sp)
sw $s0, ($t0)
lw $s0, -56($sp)
lw $s0, ($s0)
lw $t0, -8($sp)
sw $s0, ($t0)
j for_judge_4
for_judge_4:
li $a0, 4
li $v0, 9
syscall
sw $v0, -60($sp)
li $a0, 4
li $v0, 9
syscall
sw $v0, -64($sp)
li $a0, 4
li $v0, 9
syscall
sw $v0, -68($sp)
li $s0, 1
lw $t0, -68($sp)
sw $s0, ($t0)
lw $s0, 8($t9)
lw $s0, ($s0)
lw $s1, -68($sp)
lw $s1, ($s1)
sub $s0, $s0, $s1
lw $t0, -64($sp)
sw $s0, ($t0)
lw $s0, -8($sp)
lw $s0, ($s0)
lw $s1, -64($sp)
lw $s1, ($s1)
slt $s2, $s0, $s1
lw $t0, -60($sp)
sw $s2, ($t0)
lw $s0, -60($sp)
lw $s0, ($s0)
beqz $s0, for_end_4
for_start_4:
li $a0, 4
li $v0, 9
syscall
sw $v0, -72($sp)
li $a0, 4
li $v0, 9
syscall
sw $v0, -76($sp)
li $s0, 1
lw $t0, -76($sp)
sw $s0, ($t0)
lw $s0, -8($sp)
lw $s0, ($s0)
lw $s1, -76($sp)
lw $s1, ($s1)
add $s0, $s0, $s1
lw $t0, -72($sp)
sw $s0, ($t0)
lw $s0, -72($sp)
lw $s0, ($s0)
lw $t0, -12($sp)
sw $s0, ($t0)
j for_judge_5
for_judge_5:
li $a0, 4
li $v0, 9
syscall
sw $v0, -80($sp)
lw $s0, -12($sp)
lw $s0, ($s0)
lw $s1, 8($t9)
lw $s1, ($s1)
slt $s2, $s0, $s1
lw $t0, -80($sp)
sw $s2, ($t0)
lw $s0, -80($sp)
lw $s0, ($s0)
beqz $s0, for_end_5
for_start_5:
li $a0, 4
li $v0, 9
syscall
sw $v0, -84($sp)
li $a0, 4
li $v0, 9
syscall
sw $v0, -88($sp)
lw $s0, -24($sp)
lw $s0, ($s0)
lw $t0, -88($sp)
sw $s0, ($t0)
lw $s0, -88($sp)
lw $s0, ($s0)
lw $s1, -8($sp)
lw $s1, ($s1)
li $t0, 4
mul $s1, $s1, $t0
add $s0, $s0, $s1
sw $s0, -88($sp)
li $a0, 4
li $v0, 9
syscall
sw $v0, -92($sp)
lw $s0, -24($sp)
lw $s0, ($s0)
lw $t0, -92($sp)
sw $s0, ($t0)
lw $s0, -92($sp)
lw $s0, ($s0)
lw $s1, -12($sp)
lw $s1, ($s1)
li $t0, 4
mul $s1, $s1, $t0
add $s0, $s0, $s1
sw $s0, -92($sp)
lw $s0, -88($sp)
lw $s0, ($s0)
lw $s1, -92($sp)
lw $s1, ($s1)
sgt $s2, $s0, $s1
lw $t0, -84($sp)
sw $s2, ($t0)
lw $s0, -84($sp)
lw $s0, ($s0)
beqz $s0, if_false_4
if_true_4:
li $a0, 4
li $v0, 9
syscall
sw $v0, -96($sp)
lw $s0, -24($sp)
lw $s0, ($s0)
lw $t0, -96($sp)
sw $s0, ($t0)
lw $s0, -96($sp)
lw $s0, ($s0)
lw $s1, -8($sp)
lw $s1, ($s1)
li $t0, 4
mul $s1, $s1, $t0
add $s0, $s0, $s1
sw $s0, -96($sp)
lw $s0, -96($sp)
lw $s0, ($s0)
lw $t0, -28($sp)
sw $s0, ($t0)
li $a0, 4
li $v0, 9
syscall
sw $v0, -100($sp)
lw $s0, -24($sp)
lw $s0, ($s0)
lw $t0, -100($sp)
sw $s0, ($t0)
lw $s0, -100($sp)
lw $s0, ($s0)
lw $s1, -12($sp)
lw $s1, ($s1)
li $t0, 4
mul $s1, $s1, $t0
add $s0, $s0, $s1
sw $s0, -100($sp)
li $a0, 4
li $v0, 9
syscall
sw $v0, -104($sp)
lw $s0, -24($sp)
lw $s0, ($s0)
lw $t0, -104($sp)
sw $s0, ($t0)
lw $s0, -104($sp)
lw $s0, ($s0)
lw $s1, -8($sp)
lw $s1, ($s1)
li $t0, 4
mul $s1, $s1, $t0
add $s0, $s0, $s1
sw $s0, -104($sp)
lw $s0, -100($sp)
lw $s0, ($s0)
lw $t0, -104($sp)
sw $s0, ($t0)
li $a0, 4
li $v0, 9
syscall
sw $v0, -108($sp)
lw $s0, -24($sp)
lw $s0, ($s0)
lw $t0, -108($sp)
sw $s0, ($t0)
lw $s0, -108($sp)
lw $s0, ($s0)
lw $s1, -12($sp)
lw $s1, ($s1)
li $t0, 4
mul $s1, $s1, $t0
add $s0, $s0, $s1
sw $s0, -108($sp)
lw $s0, -28($sp)
lw $s0, ($s0)
lw $t0, -108($sp)
sw $s0, ($t0)
j if_end_4
if_false_4:
j if_end_4
if_end_4:
j for_todo_5
for_todo_5:
lw $s0, -12($sp)
lw $s0, ($s0)
addi $s0, $s0, 1
lw $t0, -12($sp)
sw $s0, ($t0)
j for_judge_5
for_end_5:
j for_todo_4
for_todo_4:
lw $s0, -8($sp)
lw $s0, ($s0)
addi $s0, $s0, 1
lw $t0, -8($sp)
sw $s0, ($t0)
j for_judge_4
for_end_4:
li $a0, 4
li $v0, 9
syscall
sw $v0, -112($sp)
li $s0, 0
lw $t0, -112($sp)
sw $s0, ($t0)
lw $s0, -112($sp)
lw $s0, ($s0)
lw $t0, -8($sp)
sw $s0, ($t0)
j for_judge_6
for_judge_6:
li $a0, 4
li $v0, 9
syscall
sw $v0, -116($sp)
lw $s0, -8($sp)
lw $s0, ($s0)
lw $s1, 8($t9)
lw $s1, ($s1)
slt $s2, $s0, $s1
lw $t0, -116($sp)
sw $s2, ($t0)
lw $s0, -116($sp)
lw $s0, ($s0)
beqz $s0, for_end_6
for_start_6:
li $a0, 4
li $v0, 9
syscall
sw $v0, -120($sp)
li $a0, 4
li $v0, 9
syscall
sw $v0, -124($sp)
lw $s0, -24($sp)
lw $s0, ($s0)
lw $t0, -124($sp)
sw $s0, ($t0)
lw $s0, -124($sp)
lw $s0, ($s0)
lw $s1, -8($sp)
lw $s1, ($s1)
li $t0, 4
mul $s1, $s1, $t0
add $s0, $s0, $s1
sw $s0, -124($sp)
li $a0, 4
li $v0, 9
syscall
sw $v0, -128($sp)
li $a0, 4
li $v0, 9
syscall
sw $v0, -132($sp)
li $s0, 1
lw $t0, -132($sp)
sw $s0, ($t0)
lw $s0, -8($sp)
lw $s0, ($s0)
lw $s1, -132($sp)
lw $s1, ($s1)
add $s0, $s0, $s1
lw $t0, -128($sp)
sw $s0, ($t0)
lw $s0, -124($sp)
lw $s0, ($s0)
lw $s1, -128($sp)
lw $s1, ($s1)
sne $s2, $s0, $s1
lw $t0, -120($sp)
sw $s2, ($t0)
lw $s0, -120($sp)
lw $s0, ($s0)
beqz $s0, if_false_5
if_true_5:
li $a0, 4
li $v0, 9
syscall
sw $v0, -136($sp)
li $s0, 0
lw $t0, -136($sp)
sw $s0, ($t0)
lw $v0, -136($sp)
lw $v0, ($v0)
lw $ra, -4($sp)
lw $sp, 0($sp)
jr $ra
j if_end_5
if_false_5:
j if_end_5
if_end_5:
j for_todo_6
for_todo_6:
lw $s0, -8($sp)
lw $s0, ($s0)
addi $s0, $s0, 1
lw $t0, -8($sp)
sw $s0, ($t0)
j for_judge_6
for_end_6:
li $a0, 4
li $v0, 9
syscall
sw $v0, -140($sp)
li $s0, 1
lw $t0, -140($sp)
sw $s0, ($t0)
lw $v0, -140($sp)
lw $v0, ($v0)
lw $ra, -4($sp)
lw $sp, 0($sp)
jr $ra
lw $ra, -4($sp)
lw $sp, 0($sp)
jr $ra
merge:
sw $ra, -4($sp)
li $a0, 4
li $v0, 9
syscall
sw $v0, -8($sp)
li $a0, 4
li $v0, 9
syscall
sw $v0, -12($sp)
li $s0, 0
lw $t0, -12($sp)
sw $s0, ($t0)
lw $s0, -12($sp)
lw $s0, ($s0)
lw $t0, -8($sp)
sw $s0, ($t0)
j for_judge_7
for_judge_7:
li $a0, 4
li $v0, 9
syscall
sw $v0, -16($sp)
lw $s0, -8($sp)
lw $s0, ($s0)
lw $s1, 8($t9)
lw $s1, ($s1)
slt $s2, $s0, $s1
lw $t0, -16($sp)
sw $s2, ($t0)
lw $s0, -16($sp)
lw $s0, ($s0)
beqz $s0, for_end_7
for_start_7:
li $a0, 4
li $v0, 9
syscall
sw $v0, -20($sp)
li $a0, 4
li $v0, 9
syscall
sw $v0, -24($sp)
lw $s0, 12($t9)
lw $s0, ($s0)
lw $t0, -24($sp)
sw $s0, ($t0)
lw $s0, -24($sp)
lw $s0, ($s0)
lw $s1, -8($sp)
lw $s1, ($s1)
li $t0, 4
mul $s1, $s1, $t0
add $s0, $s0, $s1
sw $s0, -24($sp)
li $a0, 4
li $v0, 9
syscall
sw $v0, -28($sp)
li $s0, 0
lw $t0, -28($sp)
sw $s0, ($t0)
lw $s0, -24($sp)
lw $s0, ($s0)
lw $s1, -28($sp)
lw $s1, ($s1)
seq $s2, $s0, $s1
lw $t0, -20($sp)
sw $s2, ($t0)
lw $s0, -20($sp)
lw $s0, ($s0)
beqz $s0, if_false_6
if_true_6:
li $a0, 4
li $v0, 9
syscall
sw $v0, -32($sp)
li $a0, 4
li $v0, 9
syscall
sw $v0, -36($sp)
li $a0, 4
li $v0, 9
syscall
sw $v0, -40($sp)
li $s0, 1
lw $t0, -40($sp)
sw $s0, ($t0)
lw $s0, -8($sp)
lw $s0, ($s0)
lw $s1, -40($sp)
lw $s1, ($s1)
add $s0, $s0, $s1
lw $t0, -36($sp)
sw $s0, ($t0)
lw $s0, -36($sp)
lw $s0, ($s0)
lw $t0, -32($sp)
sw $s0, ($t0)
j for_judge_8
for_judge_8:
li $a0, 4
li $v0, 9
syscall
sw $v0, -44($sp)
lw $s0, -32($sp)
lw $s0, ($s0)
lw $s1, 8($t9)
lw $s1, ($s1)
slt $s2, $s0, $s1
lw $t0, -44($sp)
sw $s2, ($t0)
lw $s0, -44($sp)
lw $s0, ($s0)
beqz $s0, for_end_8
for_start_8:
li $a0, 4
li $v0, 9
syscall
sw $v0, -48($sp)
li $a0, 4
li $v0, 9
syscall
sw $v0, -52($sp)
lw $s0, 12($t9)
lw $s0, ($s0)
lw $t0, -52($sp)
sw $s0, ($t0)
lw $s0, -52($sp)
lw $s0, ($s0)
lw $s1, -32($sp)
lw $s1, ($s1)
li $t0, 4
mul $s1, $s1, $t0
add $s0, $s0, $s1
sw $s0, -52($sp)
li $a0, 4
li $v0, 9
syscall
sw $v0, -56($sp)
li $s0, 0
lw $t0, -56($sp)
sw $s0, ($t0)
lw $s0, -52($sp)
lw $s0, ($s0)
lw $s1, -56($sp)
lw $s1, ($s1)
sne $s2, $s0, $s1
lw $t0, -48($sp)
sw $s2, ($t0)
lw $s0, -48($sp)
lw $s0, ($s0)
beqz $s0, if_false_7
if_true_7:
li $a0, 4
li $v0, 9
syscall
sw $v0, -60($sp)
lw $s0, -8($sp)
lw $s0, ($s0)
sw $s0, -64($sp)
lw $s0, -32($sp)
lw $s0, ($s0)
sw $s0, -68($sp)
sw $sp, -72($sp)
addi $sp, $sp, -72
jal swap
lw $t0, -60($sp)
sw $v0, ($t0)
j for_end_8
j if_end_7
if_false_7:
j if_end_7
if_end_7:
j for_todo_8
for_todo_8:
lw $s0, -32($sp)
lw $s0, ($s0)
addi $s0, $s0, 1
lw $t0, -32($sp)
sw $s0, ($t0)
j for_judge_8
for_end_8:
j if_end_6
if_false_6:
j if_end_6
if_end_6:
j for_todo_7
for_todo_7:
lw $s0, -8($sp)
lw $s0, ($s0)
addi $s0, $s0, 1
lw $t0, -8($sp)
sw $s0, ($t0)
j for_judge_7
for_end_7:
li $a0, 4
li $v0, 9
syscall
sw $v0, -72($sp)
li $s0, 0
lw $t0, -72($sp)
sw $s0, ($t0)
lw $s0, -72($sp)
lw $s0, ($s0)
lw $t0, -8($sp)
sw $s0, ($t0)
j for_judge_9
for_judge_9:
li $a0, 4
li $v0, 9
syscall
sw $v0, -76($sp)
lw $s0, -8($sp)
lw $s0, ($s0)
lw $s1, 8($t9)
lw $s1, ($s1)
slt $s2, $s0, $s1
lw $t0, -76($sp)
sw $s2, ($t0)
lw $s0, -76($sp)
lw $s0, ($s0)
beqz $s0, for_end_9
for_start_9:
li $a0, 4
li $v0, 9
syscall
sw $v0, -80($sp)
li $a0, 4
li $v0, 9
syscall
sw $v0, -84($sp)
lw $s0, 12($t9)
lw $s0, ($s0)
lw $t0, -84($sp)
sw $s0, ($t0)
lw $s0, -84($sp)
lw $s0, ($s0)
lw $s1, -8($sp)
lw $s1, ($s1)
li $t0, 4
mul $s1, $s1, $t0
add $s0, $s0, $s1
sw $s0, -84($sp)
li $a0, 4
li $v0, 9
syscall
sw $v0, -88($sp)
li $s0, 0
lw $t0, -88($sp)
sw $s0, ($t0)
lw $s0, -84($sp)
lw $s0, ($s0)
lw $s1, -88($sp)
lw $s1, ($s1)
seq $s2, $s0, $s1
lw $t0, -80($sp)
sw $s2, ($t0)
lw $s0, -80($sp)
lw $s0, ($s0)
beqz $s0, if_false_8
if_true_8:
lw $s0, -8($sp)
lw $s0, ($s0)
lw $t0, 8($t9)
sw $s0, ($t0)
j for_end_9
j if_end_8
if_false_8:
j if_end_8
if_end_8:
j for_todo_9
for_todo_9:
lw $s0, -8($sp)
lw $s0, ($s0)
addi $s0, $s0, 1
lw $t0, -8($sp)
sw $s0, ($t0)
j for_judge_9
for_end_9:
lw $ra, -4($sp)
lw $sp, 0($sp)
jr $ra
move:
sw $ra, -4($sp)
li $a0, 4
li $v0, 9
syscall
sw $v0, -8($sp)
li $s0, 0
lw $t0, -8($sp)
sw $s0, ($t0)
li $a0, 4
li $v0, 9
syscall
sw $v0, -12($sp)
lw $s0, -8($sp)
lw $s0, ($s0)
lw $t0, -12($sp)
sw $s0, ($t0)
j for_judge_10
for_judge_10:
li $a0, 4
li $v0, 9
syscall
sw $v0, -16($sp)
lw $s0, -12($sp)
lw $s0, ($s0)
lw $s1, 8($t9)
lw $s1, ($s1)
slt $s2, $s0, $s1
lw $t0, -16($sp)
sw $s2, ($t0)
lw $s0, -16($sp)
lw $s0, ($s0)
beqz $s0, for_end_10
for_start_10:
li $a0, 4
li $v0, 9
syscall
sw $v0, -20($sp)
lw $s0, 12($t9)
lw $s0, ($s0)
lw $t0, -20($sp)
sw $s0, ($t0)
lw $s0, -20($sp)
lw $s0, ($s0)
lw $s1, -12($sp)
lw $s1, ($s1)
li $t0, 4
mul $s1, $s1, $t0
add $s0, $s0, $s1
sw $s0, -20($sp)
lw $s0, -20($sp)
lw $s0, ($s0)
addi $s0, $s0, -1
lw $t0, -20($sp)
sw $s0, ($t0)
li $a0, 4
li $v0, 9
syscall
sw $v0, -24($sp)
li $a0, 4
li $v0, 9
syscall
sw $v0, -28($sp)
li $s0, 1
lw $t0, -28($sp)
sw $s0, ($t0)
lw $s0, -12($sp)
lw $s0, ($s0)
lw $s1, -28($sp)
lw $s1, ($s1)
add $s0, $s0, $s1
lw $t0, -24($sp)
sw $s0, ($t0)
lw $s0, -24($sp)
lw $s0, ($s0)
lw $t0, -12($sp)
sw $s0, ($t0)
j for_todo_10
for_todo_10:
j for_judge_10
for_end_10:
li $a0, 4
li $v0, 9
syscall
sw $v0, -32($sp)
lw $s0, 12($t9)
lw $s0, ($s0)
lw $t0, -32($sp)
sw $s0, ($t0)
lw $s0, -32($sp)
lw $s0, ($s0)
lw $s1, 8($t9)
lw $s1, ($s1)
li $t0, 4
mul $s1, $s1, $t0
add $s0, $s0, $s1
sw $s0, -32($sp)
lw $s0, 8($t9)
lw $s0, ($s0)
lw $t0, -32($sp)
sw $s0, ($t0)
li $a0, 4
li $v0, 9
syscall
sw $v0, -36($sp)
lw $s0, 8($t9)
sw $s0, -36($sp)
lw $s0, -36($sp)
lw $s0, ($s0)
addi $s0, $s0, 1
lw $t0, -36($sp)
sw $s0, ($t0)
lw $ra, -4($sp)
lw $sp, 0($sp)
jr $ra

# copy the string in $a0 to buffer in $a1, with putting '\0' in the end of the buffer
###### Checked ######
# used $v0, $a0, $a1
_string_copy:
	_begin_string_copy:
	lb $v0, 0($a0)
	beqz $v0, _exit_string_copy
	sb $v0, 0($a1)
	add $a0, $a0, 1
	add $a1, $a1, 1
	j _begin_string_copy
	_exit_string_copy:
	sb $zero, 0($a1)
	jr $ra

# string arg in $a0
###### Checked ######
# Change(5/4): you don't need to preserve reg before calling it
func__print:
	li $v0, 4
	syscall
	jr $ra

# string arg in $a0
###### Checked ######
# Change(5/4): you don't need to preserve reg before calling it
func__println:
	li $v0, 4
	syscall
	la $a0, _end
	syscall
	jr $ra

# count the length of given string in $a0
###### Checked ######
# used $v0, $v1, $a0
_count_string_length:
	move $v0, $a0

	_begin_count_string_length:
	lb $v1, 0($a0)
	beqz $v1, _exit_count_string_length
	add $a0, $a0, 1
	j _begin_count_string_length

	_exit_count_string_length:
	sub $v0, $a0, $v0
	jr $ra

# non arg, string in $v0
###### Checked ######
# used $a0, $a1, $t0, $v0, (used in _count_string_length) $v1
func__getString:
	subu $sp, $sp, 4
	sw $ra, 0($sp)

	la $a0, _buffer
	li $a1, 255
	li $v0, 8
	syscall

	jal _count_string_length

	move $a1, $v0			# now $a1 contains the length of the string
	add $a0, $v0, 5			# total required space = length + 1('\0') + 1 word(record the length of the string)
	li $v0, 9
	syscall
	sw $a1, 0($v0)
	add $v0, $v0, 4
	la $a0, _buffer
	move $a1, $v0
	move $t0, $v0
	jal _string_copy
	move $v0, $t0

	lw $ra, 0($sp)
	addu $sp, $sp, 4
	jr $ra

# non arg, int in $v0
###### Checked ######
# Change(5/4): you don't need to preserve reg before calling it
func__getInt:
	li $v0, 5
	syscall
	jr $ra

# int arg in $a0
###### Checked ######
# Bug fixed(5/2): when the arg is a neg number
# Change(5/4): use less regs, you don't need to preserve reg before calling it
# used $v0, $v1
func__toString:
	subu $sp, $sp, 24
	sw $a0, 0($sp)
	sw $t0, 4($sp)
	sw $t1, 8($sp)
	sw $t2, 12($sp)
	sw $t3, 16($sp)
	sw $t5, 20($sp)

	# first count the #digits
	li $t0, 0			# $t0 = 0 if the number is a negnum
	bgez $a0, _skip_set_less_than_zero
	li $t0, 1			# now $t0 must be 1
	neg $a0, $a0
	_skip_set_less_than_zero:
	beqz $a0, _set_zero

	li $t1, 0			# the #digits is in $t1
	move $t2, $a0
	move $t3, $a0
	li $t5, 10

	_begin_count_digit:
	div $t2, $t5
	mflo $v0			# get the quotient
	mfhi $v1			# get the remainder
	bgtz $v0 _not_yet
	bgtz $v1 _not_yet
	j _yet
	_not_yet:
	add $t1, $t1, 1
	move $t2, $v0
	j _begin_count_digit

	_yet:
	beqz $t0, _skip_reserve_neg
	add $t1, $t1, 1
	_skip_reserve_neg:
	add $a0, $t1, 5
	li $v0, 9
	syscall
	sw $t1, 0($v0)
	add $v0, $v0, 4
	add $t1, $t1, $v0
	sb $zero, 0($t1)
	sub $t1, $t1, 1

	_continue_toString:
	div $t3, $t5
	mfhi $v1
	add $v1, $v1, 48	# in ascii 48 = '0'
	sb $v1, 0($t1)
	sub $t1, $t1, 1
	mflo $t3
	# bge $t1, $v0, _continue_toString
	bnez $t3, _continue_toString

	beqz $t0, _skip_place_neg
	li $v1, 45
	sb $v1, 0($t1)
	_skip_place_neg:
	# lw $ra, 0($sp)
	# addu $sp, $sp, 4

	lw $a0, 0($sp)
	lw $t0, 4($sp)
	lw $t1, 8($sp)
	lw $t2, 12($sp)
	lw $t3, 16($sp)
	lw $t5, 20($sp)

	addu $sp, $sp, 24
	jr $ra

	_set_zero:
	li $a0, 6
	li $v0, 9
	syscall
	li $a0, 1
	sw $a0, 0($v0)
	add $v0, $v0, 4
	li $a0, 48
	sb $a0, 0($v0)

	lw $a0, 0($sp)
	lw $t0, 4($sp)
	lw $t1, 8($sp)
	lw $t2, 12($sp)
	lw $t3, 16($sp)
	lw $t5, 20($sp)

	addu $sp, $sp, 24
	jr $ra


# string arg in $a0
# the zero in the end of the string will not be counted
###### Checked ######
# you don't need to preserve reg before calling it
func__string.length:
	lw $v0, -4($a0)
	jr $ra

# string arg in $a0, left in $a1, right in $a2
###### Checked ######
# used $a0, $a1, $t0, $t1, $t2, $v1, $v0
func__string.substring:
	subu $sp, $sp, 4
	sw $ra, 0($sp)

	move $t0, $a0

	sub $t1, $a2, $a1
	add $t1, $t1, 1		# $t1 is the length of the substring
	add $a0, $t1, 5
	li $v0, 9
	syscall
	sw $t1, 0($v0)
	add $v1, $v0, 4

	add $a0, $t0, $a1
	add $t2, $t0, $a2
	lb $t1, 1($t2)		# store the ori_begin + right + 1 char in $t1
	sb $zero, 1($t2)	# change it to 0 for the convenience of copying
	move $a1, $v1
	jal _string_copy
	move $v0, $v1
	sb $t1, 1($t2)

	lw $ra, 0($sp)
	addu $sp, $sp, 4
	jr $ra

# string arg in
###### Checked ######
# 16/5/4 Fixed a serious bug: can not parse negtive number
# used $v0, $v1
func__string.parseInt:
	subu $sp, $sp, 16
	sw $a0, 0($sp)
	sw $t0, 4($sp)
	sw $t1, 8($sp)
	sw $t2, 12($sp)

	li $v0, 0

	lb $t1, 0($a0)
	li $t2, 45
	bne $t1, $t2, _skip_parse_neg
	li $t1, 1			#if there is a '-' sign, $t1 = 1
	add $a0, $a0, 1
	j _skip_set_t1_zero

	_skip_parse_neg:
	li $t1, 0
	_skip_set_t1_zero:
	move $t0, $a0
	li $t2, 1

	_count_number_pos:
	lb $v1, 0($t0)
	bgt $v1, 57, _begin_parse_int
	blt $v1, 48, _begin_parse_int
	add $t0, $t0, 1
	j _count_number_pos

	_begin_parse_int:
	sub $t0, $t0, 1

	_parsing_int:
	blt $t0, $a0, _finish_parse_int
	lb $v1, 0($t0)
	sub $v1, $v1, 48
	mul $v1, $v1, $t2
	add $v0, $v0, $v1
	mul $t2, $t2, 10
	sub $t0, $t0, 1
	j _parsing_int

	_finish_parse_int:
	beqz $t1, _skip_neg
	neg $v0, $v0
	_skip_neg:

	lw $a0, 0($sp)
	lw $t0, 4($sp)
	lw $t1, 8($sp)
	lw $t2, 12($sp)
	addu $sp, $sp, 16
	jr $ra

# string arg in $a0, pos in $a1
###### Checked ######
# used $v0, $v1
func__string.ord:
	add $v1, $a0, $a1
	lb $v0, 0($v1)
	jr $ra

# array arg in $a0
# used $v0
func__array.size:
	lw $v0, -4($a0)
	jr $ra

# string1 in $a0, string2 in $a1
###### Checked ######
# change(16/5/4): use less regs, you don't need to preserve reg before calling it
# used $v0, $v1
func__stringConcatenate:

	subu $sp, $sp, 24
	sw $ra, 0($sp)
	sw $a0, 4($sp)
	sw $a1, 8($sp)
	sw $t0, 12($sp)
	sw $t1, 16($sp)
	sw $t2, 20($sp)

	lw $t0, -4($a0)		# $t0 is the length of lhs
	lw $t1, -4($a1)		# $t1 is the length of rhs
	add $t2, $t0, $t1

	move $t1, $a0

	add $a0, $t2, 5
	li $v0, 9
	syscall

	sw $t2, 0($v0)
	move $t2, $a1

	add $v0, $v0, 4
	move $v1, $v0

	move $a0, $t1
	move $a1, $v1
	jal _string_copy

	move $a0, $t2
	add $a1, $v1, $t0
	# add $a1, $a1, 1
	jal _string_copy

	move $v0, $v1
	lw $ra, 0($sp)
	lw $a0, 4($sp)
	lw $a1, 8($sp)
	lw $t0, 12($sp)
	lw $t1, 16($sp)
	lw $t2, 20($sp)
	addu $sp, $sp, 24
	jr $ra

# string1 in $a0, string2 in $a1
###### Checked ######
# change(16/5/4): use less regs, you don't need to preserve reg before calling it
# used $a0, $a1, $v0, $v1
func__stringIsEqual:
	# subu $sp, $sp, 8
	# sw $a0, 0($sp)
	# sw $a1, 4($sp)

	lw $v0, -4($a0)
	lw $v1, -4($a1)
	bne $v0, $v1, _not_equal

	_continue_compare_equal:
	lb $v0, 0($a0)
	lb $v1, 0($a1)
	beqz $v0, _equal
	bne $v0, $v1, _not_equal
	add $a0, $a0, 1
	add $a1, $a1, 1
	j _continue_compare_equal

	_not_equal:
	li $v0, 0
	j _compare_final

	_equal:
	li $v0, 1

	_compare_final:
	# lw $a0, 0($sp)
	# lw $a1, 4($sp)
	# addu $sp, $sp, 8
	jr $ra


# string1 in $a0, string2 in $a1
###### Checked ######
# change(16/5/4): use less regs, you don't need to preserve reg before calling it
# used $a0, $a1, $v0, $v1
func__stringLess:
	# subu $sp, $sp, 8
	# sw $a0, 0($sp)
	# sw $a1, 4($sp)

	_begin_compare_less:
	lb $v0, 0($a0)
	lb $v1, 0($a1)
	blt $v0, $v1, _less_correct
	bgt $v0, $v1, _less_false
	beqz $v0, _less_false
	add $a0, $a0, 1
	add $a1, $a1, 1
	j _begin_compare_less

	_less_correct:
	li $v0, 1
	j _less_compare_final

	_less_false:
	li $v0, 0

	_less_compare_final:

	# lw $a0, 0($sp)
	# lw $a1, 4($sp)
	# addu $sp, $sp, 8
	jr $ra

# string1 in $a0, string2 in $a1
# used $a0, $a1, $v0, $v1
func__stringLarge:
	subu $sp, $sp, 4
	sw $ra, 0($sp)

	jal func__stringLess

	xor $v0, $v0, 1

	lw $ra, 0($sp)
	addu $sp, $sp, 4
	jr $ra

# string1 in $a0, string2 in $a1
# used $a0, $a1, $v0, $v1
func__stringLeq:
	subu $sp, $sp, 12
	sw $ra, 0($sp)
	sw $a0, 4($sp)
	sw $a1, 8($sp)

	jal func__stringLess

	bnez $v0, _skip_compare_equal_in_Leq

	lw $a0, 4($sp)
	lw $a1, 8($sp)
	jal func__stringIsEqual

	_skip_compare_equal_in_Leq:
	lw $ra, 0($sp)
	addu $sp, $sp, 12
	jr $ra

# string1 in $a0, string2 in $a1
# used $a0, $a1, $v0, $v1
func__stringGeq:
	subu $sp, $sp, 12
	sw $ra, 0($sp)
	sw $a0, 4($sp)
	sw $a1, 8($sp)

	jal func__stringLess

	beqz $v0, _skip_compare_equal_in_Geq

	lw $a0, 4($sp)
	lw $a1, 8($sp)
	jal func__stringIsEqual
	xor $v0, $v0, 1

	_skip_compare_equal_in_Geq:
	xor $v0, $v0, 1
	lw $ra, 0($sp)
	addu $sp, $sp, 12
	jr $ra

# string1 in $a0, string2 in $a1
# used $a0, $a1, $v0, $v1
func__stringNeq:
	subu $sp, $sp, 4
	sw $ra, 0($sp)

	jal func__stringIsEqual

	xor $v0, $v0, 1

	lw $ra, 0($sp)
	addu $sp, $sp, 4
	jr $ra
