pob n
lad i
pob tab
lad tmp
loop:
   pob i
   ode one
   som end
   lad i
ins:
   pob tab 
   ode max
   som bck
   dod max
   lad max
bck:
   pob ins
   dod one
   lad ins
   sob loop

end:
   pob tmp
   lad tab
   pob max
   stp

one: rst 1
n: rst 8
tab: rst 1
     rst 5
     rst 1
     rst 8
     rst 55
     rst 4
     rst 7
     rst 11
i: rpa
max: rst 0
tmp: rpa  