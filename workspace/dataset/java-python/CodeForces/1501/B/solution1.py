for s in [*open(0)][2::2]:
    b = [0];
    r = 0
    for x in s.split(): b += -1,;b[max(-len(b), ~int(x))] += 1
    for x in b[:-1]: r += x;print(+(r > 0))
