    pob counter
    lad w_counter
input_loop:
    wpr 1
    ode asterisk
    soz exit_char
    dod asterisk
input_continue:
    // wyp 2 ----debug
    ode cap_A
    som input_end
    dod cap_A
    ode cap_G
    som add_tab
    dod cap_G
input_end:
    sob input_loop
exit_char:
    pob w_counter
    ode one
    soz get_tab_len
    lad w_counter
    pob asterisk
    sob input_continue
add_tab:
    dod cap_G
    lad tab_tmp
    pob lad0
    dod adres
    dod size
    lad lad0
    pob tab_tmp
    sob lad0
add_tab_continue:    
    pob size
    dod one
    lad size
    sob input_end
lad0: 
    lad 0
    pob lad0c
    lad lad0
    sob add_tab_continue 
get_tab_len:
    pob size
    lad w_size
    sdp write
// calc occurs A & C 
tab_loop:
    pob w_size
    ode one
    som end
    lad w_size
    pob pob0
    dod adres
    dod w_size
    lad pob0
    sob pob0
tab_loop_continue:
    ode cap_A
    soz tab_loop_print_A
    dod cap_A
    ode cap_C
    soz tab_loop_print_C
tab_loop_end:
    pob pob0c
    lad pob0
    sob tab_loop
tab_loop_print_A:
    dod cap_A
    wyp 2
    sob tab_loop_end
tab_loop_print_C:
    dod cap_C
    wyp 2
    sob tab_loop_end    
pob0:
    pob 0
    sob tab_loop_continue
end:
   stp

counter: rst 4
w_counter: rpa
w_size: rpa
asterisk: rst 42
one: rst 1
tab_tmp: rpa
lad0c: lad 0
pob0c: pob 0
cap_A: rst 65
cap_C: rst 67
// G musi byc wieksze o 1 bo jest som
cap_G: rst 72

// podprogram "Write"
write: 
    lad liczba
    pob zero
    dns
    pob liczba
    som abs
posit:
    dzi st10
    mno st10
    lad tmp
    pob liczba
    ode tmp
    dod znak0
    dns
    pob tmp
    dzi st10
    soz koncz
    lad liczba
    sob posit
abs:
    pob minus
    wyp 2
    pob zero
    ode liczba
    lad liczba
    sob posit
koncz:
    pzs
    soz wracaj
    wyp 2
    sob koncz
wracaj:
    pwr
zero: rst 0
liczba: rpa
tmp: rpa
st10: rst 10
znak0: rst '0'
minus: rst '-'

// *****
size: rst 0
adres: rst tab
tab: rst 0