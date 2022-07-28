from fractions import *

n = int(input())
l = 0
while (n % 2 == 0):
    n = n // 2
    l = l + 1
if (n == 1):
    print('%d/1' % l)
else:
    s = 1
    t = 1
    for i in range(n):
        t = t * 2 % n
        s *= 2
        if (t == 1):
            m = i + 1
            # print(s)
            break
    r, t, i, ans = s, s * n, l, 0
    while (r > 1):
        i, t = i + 1, t // 2
        if (r - t > 0):
            r, ans = r - t, ans + i * t
    print((Fraction(ans, s) + Fraction(m, s)) / (1 - Fraction(1, s)))
