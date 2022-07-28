from sys import setrecursionlimitsetrecursionlimit

(1000000)
n, a, b, c, d = map(int, input().split())
dx = [0, 0, -1, 1]
dy = [1, -1, 0, 0]
vis = [[0] * (n + 1) for _ in " " * (n + 1)]
ok = [[1] * (n + 1)]
for i in range(n - 1):    ok.append([1] + [0] * (n - 1) + [1])
ok.append([1] * (n + 1))


def dfs(x, y, k):    if


x < 0 or x > n or y < 0 or y > n:
return
if vis[x][y]: return
if ok[x][y] == 0: return vis[x][y]=1
if x == c and y == d: exit(print(min(k, 4 * n - k)))
for i in range(4): dfs(x + dx[i], y + dy[i], k + 1)
dfs(a, b, 0)
