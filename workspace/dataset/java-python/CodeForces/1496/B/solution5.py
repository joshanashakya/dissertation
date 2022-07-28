R = lambda: map(int, input().split())
t, = R()
while t:
    t -= 1;
    n, k = R();
    a = sorted(R());
    i = 0
    for x in a:
        if i < x: break
        i += 1
    print(n + (k > 0) * (i + a[-1] + 1 >> 1 not in a, k)[i > a[-1]])
