n,a,b = map(int,input().split())c = []if a* b < n:	print(-1)else:	for x in range(1,n + 1):		c.append(str(x))	for x in range((a * b) - n):		c.append("0")	for x in range(1, a+1):		e = ""		if x % 2 != 0:			for x in range(b):				if x != b - 1:					e += c[0] + " "				else:e += c[0]				c.pop(0)			e.strip()			print(e)		else:			for x in range(b,0,-1):				if x != 1:					e += c[x -1] + " "				else:e += c[x - 1]				c.pop(x - 1)			e.strip()			print(e)