s = ' '+input()dp = [[0,0,0]for i in range(len(s)+5)]i = 0while i<len(s)-1:    i += 1    if s[i]=='a':        dp[i][0] = dp[i-1][0] + 1        dp[i][1] = dp[i-1][1]        dp[i][2] = max(dp[i-1][0],dp[i-1][1],dp[i-1][2])+1    if s[i]=='b':        dp[i][0] = dp[i - 1][0]        dp[i][1] = max(dp[i - 1][0],dp[i-1][1]) + 1        dp[i][2] = max(dp[i - 1][0], dp[i - 1][2]) print(max(dp[i][0],dp[i][1],dp[i][2]))	   	 				 	 						 	   		   	
