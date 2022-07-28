s = input() dp = [0, 0, 0] for i in s:    if i == "a":        dp[2] = max(dp)+1        dp[0] += 1    else:        dp[1] = max(dp[0], dp[1])+1print(max(dp))
