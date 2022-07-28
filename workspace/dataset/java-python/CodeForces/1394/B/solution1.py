import io, os

input = io.BytesIO(os.read(0, os.fstat(0).st_size)).readline
from operator import itemgetter

n, m, k = map(int, input().split())
e = [[] for i in range(n + 1)]
for i in range(m):
    u, v, w = map(int, input().split())
    e[u].append((w, v))
come = [[0 for j in range(10)] for i in range(10)]
d = [[0 for j in range(10)] for i in range(10)]
hash_ = [4343434343439 + (10 ** 9 + 7) * i for i in range(n + 1)]
h = hash_[0]
for i in hash_:
    h ^= i
for i in range(1, n + 1):
    e[i].sort(key=itemgetter(0))
    l = len(e[i])
    for j in range(l):
        come[l][j] ^= hash_[e[i][j][1]]
        d[l][j] += 1
ans = [0]


def dfs(number, l):
    if number == k + 1:
        c, dx = 0, 0
        for i in range(k):
            c ^= come[i + 1][l[i]]
            dx += d[i + 1][l[i]]
        if c == h and dx == n:
            ans[0] += 1
        return
    for i in range(number):
        dfs(number + 1, l + [i])


dfs(1, [])
print(ans[0])
