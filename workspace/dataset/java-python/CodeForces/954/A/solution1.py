n = int(input()) s = list(input())ans = 0 i = 0while i<n-1:	if s[i]!=s[i+1]:		ans += 1		i+= 1	i+=1 print(n-ans)
