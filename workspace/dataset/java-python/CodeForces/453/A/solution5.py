from math import pow m, n = map(int, input().split())r = 0for i in range(m):    r += (i + 1) * (pow((i + 1) / m, n) - pow(i / m, n))print(r)
