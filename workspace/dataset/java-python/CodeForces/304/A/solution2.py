from math import sqrtn=int(input())count=0for i in range(1,n+1):	for j in range(i,n+1):		c=i**2 + j**2		if sqrt(c)==int(sqrt(c)) and sqrt(c)<=n:			count+=1print(count)
