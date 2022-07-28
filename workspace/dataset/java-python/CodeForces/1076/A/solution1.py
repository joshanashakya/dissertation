n = int(input())s = input()i = 1while i < n and s[i-1] <= s[i]:    i += 1print(s[:i-1]+s[i:])
