for s in [*open(0)][1:]: n, k = map(int, s.split());k += 1;print(n - k // 2, *range(k >> 1, k - 1), *range(k, n + 1))
