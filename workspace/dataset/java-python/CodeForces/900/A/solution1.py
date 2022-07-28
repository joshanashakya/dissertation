n=eval(input())x,y,z=0,0,0for i in range(n):	a,b=map(int,input().split())	if a>0:		x+=1	else:		y+=1	if x>1 and y>1:		print('No')		z=1		breakif z==0:	print('Yes')
