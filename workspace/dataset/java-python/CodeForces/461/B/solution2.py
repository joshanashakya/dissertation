mod=10**9+7n=int(input())edges=list(map(int,input().split()))colored=list(map(int,input().split()))childs=[[] for i in range(n)] for i in range(1,n):    childs[edges[i-1]].append(i) dp = [[0,0] for i in range(n)] for i in range(n-1,-1,-1):    prod=1    for child in childs[i]:        prod*=sum(dp[child])    if colored[i]:        dp[i]=[0,prod%mod]    else:        sec=0        for child in childs[i]:            now=dp[child][1]*prod//sum(dp[child])            sec+=now        dp[i]=[prod%mod,sec%mod]  print(dp[0][1])