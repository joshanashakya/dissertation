input = __import__('sys').stdin.readlinefor
_ in range(int(input())): n, m = map(int, input().split())
rows = []
g = {}
for i in range(n):        row = list(map(int, input().split()))
rows.append(row)
for j in range(m):            g[row[j]] = i
res = []
ans = list(map(int, input().split()))
for i in range(n):        res.append(g[ans[i]])
for _ in range(m - 1): input()
for i in res:        print(*rows[i])
