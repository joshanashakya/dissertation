def mypow(a,b):	base=a 	res=1	while b:		if b&1:			res*=base		base*=base		b>>=1	return resdef sol(n):	sum=mypow(10,n-1)	for i in range(sum,sum + 210+1,1):		if i%210==0:			return in=int(input())if n<3:	print(-1)else:	print(sol(n))