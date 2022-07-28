n = int(input())count = 1divisor = nfor i in range(2, n + 1):	if i * i > n:		break	if n % i == 0:		while n % i == 0:			n //= i		if n == 1:			print(i)		else:			print(1)		exit(0)print(n)
