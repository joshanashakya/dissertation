n, m = map(int, input().split()) A = [[0 for i in range(n)] for i in range(n)] for i in range(m):    u, v = map(int, input().split())    u -= 1    v -= 1    A[u][v] = 1    A[v][u] = 1     dist = [-1 for i in range(n)]dist[0] = 0 Q = [0] while len(Q) != 0:    u = Q.pop(0)        for v in range(n):                if dist[v] == -1 and A[v][u] != A[0][n-1]:            dist[v] = dist[u] + 1            Q.append(v)            print(dist[n-1])
