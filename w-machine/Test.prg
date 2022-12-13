_pre_config:
mov ax nul
mov bx nul
mov cx nul
mov dx nul
ldr nul
ldx nul
ldy nul 

_start:
leaq ax x
end

_data:
arr: 
   rst 'H'
   rst 'e'
   rst 'l'
   rst 'l'
   rst 'o'
   rst ' '
   rst 'W'
   rst 'o'
   rst 'r'
   rst 'l'
   rst 'd'  
i: rst 11
res: rpa
one: rst 1

_post_config:
nul: rst 0
ax: rpa
bx: rpa
cx: rpa
dx: rpa
di: rpa
sp: rpa
bp: rpa