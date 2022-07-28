a, m = map(int, input().split())i = 0f = 0while i < m:    if a % m == 0:        print('Yes')        f = 1        break    a += a % m    i += 1 if f == 0:    print('No')
