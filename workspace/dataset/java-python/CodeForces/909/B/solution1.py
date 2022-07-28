n = int(input())dp = [0]*101dp[1] = 1dp[2] = 2for i in range(3, 101):    dp[i] = dp[i-2]+iprint(dp[n])
