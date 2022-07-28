R = lambda: map(int, input().split())
t, = R()
while t:
    t -= 1;
    n, = R();
    a = [];
    b = [];
    s = 0
    for _ in [0] * n: x, y = R();a += x,;b += y,
    for x, y, z, w in zip(a, b, [0] + b, R()): p = s + x - z + w;s = p + max(y - x + 1 >> 1, y - p)
    print(p)
