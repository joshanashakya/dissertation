a, b, c = list(map(int, input().split())) pos = 1for i in range(1000000):	d = (10 * a) // b	a = (10 * a) % b	if c == d:		print(pos)		exit(0)	else:		pos += 1print(-1)
