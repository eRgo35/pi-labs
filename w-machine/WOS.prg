// wOS version 1.0.0 / build 2022-12-07
// Copyright (c) Michael Czyz All Rights Reserved.
// wOS - system operacyjny dla maszyny W

// HEADER

CALL PRINT

// POST
LDR N0

STR AX
STR BX
STR CX
STR DX

ADD N1
SUB N1
IMUL N1

END:
  JMP END

END

PRINT:


// STORAGE REGISTERS

AX: RPA
BX: RPA
CX: RPA
DX: RPA

// BASIC INTEGERS

N0: RST 0
N1: RST 1
N2: RST 2
N3: RST 3
N5: RST 5
N7: RST 7

// CHARMAP

LF: RST 10
SP: RST 32

  RST 'w'
  RST 'O'
  RST 'S'
  RST ' '
  RST '1'
  RST '.'
  RST '0'
  RST '.'
  RST '0'
  RST 10
  RST 'H'
  RST 'e'
  RST 'l'
  RST 'l'
  RST 'o'
  RST '!'