for s in [*open(0)][1:]: n, t, = [*map(int, s.split())];t -= 1;print((t + (n & 1) * t // (n // 2)) % n + 1)
