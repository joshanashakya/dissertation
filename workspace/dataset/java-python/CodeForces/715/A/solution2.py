import mathn = int(input())al = 2for i in range(1,n+1):	ai = (i*i+i)**2;	res= (ai -al)//i;	al = (i*i+i)	print(int(res))
