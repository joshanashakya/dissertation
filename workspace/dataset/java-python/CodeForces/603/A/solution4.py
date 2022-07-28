n = int(input())s = input()ans = 1for i in range(1,n):    if(s[i]!=s[i-1]):        ans += 1print(min(ans + 2, n))
