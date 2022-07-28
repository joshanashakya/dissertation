for x in range(int(input())):	a,b=map(int,input().split())	mi=min(a,b)	ma=max(a,b)	if 2*mi<ma:		print(ma**2)	else:		print((mi*2)**2)
