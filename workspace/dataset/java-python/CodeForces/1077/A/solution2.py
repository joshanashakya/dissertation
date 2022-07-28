for _ in range(int(input())):	n,m,k = map(int,input().split())	d = n-m	if k%2==0:		print(d*(k//2))	else:		print(d*(k//2)+n)
