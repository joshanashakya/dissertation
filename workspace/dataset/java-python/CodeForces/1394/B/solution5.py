import sys

input = lambda: sys.stdin.readline().rstrip()
N, M, K = map(int, input().split())
OUT = [[] for _ in range(N)]
t, m = 12345, (1 << 60) - 1
HASH = []
s = 987654321
H = 0
for _ in range(N):
    s = (s * 17 + t) & m
    HASH.append(s)
    H ^= s
for _ in range(M):
    u, v, w = map(int, input().split())
    u, v = u - 1, v - 1
    OUT[u].append((w << 18) + v)

X = [[0] * (i + 2) for i in range(K)]
m = (1 << 18) - 1
for i in range(N):
    c = len(OUT[i])
    for j, vw in enumerate(sorted(OUT[i])):
        w, v = vw >> 18, vw & m
        X[c - 1][j] ^= HASH[v]

s = 0
for i in range(K):
    s ^= X[i][0]
X[0][0] = 0

ans = 0
A = [0] * K
f = 1
while f:
    if s == H:
        ans += 1

    A[0] += 1
    a = 0
    while A[a] == a + 1:
        s ^= X[a][0]
        A[a] = 0
        a += 1
        if a >= K:
            f = 0
            break
        s ^= X[a][A[a]] ^ X[a][A[a] + 1]
        A[a] += 1
ans = 0
A = [0] * K
f = 1
while f:
    if s == H:
        ans += 1

    A[0] += 1
    a = 0
    while A[a] == a + 1:
        s ^= X[a][0]
        A[a] = 0
        a += 1
        if a >= K:
            f = 0
            break
        s ^= X[a][A[a]] ^ X[a][A[a] + 1]
        A[a] += 1

print(ans)
