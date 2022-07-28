for s in [*open(0)][1:]: n, k = map(int, s.split());k -= 1;print((k + n % 2 * k // (n // 2)) % n + 1)
