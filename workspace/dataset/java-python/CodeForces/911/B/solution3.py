def bs(l, h):    while l < h:        m = (l + h + 1) // 2        if gf(m):            l = m        else:            h = m - 1    return l def gf(x):    return a // x + b // x >= n n, a, b = map(int, input().split())print(bs(0, min(a, b)))
