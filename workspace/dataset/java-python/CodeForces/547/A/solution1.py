f = lambda: map(int, input().split())m = int(input()) def g():    h, a = f()    x, y = f()     t = lambda: (h * x + y) % m     s, d = 0, 1    while h != a:        h = t()        s += 1        if s > m:            print(-1)            exit()     h = t()    while h != a:        h = t()        d += 1        if d > m: return s, 0     return s, d def h():    u, x = g()    v, y = g()     k = 0    while u != v:        if u < v:            u += x        else:            v += y        k += 1        if k > 2 * m: return -1    return u print(h())