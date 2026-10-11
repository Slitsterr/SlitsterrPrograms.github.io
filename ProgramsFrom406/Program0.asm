; Programming Assignment 0
; Student Name:
; UT Eid:
; You are given three inputs A, B and C stored respectively at addresses, 
;    x30F0, x30F1 and x30F2. 
; Your job is to perform the following operations and store the results at address specified:
; X = A OR B               (store X at x30F4)
; Y = A XOR B              (store Y at x30F5)
; Z = NOT(A OR B OR C)     (store Z at x30F6)
; W = NOT(A) AND NOT(B) AND NOT(C) (store W at x30F7)
; Sum = A + B + C          (store Sum at x30F8)
; Diff= A - B - C          (store Diff at x30f9) 

	.ORIG	x3000
    LD R0 #239 ;A
    LD R1 #239 ;B
    LD R2 #239 ;C
    LD R3 #239 
    NOT R0 R0
    NOT R1 R1
    AND R3 R0 R1
    NOT R3 R3
    ST R3 #235 ;X
    LD R4 #233
    NOT R0 R0
    NOT R1 R1
    AND R4 R1 R0
    NOT R4 R4
    AND R4 R4 R3
    NOT R0 R0
    NOT R1 R1
    ST R4 #227 ;Y
    LD R5 #224
    NOT R2 R2
    AND R5 R0 R1
    AND R5 R2 R5
    ST R5 #223 ;Z
    ST R5 #223 ;W
    LD R6 #218
    NOT R0 R0
    NOT R1 R1
    NOT R2 R2
    ADD R6 R0 R1
    ADD R6 R6 R2
    ST R6 #217 ;SUM
    LD R7 #211
    NOT R1 R1
    ADD R1 R1 #1
    NOT R2 R2
    ADD R2 R2 #1
    ADD R7 R0 R1
    ADD R7 R7 R2
    ST R7 #210;DIF
    TRAP x25
	.END

; Example test cases here
    .ORIG	x30F0
;    .FILL   x0001     ; A
;    .FILL   x0001     ; B
;    .FILL	 x0001     ; C
;    .FILL   x00AA     ; A
;    .FILL   x0055     ; B
;    .FILL	 x0022     ; C
    .FILL   x0ABC     ; A
    .FILL   xDEF0     ; B
    .FILL	x1234     ; C
    .FILL   x0000     ; Barrier
    .BLKW   #1        ; X
    .BLKW   #1        ; Y
    .BLKW   #1        ; Z
    .BLKW   #1        ; W
    .BLKW   #1        ; Sum
    .BLKW   #1        ; Diff
	.END
	
