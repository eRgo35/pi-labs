sob program
sob int1
sob int2
sob int3
sob int4

program:
loop:
   pob fill
   wyp 2  
   sob loop  
end:
   stp
   
int1:
   czm mask
   mas 15
   dns
   pob two
   lad loop_int
loop1:
      
   pob one
   dod ascii
   wyp 2
   pzs
   msk mask
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
mask: rpa
ascii: rst 48
loop_int: rpa