u = v = 0a, b = input(), input()n, m = len(a), len(b)if n > m: b = '0' * (n - m) + belse: a = '0' * (m - n) + afor i in range(max(n, m)):    u, v = v + u, u + int(a[i]) - int(b[i])    if u > 1:        print('>')        exit(0)    elif u < -1:        print('<')        exit(0)d = 2 * v + uif u == v == 0: print('=')elif u >= 0 and d >= 0: print('>')elif u <= 0 and d <= 0: print('<')else: print('>' if (u * u > v * (v + u)) ^ (u < 0) else '<')
