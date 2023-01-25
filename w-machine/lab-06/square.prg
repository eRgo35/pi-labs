sob program
sob int1
sob int2
sob int3
sob int4

program:
   pob size
   lad h_size
loop:
   ode one
   som end_loop
   lad w_size
   pob fill
   wyp 2  
   pob w_size
   sob loop
end_loop:
   pob h_size
   ode one
   soz end
   lad h_size
   pob line_feed
   wyp 2
   pob size
   sob loop   
end:
   stp
   
int1:
   czm mask
   mas 15
   dns
   pob one
   dod ascii
   wyp 2
   pzs
   msk mask
   pzs
   stp
   
int2:
   czm mask
   mas 15
   dns
   pob two
   dod ascii
   wyp 2
   pzs
   msk mask
   pwr
   
int3:
   czm mask
   mas 15
   dns
   pob three
   dod ascii
   wyp 2
   pzs
   msk mask
   pwr
   
int4:
   czm mask
   mas 15
   dns
   pob four
   dod ascii
   wyp 2
   pzs
   msk mask
   pwr

one: rst 1
two: rst 2
three: rst 3
four: rst 4
fill: rst 37
size: rst 10
line_feed: rst 10
w_size: rpa
h_size: rpa
mask: rpa
ascii: rst 48