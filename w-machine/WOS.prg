_pre_config:
mov ax nul
mov bx nul
mov cx nul
mov dx nul
mov di nul
mov sp nul
mov bp nul
ldr nul
ldx nul
ldy nul

_start:
mov ax x
not ax
ldr ax
printf 2
end

_data:
x:
   rst 10


_post_config:
nul: rst 0
ax: rpa
bx: rpa
cx: rpa
dx: rpa
di: rpa
sp: rpa
bp: rpa