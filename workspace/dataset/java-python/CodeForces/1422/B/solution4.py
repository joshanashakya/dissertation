t = int(input())
for q in range(t):    n, m = map(int, input().split())
a = n * [[0 for i in range(m)]]
for i in range(n):        a[i] = [int(x) for x in input().split()]
ans = 0
for i in range((n + 1) // 2):        for
j in range((m + 1) // 2):
if i == n - 1 - i:
    x = [a[i][j], a[i][m - 1 - j]]            elif j == m - 1 - j:
    x = [a[i][j], a[n - 1 - i][j]]            else:
    x = [a[i][j], a[n - 1 - i][j], a[i][m - 1 - j], a[n - 1 - i][m - 1 - j]]
x = sorted(x)
ans += min(sum([abs(v - x[int(len(x) / 2) - 1]) for v in x]), sum([abs(v - x[int(len(x) / 2)]) for v in x]))
print(ans)
