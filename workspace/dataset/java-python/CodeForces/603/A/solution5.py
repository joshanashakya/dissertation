from sys import stdin,stdoutnmbr = lambda: int(stdin.readline())lst = lambda: list(map(int,stdin.readline().split()))for _ in range(1):#nmbr()):    n=nmbr()    a=[int(ch) for ch in input()]    n=len(a)    dp=[[[0 for _ in range(2)]for _ in range(3)]for _ in range(n)]    dp[0][0][a[0]]=1    dp[0][0][1^a[0]]=0    dp[0][1][a[0]]=1    dp[0][1][1^a[0]]=1    dp[0][2][a[0]]=1    dp[0][2][1^a[0]]=1    for i in range(1,n):        dp[i][0][a[i]] = max(1+dp[i-1][0][1^a[i]],dp[i-1][0][a[i]])        dp[i][0][1 ^ a[i]] = 0#dp[i-1][0][1^a[i]]        dp[i][1][a[i]] = max(dp[i-1][0][a[i]],1+dp[i-1][0][1^a[i]])#max(dp[i-1][1][a[i]],dp[i-1][0][a[i]],1+dp[i-1][0][1^a[i]])        dp[i][1][1 ^ a[i]] = max(dp[i-1][1][a[i]]+1,dp[i-1][0][a[i]]+1,dp[i-1][0][1^a[i]])        dp[i][2][a[i]] = max(dp[i-1][2][1^a[i]]+1,dp[i-1][1][1^a[i]])        dp[i][2][1 ^ a[i]] = dp[i-1][1][a[i]]+1    ans=0    # print(*dp,sep='\n')    for i in range(3):        for j in range(2):            ans=max(ans,dp[n-1][i][j])    print(ans)