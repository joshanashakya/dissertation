for s in [*open(0)][2::2]:
    i = t = f = 0
    for x in s.split(): t += int(x) - i;f |= t < 0;i += 1
    print('YNEOS'[f::2])
