for s in [*open(0)][2::2]:
    a = *map(int, s.split()),;
    i = len(a)
    for x, j in sorted(zip(a, range(i)))[::-1]: print(*a[j:i]);i = min(i, j)
