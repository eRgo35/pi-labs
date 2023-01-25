sob setup
sob int1
sob int2
sob int3
sob int4

setup:
   pob stp_int_1_2
   lad w_stp_int_1
   lad w_stp_int_2
   pob stp_int_3_4
   lad w_stp_int_3
   lad w_stp_int_4
program:
loop:
   pob fill
   wyp 2  
   sob loop  
end:
   stp
   
int1:
   czm mask_1
   mas 15 
   dns
   pob two
   lad loop_int_1
loop1:
   ode one
   som end1
   lad loop_int_1   
   pob one
   dod ascii
   wyp 2
   pob loop_int_1
   sob loop1
end1:
   pob w_stp_int_1
   ode one
   soz terminate
   lad w_stp_int_1   
   pzs
   msk mask_1
   pwr
   
int2:
   czm mask_2
   mas 7
   dns
   pob four
   lad loop_int_2
loop2:
   ode one
   som end2
   lad loop_int_2   
   pob two
   dod ascii
   wyp 2
   pob loop_int_2
   sob loop2
end2:
   pob w_stp_int_2
   ode one
   soz terminate
   lad w_stp_int_2   
   pzs
   msk mask_2
   pwr
   
int3:
   czm mask_3
   mas 3
   dns
   pob three
   dod three
   lad loop_int_3
loop3:
   ode one
   som end3
   lad loop_int_3   
   pob three
   dod ascii
   wyp 2
   pob loop_int_3
   sob loop3
end3:
   pob w_stp_int_3
   ode one
   soz terminate
   lad w_stp_int_3    
   pzs
   msk mask_3
   pwr
   
int4: 
   czm mask_4
   mas 1
   dns
   pob four
   dod four
   lad loop_int_4
loop4:
   ode one
   som end4
   lad loop_int_4   
   pob four
   dod ascii
   wyp 2
   pob loop_int_4
   sob loop4
end4:
   pob w_stp_int_4
   ode one
   soz terminate
   lad w_stp_int_4   
   pzs
   msk mask_4
   pwr

terminate:
   pzs
   mas 0
   stp

one: rst 1
two: rst 2
three: rst 3
four: rst 4
fill: rst 37
mask_1: rpa
mask_2: rpa
mask_3: rpa
mask_4: rpa
ascii: rst 48
loop_int_1: rpa
loop_int_2: rpa
loop_int_3: rpa
loop_int_4: rpa
stp_int_1_2: rst 3
stp_int_3_4: rst 6
w_stp_int_1: rpa
w_stp_int_2: rpa
w_stp_int_3: rpa
w_stp_int_4: rpa