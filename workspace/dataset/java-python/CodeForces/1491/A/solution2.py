R = lambda: map(int, input().split())
n, q = R()
r = sum(a := [0, *R()])
while q:
    q -= 1;
    t, x = R()
    if t < 2:
        a[x] ^= 1;r += 2 * a[x] - 1
    else:
        print(+(x <= r))
