R = lambda: map(int, input().split())
t, = R()
while t:
    t -= 1;
    n, = R();
    a, b = zip(*(R() for _ in [0] * n));
    s = 0
    for x, y, z, w in zip(a, b, (0, *b), R()): p = s + x - z + w;s = p + max(y - x + 1 >> 1, y - p)
    print(p)
