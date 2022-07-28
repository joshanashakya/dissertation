from math import ceilfor _ in range(int(input())):	L, v, l, r = map(int, input().split())	c = ceil(l / v) - 1	c += (L // v) - ceil(r // v)	print(c)
