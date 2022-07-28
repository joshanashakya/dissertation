n=int(input())x=n%7 while x%4:	x=x+7 if(x>n):	print(-1)else:	print('4'*(x//4)+'7'*((n-x)//7))
