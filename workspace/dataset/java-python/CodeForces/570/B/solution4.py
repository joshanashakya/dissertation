n, m = map(int, input().split())a = min(m + 1, n)b = max(m - 1, 1)a = (n - a + 1) - (m == n)b = b - (m == 1)if b >= a:    print(max(m - 1, 1))else:    print(min(m + 1, n))
