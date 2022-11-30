// if x > y
POB x
MIN y

LAD z1

// if x < y
POB y
MIN x

LAD z2

// if x = x
POB x
MIN x

LAD z3

STP

x: RST 8
y: RST 3
z1: RST 0
z2: RST 0
z3: RST 0
