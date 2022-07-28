n=int(input())p=list(map(int,input().split()))dp=[0]*(n+1)dp[1]=2for i in range(2,n+1):	c=0	for j in range(p[i-1],i):		c+=dp[j]	dp[i]=c+2print(sum(dp)%(10**9+7))
