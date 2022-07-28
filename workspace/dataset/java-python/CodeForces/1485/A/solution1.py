for s in [*open(0)][1:]:
    a, b = map(int, s.split());
    n = b;
    r = 99
    while n - b < r:
        m = a;
        i = 0
        if n > 1:
            while m: i += 1;m //= n
            r = min(r, n - b + i)
        n += 1
    print(r)
