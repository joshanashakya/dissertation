from collections import dequefrom collections import defaultdictn = int(input())b = list(map(int, input().split()))ind = [[] for i in range(61)]l = [0] * (61)for i in range(n):    for mask in range(61):        if b[i] & (1 << mask):            ind[mask].append(i + 1)            l[mask] += 1 adj = [[] for i in range(n + 1)]poss = 0for mask in range(61):    if l[mask] < 2:        pass    elif l[mask] == 2:        adj[ind[mask][0]].append(ind[mask][1])        adj[ind[mask][1]].append(ind[mask][0])     else:        poss = 1        break if poss:    print(3) else:    for i in range(1, n + 1):        adj[i] = list(set(adj[i]))     vis = [0] * (n + 1)    i = 1    shortest = float("inf")     while (i <= n):        if not vis[i]:            poss=[]            q = deque()            q.append(i)             vis[i]=1            poss.append(i)            while(q):                curr=q.popleft()                for j in adj[curr]:                    if vis[j]:                        pass                     else:                        vis[j]=1                        q.append(j)                        poss.append(j)             for v in poss:                q = deque()                q.append(v)                d = defaultdict(lambda:float("inf"))                d[v] = 0                 par=defaultdict(lambda:-1)                q.append(v)                while (q):                    curr = q.popleft()                    for j in adj[curr]:                        if d[j]!=float("inf"):                            if par[curr]!=j and par[j]!=curr:                                shortest=min(shortest,d[curr]+d[j]+1)                          else:                            d[j] = d[curr] + 1                            par[j] = curr                            q.append(j)         i+=1     if shortest==float("inf"):        print(-1)     else:        print(shortest)         