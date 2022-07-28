for _ in range(int(input())):    n, m = map(int, input().split())
arr = [list(input()) for i in range(n)]
dp = [[0] * (m + 2) for i in range(n + 1)]
ans = 0
for i in range(n - 1, -1, -1):        for
j in range(1, m + 1):
if arr[i][j - 1] == '*':                dp[i][j] = 1 + min(dp[i + 1][j - 1], dp[i + 1][j], dp[i + 1][j + 1])
ans += dp[i][j]
print(ans)
