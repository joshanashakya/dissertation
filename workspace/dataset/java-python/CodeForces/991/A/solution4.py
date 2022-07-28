a, b, c, n = map(int, input().split())s = a + b - cif s >= n or a < c or b < c:    print(-1)else:    print(n - s)
