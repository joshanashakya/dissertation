x, y, z, k = [int(value) for value in input().split()] x, y, z = sorted([x, y, z]) a = min(k // 3, x - 1)
k -= ab = min(k // 2, y - 1)
k -= bc = min(k, z - 1) print((a + 1) * (b + 1) * (c + 1))
