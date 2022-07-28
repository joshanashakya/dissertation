n = int(input())s = str(input())ans = 0for i in range(n):	if int(s[i])%2 == 0:		ans += (i+1)print(ans)
