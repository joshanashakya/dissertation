import math as m t = int(input()) for i in range(t):    a, b = map(int, input().split())    mx, mn = max(a,b), min(a,b)    c = 2 * (mx - mn)    d = 1 ** 2 + 4 * c    ds = m.sqrt(d)    n = (ds - 1) / 2    n = int(n) if int(n) == n else int(n) + 1    n += (n*(n+1)//2) % 2 != (mx - mn) % 2    n += (n*(n+1)//2) % 2 != (mx - mn) % 2    print(n) 