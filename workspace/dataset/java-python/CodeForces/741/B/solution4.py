def ler():    return [int(x) for x in input().split()]  def dfs(u, adj, visited, s, Pesos, Belezas):    visited[u] = True    total_p = Pesos[u]    total_b = Belezas[u]    s.append(u)    for v in adj[u]:        if not visited[v]:            w, b = dfs(v, adj, visited, s, Pesos, Belezas)            total_p += w            total_b += b    return total_p, total_b  n, m, w = ler()Pesos = ler()Belezas = ler()adj = [[] for _ in range(n)]for _ in range(m):    x, y = ler()    x -= 1    y -= 1    adj[x].append(y)    adj[y].append(x)visited = [False] * nf = [0] * (w + 1)for i in range(n):    if visited[i]:        continue     s = []    total_p, total_b = dfs(i, adj, visited, s, Pesos, Belezas)    for j in range(w, -1, -1):        jw = j + total_p        if jw <= w:            f[jw] = max(f[jw], f[j] + total_b)        for v in s:            jw = j + Pesos[v]            if jw <= w:                f[jw] = max(f[jw], f[j] + Belezas[v])print(f[w]) 