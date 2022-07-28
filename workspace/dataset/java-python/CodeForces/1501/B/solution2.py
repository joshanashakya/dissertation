for s in [*open(0)][2::2]:
    a = s.split();
    b = [0];
    r = 0
    for x in a: b += -1,;b[max(-len(b), ~int(x))] += 1
    for x in b[:-1]: r += x;print(+(r > 0))
