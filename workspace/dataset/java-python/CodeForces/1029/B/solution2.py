n=int(input())l=list(map(int,input().split()))dp=[0]*ndp[0]=1for i in range(1,n):    if 2*l[i-1]>=l[i]:        dp[i]=dp[i-1]+1    else:        dp[i]=1print(max(dp))    
