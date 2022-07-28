def func(n):	return (n*(n+1))//2for _ in range(int(input())):	a,b = map(int,input().split())	n = 0	while (func(n)+a+b)%2!=0 or (func(n)+a+b)<(2*max(a,b)):		n+=1	print(n)
