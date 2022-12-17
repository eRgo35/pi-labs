pob length
lad inc
pob tab
lad backup
loop:
   pob inc
   ode one
   som end
   lad inc
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
   pob backup
   lad tab
   pob max
   stp

one: rst 1
length: rst 8
tab: rst -56
     rst -56
     rst -5
     rst -1
     rst -10
     rst -1
     rst -53
     rst -54
inc: rpa
max: rpa
backup: rpa  