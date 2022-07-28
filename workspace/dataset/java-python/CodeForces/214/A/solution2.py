n, m = map(int, input().split())a = 0b = 0pair = 0 while a <= n:    while b <= m:        if (a ** 2) + b == n and a + (b ** 2) == m:            pair += 1        b += 1    a += 1    b = 0print(pair)
