n, k = map(int, input().split())a, b = map(int, input().split())l = 0 for _ in range(1, n):    x, y = map(int, input().split())    l += ((x - a)**2 + (y - b)**2)**0.5    a, b = x, y print(l*k/50)
