t = int(input()) for tc in range(t):    a, b, x, y, n = map(int, input().split())
a1, b1, n1 = a, b, n
a2, b2, n2 = a, b, n     if n1 > (a1 - x):        n1 -= (a1 - x)
a1 -= (a1 - x)
if n1 > (b1 - y):            b1 -= (b1 - y)
n1 -= (b1 - y) else:            b1 -= n1 else:        a1 -= n1
n1 = 0     if n2 > (b2 - y):        n2 -= (b2 - y)
b2 -= (b2 - y)
if n2 > (a2 - x):            a2 -= (a2 - x)
n2 -= (a2 - x) else:            a2 -= n2 else:        b2 -= n2
n2 = 0     print(min(a1 * b1, a2 * b2)) 
