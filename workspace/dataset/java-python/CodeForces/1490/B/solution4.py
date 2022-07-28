for i in [*open(0)][2::2]:
    q = [0] * 3
    for _ in map(int, i.split()): q[_ % 3] += 1
    print(max(q[i] - q[i - 1] for i in (0, 1, 2)))
