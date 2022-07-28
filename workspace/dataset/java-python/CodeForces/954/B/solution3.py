n = int(input())s = input()ans  = nfor i in range(n-1, -1, -1):    if(s[:i//2+1] * 2 == s[:i+1]):        ans = min(ans, n - ((i+1)//2) + 1)        breakprint(ans) 
