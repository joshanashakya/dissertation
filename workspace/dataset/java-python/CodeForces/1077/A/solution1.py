for x in range(int(input())):	a,b,k=map(int,input().split())	pos=0	if k%2==0:		pos=a*k//2-b*k//2	else:		pos=a*(k//2+1)-b*(k//2)	print(pos)
