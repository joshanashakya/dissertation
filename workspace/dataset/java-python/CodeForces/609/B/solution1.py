n,m=map(int,input().split()) a=list(map(int,input().split()))result=0for i in range(m):	count=a.count(i+1)	result+=count*(n-count)print(result//2)
