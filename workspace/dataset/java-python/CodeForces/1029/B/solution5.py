n, c, m = input(), 1, 1a = [int(x) for x in input().split()]for i in range(len(a)-1):	if a[i]*2 < a[i+1]:		c, m = 1, max(m,c)	else:		c += 1print(max(m,c))
