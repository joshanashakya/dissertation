import sys n = int(input())a = list(map(int, input().split()))dp = [[-10**9, -10**9] for _ in range(n+1)]dp[0][0] = 0 for i, x in enumerate(a):    if x == 0:        dp[i+1][0] = dp[i][0]+1        dp[i+1][1] = dp[i][1]    else:        dp[i+1][0] = dp[i][0]        dp[i+1][1] = max(dp[i][0], dp[i][1]) + 1 print(max(dp[-1]))