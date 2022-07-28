from math import gcd


def lcm(a, b):    return (a * b) // gcd(a, b)


i = 0
a, b = map(int, input().split())
first = Falsesecond = False
masha = 0
dasha = 0
while i < lcm(a, b):    if
first: masha += b - (i % b)
i += b - (i % b) elif second: dasha += a - (i % a)
i += a - (i % a)
if i % a == 0 and i % b == 0:        if
a > b: first = True
second = False else:            first = False
second = True elif first: second = True
first = False else:        first = True
second = False
if masha > dasha:
    print("Dasha")elif dasha > masha:
    print("Masha")else:
    print("Equal")
