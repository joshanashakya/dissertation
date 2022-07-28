oro_infinito = False datos = input().split()
a = int(datos[0])
b = int(datos[1])
c = int(datos[2])
d = int(datos[3])
e = int(datos[4])
f = int(datos[5]) if a != 0 and b != 0 and c != 0 and d != 0 and e != 0 and f != 0:    if
(b / a) * (d / c) * (f / e) > 1: oro_infinito = Trueelse:    if c == 0 and d > 0:
    oro_infinito = True    elif a == 0 and b > 0 and c > 0 and d > 0:
    oro_infinito = True    elif e == 0 and f > 0 and a > 0 and b > 0 and c > 0 and d > 0:
    oro_infinito = True if oro_infinito:
    print('Ron')else:
    print('Hermione')
