pob length
soz end2
lad counter
pob ins
lad backup
pob tab
lad max
loop:
   pob counter
   ode one
   som end
   lad counter
ins: 
   pob tab
   ode max
   som skip
   dod max
   lad max
fin:
   pob ins
   dod one
   lad ins
   sob loop

skip:
   sob fin

end:
   pob backup
   lad ins
   pob max
end2:
   stp

one: rst 1
length: rst 8
max: rpa
backup: rpa
counter: rpa
tab: rst -56
     rst -56
     rst -5
     rst 1
     rst -10
     rst -1
     rst 10
     rst -54