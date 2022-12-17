pob n
som neg_end
ode two
som one_end
pob n
dns
ode one
lad nn
lad i
loop:
   pob i
   ode one
   lad i
   som std_end
   dns
   sdp mul
   pzs
   lad res
   dns
   sob loop

one_end:
   pob one
   lad res
   sob end   

neg_end:
   sob end

std_end:
   pzs
   lad res
   sob end

end:
   stp

mul:
   pob nul
   lad pab
   pzs
   lad path
   pzs
   soz m_end
   lad pb
   pzs
   soz m_end
   lad pa
   lad pi
m_loop:
   pob pi
   ode one
   soz m_end
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

n: rst 4
res: rst 0
one: rst 1
two: rst 2
nul: rst 0
nn: rpa
i: rpa

path: rpa
pi: rpa
pa: rpa
pb: rpa
pab: rpa