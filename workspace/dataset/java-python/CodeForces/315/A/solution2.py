from collections import defaultdictn = int(input())l = []d = defaultdict(int)ans = 0for i in range(n):        a, b = map(int, input().split())    l.append([a, b])    d[b]+=1for i in range(n):    if l[i][1]==l[i][0] and d[l[i][1]] == 1 or l[i][0] not in d:                ans+=1print(ans)
