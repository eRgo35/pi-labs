sob program
sob int1
sob int2
sob int3
sob int4

program:
   pob a
   dod b
   lad a
   wpr 1
   lad b
   pob a
   dod ascii
   wyp 2
   stp

int1:
   czm mask
   mas 15
   dns
   pob st1
   wyp 2
   pzs
   msk mask
   pwr

int2:
   czm mask
   mas 15
   dns
   pob st2
   wyp 2
   pzs
   msk mask
   pwr

int3:
   czm mask
   mas 15
   dns
   pob st3
   wyp 2
   pzs
   msk mask
   pwr

int4:
   czm mask
   mas 15
   dns
   pob st4
   wyp 2
   pzs
   msk mask
   pwr

A: rst 2
B: rst 5
ascii: rst 48
mask: rpa
st1: rst '1'
st2: rst '2'
st3: rst '3'
st4: rst '4'