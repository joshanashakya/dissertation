from collections import deque n = int(input())a = [int(i) for i in input().split()]b = [0, 0]x, y = 0, n - 1for i in range(n):	if a[x] > a[y]:		b[i % 2] += a[x]		x += 1	else:		b[i % 2] += a[y]		y -= 1print(*b, sep = ' ')
