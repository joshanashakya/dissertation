n = int(input())s = input()res = 0for i in range(0, len(s), n):    if i >= 4 and s[i-1] == s[i-2] == s[i-3]:        res += 1print(res)
