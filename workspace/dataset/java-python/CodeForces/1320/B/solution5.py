from collections import defaultdictfrom collections import deque n, m = map(int, input().split())adj = defaultdict(list)rev = defaultdict(list)dist = {}for _ in range(m):    u, v = map(int, input().split())    adj[u].append(v)    rev[v].append(u) k = int(input())path = list(map(int, input().split())) dt = {}  def bfs(t):    q = deque([t])    dt[t] = 0     while q:        c = q.popleft()        for y in rev[c]:            if y not in dt:                dt[y] = dt[c] + 1                q.append(y)  min_rebuild = 0max_rebuild = 0bfs(path[k - 1]) for i in range(1, k - 1):    v = path[i - 1]    u = path[i]     if dt[u] + 1 > dt[v]:        min_rebuild += 1        max_rebuild += 1     elif dt[u] + 1 == dt[v]:        for w in adj[v]:            if u != w and dt[u] == dt[w]:                max_rebuild += 1                break  print(min_rebuild, max_rebuild)