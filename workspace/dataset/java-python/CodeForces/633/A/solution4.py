a,b,c=map(int,input().split())g=c//min(a,b)+1flag=0for i in range(g+1):	for j in range(g+1):		if a*i+b*j==c:			flag=1			breakif flag:	print("Yes")else:	print("No")
