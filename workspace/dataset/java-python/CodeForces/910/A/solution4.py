nd = input().split()n = int(nd[0])d = int(nd[1])s = input()dp = [-1]*ndp[0] = 0 for i in range(1,n): if s[i]=='0':  dp[i] = -1 else:  dp[i] = 999999999  for j in range (1,d+1):   if j>i:    break   if dp[i]>dp[i-j] and dp[i-j]>-1:    dp[i] = dp[i-j]  dp[i]+=1 if dp[n-1]==1000000000: print(-1)else: print(dp[n-1])