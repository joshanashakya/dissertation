n = int(input())s, t = [list(input()) for _ in range(2)] if str(sorted(s)) == str(sorted(t)):  ans = []  for i in range(n - 1, -1, -1):    if s[i] != t[i]:      for j in range(i - 1, -1, -1):        if s[j] == t[i]:          for k in range(j, i):            s[k], s[k + 1] = s[k + 1], s[k]            ans.append(k + 1)          break  print(len(ans))  print(*ans)else:  print(-1)