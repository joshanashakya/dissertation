n=int(input())a=list(map(int,input().split()))a.sort()c=0for i in range(1,n,2):	if a[i-1]!=a[i]:		c+=(a[i]-a[i-1])print(c)
