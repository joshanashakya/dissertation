n = int(input())s = input()ans = 0for i in s:    if i=='<': ans+=1    else: breaks = s[::-1]for i in s:    if i=='>': ans+=1    else: break print(ans)
