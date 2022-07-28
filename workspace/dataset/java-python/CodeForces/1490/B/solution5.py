for s in [*open(0)][2::2]:
    c = [0] * 3;
    r = i = 0
    for x in s.split(): c[int(x) % 3] += 1
    while len({*c}) > 1: j = (i + 1) % 3;f = c[i] > c[j];c[i] -= f;c[j] += f;r += f;i = j
    print(r)
