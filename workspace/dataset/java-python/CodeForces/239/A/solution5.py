y,k,n=map(int,input().split())flag=Truefor i in range(y+(k-(y%k)),n+1,k):	print(i-y,end=' ')	flag=Falseif flag:	print(-1)
