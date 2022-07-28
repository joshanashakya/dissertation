t = int(input())for i in range(t):	n = int(input())	sa = (1 << n)	for i in range(1, n // 2):		sa += (1 << i)	sb = 0	for i in range(n // 2, n):		sb += (1 << i)	print(abs(sb - sa))
