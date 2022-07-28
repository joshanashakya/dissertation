for s in [*open(0)][1:]: n, k = map(int, s.split());print(n - k + k // 2, *range(k + 1 >> 1, k), *range(k + 1, n + 1))
