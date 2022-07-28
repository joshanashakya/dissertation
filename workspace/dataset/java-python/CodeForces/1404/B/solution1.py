from _collections import deque


def dist(G, n, s):    D = [None] * n


D[s] = 0
Q = deque()
Q.append(s)
while Q:        f = Q.popleft()
for t in G[f]:            if
D[t] is None: D[t] = D[f] + 1;
Q.append(t)
return D
for _ in range(int(input())):    n, a, b, da, db = map(int, input().split())
a -= 1;
b -= 1;
G = [[] for _ in range(n)]
for _ in range(n - 1):        u, v = map(int, input().split())
G[u - 1].append(v - 1)
G[v - 1].append(u - 1)
D = dist(G, n, a)
me = max(enumerate(D), key=lambda x: x[1])[0]
print('Alice') if D[b] <= da or db <= 2 * da or max(dist(G, n, me)) <= 2 * da else print('Bob')
