def bs(l, h):    while l <= h:        m = (l + h) // 2        if gf(m) == 0:            return m        if gf(m) == 1:            l = m + 1        else:            h = m - 1 def gf(x):    if (n - x) * (n - x + 1) // 2 - x == k:        return 0    if (n - x) * (n - x + 1) / 2 - x > k:        return 1    return -1  n, k = map(int, input().split())print(bs(0, n))