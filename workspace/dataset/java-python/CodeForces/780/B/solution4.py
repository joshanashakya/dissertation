def f(t):    a = (x[0] - v[0] * t) * 1.0    b = (x[n - 1] + v[n - 1] * t) * 1.0     for i in range(n):        if x[i] - v[i] * t > a:            a = x[i] - v[i] * t        if x[i] + v[i] * t < b:            b = x[i] + v[i] * t     #print(a, b)             return a <= b         n = int(input())x = list(map(int, input().split()))v = list(map(int, input().split())) inf = 1000000000.0 l = 0r = inf while r - l > 1e-6:    m = (l + r) / 2    if f(m):        r = m    else:        l = m print(r)