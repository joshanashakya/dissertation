for z in [*open(0)][2::2]:
    s, a = 0, 'YES'
    for i, j in enumerate(z.split()):
        s += int(j) - i
        if s < 0: a = 'NO'
    print(a)
