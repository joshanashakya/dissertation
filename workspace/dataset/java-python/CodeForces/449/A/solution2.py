n, m, k = map(int, input().split())if k <= n + m - 2:    x1 = min(k + 1, n)    y1 = k + 2 - x1    a = (n // x1) * (m // y1)    y2 = min(k + 1, m)    x2 = k + 2 - y2    b = (n // x2) * (m // y2)    print(max(a, b))else:    print(-1)
