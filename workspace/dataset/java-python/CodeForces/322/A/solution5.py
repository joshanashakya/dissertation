n,m=[int(x) for x in input().split()] a=min(n,m)b=abs(n-m)k=2*a-1+bprint(k)if a==1:	print(1,1)	i=1else:	for i in range(1,a):		print(i,i)		print(i+1,i)	print(i+1,i+1) if n<m:	for i in range(a+1,m+1):		print(a,i)elif n>m:	for i in range(a+1,n+1):		print(i,a)