t = int(input()) from math import floor, ceil def func(x, d):    return x + d / (x + 1) for _ in range(t):    n, d = map(int, input().split())     l, r = 0, n     while (r - l > 0.00001):        a = l + (r - l) / 3        b = l + 2 * (r - l) / 3         if (func(a, d) < func(b, d)):            r = b        else:            l = a        f = floor(l) + ceil(d / (floor(l) + 1))    c = ceil(l) + ceil(d / (ceil(l) + 1))     if (min(f, c) <= n): print('YES')    else: print('NO')