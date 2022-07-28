p, y = map(int, input().split()) def div(n):	for i in range(2, int(n ** (1 / 2)) + 1):		if n % i == 0:			return i	return n while y > p:	if div(y) > p:		print(y)		break	y -= 1 if y <= p:	print(-1)
