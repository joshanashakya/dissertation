a=list(map(int, input().split()))b=list(map(int, input().split())) sum=0for x in range(3):	tmp=a[x]-b[x]	if tmp>=0:		sum+=tmp//2;	else:		sum+=tmpif sum>=0:	print("Yes")else:	print("No")
