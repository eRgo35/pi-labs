pob a
dns
pob b
dns
sdp mul
pzs
lad res
stp

mul:
   pzs
   lad path
   pzs
   lad pb
   soz m_end
   pzs
   lad pa
   soz m_end
   lad pi
m_loop:
   pob pi
   ode one
   som m_end
   lad pi
   pob pab
   dod pa
   lad pab
   sob m_loop

m_end:
   pob pab
   dns
   pob path
   dns
   pwr

path: rpa
pi: rpa
pa: rpa
pb: rpa
pab: rpa
one: rst 1
two: rst 2

a: rst 1
b: rst 1
res: rpa