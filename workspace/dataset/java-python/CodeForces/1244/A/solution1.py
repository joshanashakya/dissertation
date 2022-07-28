n=int(input())import math as mfor i in range(n):	a,b,c,d,k=map(int,input().split())	e=m.ceil(a/c)	f=m.ceil(b/d)	if e+f<=k:		print(e,f)	else:		print(-1)
