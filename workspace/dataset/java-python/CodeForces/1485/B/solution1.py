R = lambda: map(int, input().split())
n, q, k = R()
a = 0, *R()
for _ in [0] * q: l, r = R();print(a[r] - a[l] + (l - r) * 2 + k - 1)
