x, y, z, k = map(int, input().split()) x, y, z = sorted((x, y, z)) a = min(k // 3, x - 1) b = min((k - a) // 2,
                                                                                                  y - 1) c = min(
    k - a - b, z - 1) print((a + 1) * (b + 1) * (c + 1))
