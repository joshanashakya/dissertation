n, a, b = int(input()), 0, 0d = {-1: 0, 1: 1}s = 1arr = list(map(int, input().split()))for c in arr:    c //= abs(c)    s *= c    a += d[s]    b += d[-s]    d[s] += 1print(b, a)
