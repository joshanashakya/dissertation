import math as mt = int(input())for z in range(t):	a,b,c = list(map(int, input().split()))		if c == a:		print(f'-1 {b}')	elif c > a:		print(1,end=' ')		if a*b > c:			print(b)		else:			print(-1)	else:		if a*b < c:			print(b,end=' ')		else:			print(-1,end=' ')		print(1) 	