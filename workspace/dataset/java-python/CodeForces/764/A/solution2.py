n, m, z=map(int, input().split())c = 0for i in range(m, z+1, m):	if i%n == 0:		c += 1print(c)
