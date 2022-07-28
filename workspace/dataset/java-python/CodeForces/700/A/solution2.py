n, l, v1, v2, k = map(int, input().split())diff = v2 - v1n = (n + k - 1) // k * 2p1 = (n * v2 - diff) * lp2 = (n * v1 + diff) * v2print(p1 / p2)
