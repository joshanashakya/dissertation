from sys import stdin input = stdin.readlinek, n = map(int, input().split())
a = input()
b = input()
dp = [[0 for i in range(n + 1)] for __ in range(k + 1)]
ans = 0
for i in range(1, k + 1):    for
j in range(1, n + 1):
if a[i - 1] == b[j - 1]:            dp[i][j] = max(dp[i][j], dp[i - 1][j - 1] + 2)
ans = max(ans, dp[i][j]) else:            dp[i][j] = max(dp[i - 1][j], dp[i][j - 1]) - 1
dp[i][j] = max(0, dp[i][j])
print(ans)
