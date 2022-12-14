check:
   pob a
   soz frac
   ode b
   som frac
   pob b
   soz err
   pob a
loop:
   ode b
   som ret
   sob loop
   
frac:
   pob a
   lad res
   stp

err:
   pob nul
   lad res
   stp

ret:
   dod b
   lad res   
   stp

a: rst 1
b: rst 0
nul: rst 0
one: rst 1
res: rpa