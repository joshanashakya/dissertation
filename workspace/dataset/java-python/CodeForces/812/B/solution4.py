n,m=map(int,input().split())l=[]for i in range(n):    l.append(input())ans=0dp=[[0,0] for i in range(n)]dp[n-1][0]=0dp[n-1][1]=m+1for i in range(n-1,0,-1):    x=l[i][::-1]    if '1' in l[i]:        a=x.index('1')        b=l[i].index('1')    else:        a=m+1        b=m+1    dp[i-1][0]=min(dp[i][0]+2*(m+1-a)+1,dp[i][1]+m+2)    dp[i-1][1]=min(dp[i][1]+2*(m-b+1)+1,dp[i][0]+m+2)for i in range(n):    if '1' in l[i]:        a=l[i][::-1].index('1')        b=l[i].index('1')        ans=min(dp[i][0]+m+1-a,dp[i][1]+m+1-b)        breakprint(ans)                                
