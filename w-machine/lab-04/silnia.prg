pob n
lad res
ode one
lad n
soz end

loop:
   pob res
   dns
   pob n
   dns
   sdp imul
   pzs
   lad res
   pob n
   ode one
   soz end
   lad n
   sob loop

end:
   pob res
   stp

imul:
   pzs
   lad dx
   pzs
   lad ax
   pzs
   lad bx
   pob nul
   lad cx
   pob ax
   loop2:
      soz ret
      pob cx
      dod bx
      lad cx
      pob ax
      ode one
      lad ax
      sob loop2
   ret:
      pob cx
      dns
      pob dx
      dns
      pwr

ax: rpa
bx: rpa
cx: rst 0
dx: rpa

n: rst 4
res: rst 0
one: rst 1
nul: rst 0