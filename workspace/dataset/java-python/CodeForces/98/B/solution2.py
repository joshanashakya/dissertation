import math

n = int(input())
y = 0
while ((n % 2) == 0):
    y += 1
    n //= 2
if (n == 1):
    print(str(y) + "/1")
else:
    i = 1
    r = 1
    p = 0
    nu = 0
    de = 1
    f = True
    while (r > 1 or f):
        f = False
        r *= 2
        de *= 2
        nu *= 2
        if (r >= n):
            nu += (r * (i - p))
            p = i
            r -= n
        i += 1
    if (r == 1):
        nu *= de
        de *= (de - 1)
    nu += (y * de)
    o = math.gcd(nu, de)
    nu //= o
    de //= o
    print(str(nu) + '/' + str(de))
