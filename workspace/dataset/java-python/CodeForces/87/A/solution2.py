def mcd(a, b):    while


b != 0: a, b = b, a % b
return a datos = input().split()
d = int(datos[0])
m = int(datos[1]) mcd = mcd(d, m)
if abs(d - m) == 1 or d - m == mcd or m - d == mcd:
    print('Equal')elif d - m > 0:
    print('Masha')else:
    print('Dasha')
