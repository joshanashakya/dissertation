R = lambda: map(int, input().split())
n, q = R()
a = [0, *R()]
r = sum(a)
for _ in [0] * q:
    t, x = R()
    if t < 2:
        a[x] ^= 1;r += 2 * a[x] - 1
    else:
        print(+(x <= r))
