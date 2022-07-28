n,k=map(int,input().split())m=list(map(int,input().split()))a={}c=0d=0b=sum(m[:k])for i in range(n-k+1):	b=b+c-d	a[b]=i+1	d=m[i]	c=m[i+k-1*(i==n-k)]print(a[min(a)])
