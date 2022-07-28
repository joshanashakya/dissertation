n = int(input())inp = inputs = ''a,g = 0,0for i in range(n):	x,y = map(int, inp().split())	if a+x-g <= 500:		a+=x		s += 'A'	else:		g+=y		s += 'G'if abs(a-g)<=500:	print(s)else:	print(-1)
