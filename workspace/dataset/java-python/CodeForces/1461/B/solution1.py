from sys import stdint=int(input())
for _ in range(t):  n, m = map(int, stdin.readline().split())
a = [list(stdin.readline()) for i in range(n)]
cnt = 0
dp = [[0] * m for i in range(n)]
for i in range(n)[::-1]:    for
j in range(m):
if a[i][j] == "*":        dp[i][j] = 1 + (
    min(dp[i + 1][j - 1], dp[i + 1][j], dp[i + 1][j + 1]) if not (i == n - 1 or j == 0 or j == m - 1) else 0)
cnt += dp[i][j]
print(cnt)
