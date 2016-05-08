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
li $a0, 0
syscall
move $t9, $v0
addi $t0, $sp, -20
sw $t0, -16($sp)
li $s0, 10000
lw $t0, -16($sp)
sw $s0, ($t0)
addi $t0, $sp, -28
sw $t0, -24($sp)
lw $s0, -16($sp)
lw $s0, ($s0)
lw $t0, -24($sp)
sw $s0, ($t0)
addi $t0, $sp, -36
sw $t0, -32($sp)
li $s0, 0
lw $t0, -32($sp)
sw $s0, ($t0)
addi $t0, $sp, -44
sw $t0, -40($sp)
lw $s0, -32($sp)
lw $s0, ($s0)
lw $t0, -40($sp)
sw $s0, ($t0)
addi $t0, $sp, -52
sw $t0, -48($sp)
li $s0, 2800
lw $t0, -48($sp)
sw $s0, ($t0)
addi $t0, $sp, -60
sw $t0, -56($sp)
lw $s0, -48($sp)
lw $s0, ($s0)
lw $t0, -56($sp)
sw $s0, ($t0)
addi $t0, $sp, -68
sw $t0, -64($sp)
li $s0, 0
lw $t0, -64($sp)
sw $s0, ($t0)
addi $t0, $sp, -76
sw $t0, -72($sp)
lw $s0, -64($sp)
lw $s0, ($s0)
lw $t0, -72($sp)
sw $s0, ($t0)
addi $t0, $sp, -84
sw $t0, -80($sp)
li $s0, 0
lw $t0, -80($sp)
sw $s0, ($t0)
addi $t0, $sp, -92
sw $t0, -88($sp)
lw $s0, -80($sp)
lw $s0, ($s0)
lw $t0, -88($sp)
sw $s0, ($t0)
addi $t0, $sp, -100
sw $t0, -96($sp)
addi $t0, $sp, -108
sw $t0, -104($sp)
li $s0, 2801
lw $t0, -104($sp)
sw $s0, ($t0)
lw $s0, -104($sp)
lw $s0, ($s0)
move $s1, $s0
mul $s0, $s0, 4
addi $s0, $s0, 4
move $a0, $s0
li $v0, 9
syscall
move $s2, $v0
sw $s1, ($s2)
addi $s2, $s2, 4
lw $t0, -96($sp)
sw $s2, ($t0)
addi $t0, $sp, -116
sw $t0, -112($sp)
lw $s0, -96($sp)
lw $s0, ($s0)
lw $t0, -112($sp)
sw $s0, ($t0)
addi $t0, $sp, -124
sw $t0, -120($sp)
li $s0, 0
lw $t0, -120($sp)
sw $s0, ($t0)
addi $t0, $sp, -132
sw $t0, -128($sp)
lw $s0, -120($sp)
lw $s0, ($s0)
lw $t0, -128($sp)
sw $s0, ($t0)
for_judge_0:
addi $t0, $sp, -140
sw $t0, -136($sp)
addi $t0, $sp, -148
sw $t0, -144($sp)
lw $s0, -40($sp)
lw $s0, ($s0)
lw $s1, -56($sp)
lw $s1, ($s1)
sub $s0, $s0, $s1
lw $t0, -144($sp)
sw $s0, ($t0)
addi $t0, $sp, -156
sw $t0, -152($sp)
li $s0, 0
lw $t0, -152($sp)
sw $s0, ($t0)
lw $s0, -144($sp)
lw $s0, ($s0)
lw $s1, -152($sp)
lw $s1, ($s1)
sne $s2, $s0, $s1
lw $t0, -136($sp)
sw $s2, ($t0)
lw $s0, -136($sp)
lw $s0, ($s0)
beqz $s0, for_end_0
for_start_0:
addi $t0, $sp, -164
sw $t0, -160($sp)
addi $t0, $sp, -172
sw $t0, -168($sp)
li $s0, 5
lw $t0, -168($sp)
sw $s0, ($t0)
lw $s0, -24($sp)
lw $s0, ($s0)
lw $s1, -168($sp)
lw $s1, ($s1)
div $s0, $s0, $s1
lw $t0, -160($sp)
sw $s0, ($t0)
addi $t0, $sp, -180
sw $t0, -176($sp)
lw $s0, -112($sp)
lw $s0, ($s0)
lw $t0, -176($sp)
sw $s0, ($t0)
addi $t0, $sp, -188
sw $t0, -184($sp)
lw $s0, -40($sp)
sw $s0, -184($sp)
lw $s0, -184($sp)
lw $s0, ($s0)
addi $s0, $s0, 1
lw $t0, -184($sp)
sw $s0, ($t0)
lw $s0, -176($sp)
lw $s0, ($s0)
lw $s1, -184($sp)
lw $s1, ($s1)
mul $s1, $s1, 4
add $s0, $s0, $s1
sw $s0, -176($sp)
lw $s0, -160($sp)
lw $s0, ($s0)
lw $t0, -176($sp)
sw $s0, ($t0)
for_todo_0:
j for_judge_0
for_end_0:
for_judge_1:
for_start_1:
addi $t0, $sp, -196
sw $t0, -192($sp)
li $s0, 0
lw $t0, -192($sp)
sw $s0, ($t0)
lw $s0, -192($sp)
lw $s0, ($s0)
lw $t0, -72($sp)
sw $s0, ($t0)
addi $t0, $sp, -204
sw $t0, -200($sp)
addi $t0, $sp, -212
sw $t0, -208($sp)
li $s0, 2
lw $t0, -208($sp)
sw $s0, ($t0)
lw $s0, -56($sp)
lw $s0, ($s0)
lw $s1, -208($sp)
lw $s1, ($s1)
mul $s0, $s0, $s1
lw $t0, -200($sp)
sw $s0, ($t0)
lw $s0, -200($sp)
lw $s0, ($s0)
lw $t0, -128($sp)
sw $s0, ($t0)
addi $t0, $sp, -220
sw $t0, -216($sp)
addi $t0, $sp, -228
sw $t0, -224($sp)
li $s0, 0
lw $t0, -224($sp)
sw $s0, ($t0)
lw $s0, -128($sp)
lw $s0, ($s0)
lw $s1, -224($sp)
lw $s1, ($s1)
seq $s2, $s0, $s1
lw $t0, -216($sp)
sw $s2, ($t0)
lw $s0, -216($sp)
lw $s0, ($s0)
beqz $s0, if_false_0
if_true_0:
j for_end_1
j if_end_0
if_false_0:
if_end_0:
lw $s0, -56($sp)
lw $s0, ($s0)
lw $t0, -40($sp)
sw $s0, ($t0)
for_judge_2:
for_start_2:
addi $t0, $sp, -236
sw $t0, -232($sp)
addi $t0, $sp, -244
sw $t0, -240($sp)
addi $t0, $sp, -252
sw $t0, -248($sp)
lw $s0, -112($sp)
lw $s0, ($s0)
lw $t0, -248($sp)
sw $s0, ($t0)
lw $s0, -248($sp)
lw $s0, ($s0)
lw $s1, -40($sp)
lw $s1, ($s1)
mul $s1, $s1, 4
add $s0, $s0, $s1
sw $s0, -248($sp)
lw $s0, -248($sp)
lw $s0, ($s0)
lw $s1, -24($sp)
lw $s1, ($s1)
mul $s0, $s0, $s1
lw $t0, -240($sp)
sw $s0, ($t0)
lw $s0, -72($sp)
lw $s0, ($s0)
lw $s1, -240($sp)
lw $s1, ($s1)
add $s0, $s0, $s1
lw $t0, -232($sp)
sw $s0, ($t0)
lw $s0, -232($sp)
lw $s0, ($s0)
lw $t0, -72($sp)
sw $s0, ($t0)
addi $t0, $sp, -260
sw $t0, -256($sp)
lw $s0, -128($sp)
lw $s0, ($s0)
addi $s0, $s0, -1
lw $t0, -128($sp)
sw $s0, ($t0)
lw $s0, -72($sp)
lw $s0, ($s0)
lw $s1, -128($sp)
lw $s1, ($s1)
rem $s0, $s0, $s1
lw $t0, -256($sp)
sw $s0, ($t0)
addi $t0, $sp, -268
sw $t0, -264($sp)
lw $s0, -112($sp)
lw $s0, ($s0)
lw $t0, -264($sp)
sw $s0, ($t0)
lw $s0, -264($sp)
lw $s0, ($s0)
lw $s1, -40($sp)
lw $s1, ($s1)
mul $s1, $s1, 4
add $s0, $s0, $s1
sw $s0, -264($sp)
lw $s0, -256($sp)
lw $s0, ($s0)
lw $t0, -264($sp)
sw $s0, ($t0)
addi $t0, $sp, -276
sw $t0, -272($sp)
addi $t0, $sp, -284
sw $t0, -280($sp)
lw $s0, -128($sp)
sw $s0, -280($sp)
lw $s0, -72($sp)
lw $s0, ($s0)
lw $s1, -280($sp)
lw $s1, ($s1)
div $s0, $s0, $s1
lw $t0, -272($sp)
sw $s0, ($t0)
lw $s0, -272($sp)
lw $s0, ($s0)
lw $t0, -72($sp)
sw $s0, ($t0)
lw $s0, -280($sp)
lw $s0, ($s0)
addi $s0, $s0, -1
lw $t0, -280($sp)
sw $s0, ($t0)
addi $t0, $sp, -292
sw $t0, -288($sp)
lw $s0, -40($sp)
lw $s0, ($s0)
addi $s0, $s0, -1
lw $t0, -40($sp)
sw $s0, ($t0)
addi $t0, $sp, -300
sw $t0, -296($sp)
li $s0, 0
lw $t0, -296($sp)
sw $s0, ($t0)
lw $s0, -40($sp)
lw $s0, ($s0)
lw $s1, -296($sp)
lw $s1, ($s1)
seq $s2, $s0, $s1
lw $t0, -288($sp)
sw $s2, ($t0)
lw $s0, -288($sp)
lw $s0, ($s0)
beqz $s0, if_false_1
if_true_1:
j for_end_2
j if_end_1
if_false_1:
if_end_1:
for_todo_2:
addi $t0, $sp, -308
sw $t0, -304($sp)
lw $s0, -72($sp)
lw $s0, ($s0)
lw $s1, -40($sp)
lw $s1, ($s1)
mul $s0, $s0, $s1
lw $t0, -304($sp)
sw $s0, ($t0)
lw $s0, -304($sp)
lw $s0, ($s0)
lw $t0, -72($sp)
sw $s0, ($t0)
j for_judge_2
for_end_2:
addi $t0, $sp, -316
sw $t0, -312($sp)
addi $t0, $sp, -324
sw $t0, -320($sp)
li $s0, 14
lw $t0, -320($sp)
sw $s0, ($t0)
lw $s0, -56($sp)
lw $s0, ($s0)
lw $s1, -320($sp)
lw $s1, ($s1)
sub $s0, $s0, $s1
lw $t0, -312($sp)
sw $s0, ($t0)
lw $s0, -312($sp)
lw $s0, ($s0)
lw $t0, -56($sp)
sw $s0, ($t0)
addi $t0, $sp, -332
sw $t0, -328($sp)
addi $t0, $sp, -340
sw $t0, -336($sp)
addi $t0, $sp, -348
sw $t0, -344($sp)
addi $t0, $sp, -356
sw $t0, -352($sp)
lw $s0, -72($sp)
lw $s0, ($s0)
lw $s1, -24($sp)
lw $s1, ($s1)
div $s0, $s0, $s1
lw $t0, -352($sp)
sw $s0, ($t0)
lw $s0, -88($sp)
lw $s0, ($s0)
lw $s1, -352($sp)
lw $s1, ($s1)
add $s0, $s0, $s1
lw $t0, -344($sp)
sw $s0, ($t0)
lw $a0, -344($sp)
lw $a0, ($a0)
addi $sp, $sp, -360
jal func__toString
addi $sp, $sp, 360
lw $t0, -336($sp)
sw $v0, ($t0)
lw $a0, -336($sp)
lw $a0, ($a0)
addi $sp, $sp, -360
jal func__print
addi $sp, $sp, 360
for_todo_1:
addi $t0, $sp, -364
sw $t0, -360($sp)
lw $s0, -72($sp)
lw $s0, ($s0)
lw $s1, -24($sp)
lw $s1, ($s1)
rem $s0, $s0, $s1
lw $t0, -360($sp)
sw $s0, ($t0)
lw $s0, -360($sp)
lw $s0, ($s0)
lw $t0, -88($sp)
sw $s0, ($t0)
j for_judge_1
for_end_1:
addi $t0, $sp, -372
sw $t0, -368($sp)
addi $t0, $sp, -380
sw $t0, -376($sp)
li $s0, 6
move $a0, $s0
li $v0, 9
syscall
li $s0, 1
sw $s0, ($v0)
addi $v0, $v0, 4
lw $t0, -376($sp)
sw $v0, ($t0)
li $s0, 10
sb $s0, ($v0)
addi $v0, $v0, 1
li $s0, 0
sb $s0, ($v0)
lw $a0, -376($sp)
lw $a0, ($a0)
addi $sp, $sp, -384
jal func__print
addi $sp, $sp, 384
addi $t0, $sp, -388
sw $t0, -384($sp)
li $s0, 0
lw $t0, -384($sp)
sw $s0, ($t0)
lw $v0, -384($sp)
lw $v0, ($v0)
lw $ra, -4($sp)
lw $sp, 0($sp)
jr $ra
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
