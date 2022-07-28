 n, m = map(int, input().split())  count = 0for i in range(0, int(n**(1/2)) + 1):	for j in range(0, int(m**(1/2))+1):		if (i**2) + j == n and i + (j**2) == m:			count +=1 print(count)
