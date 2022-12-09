_pre_config:
mov ax nul
mov bx nul
mov cx nul
mov dx nul
ldr nul
ldx nul
ldy nul 

_start:
mov ax, x
neg ax
mov bx ax
neg ax
mov cx ax
end

_data:
x: rst 5
y: rst 8
res: rpa

_post_config:
nul: rst 0
ax: rpa
bx: rpa
cx: rpa
dx: rpa
di: rpa
sp: rpa
bp: rpa