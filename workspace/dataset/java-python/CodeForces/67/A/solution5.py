import mathfrom

collections
import Counter, defaultdictfrom

itertools
import accumulate R = lambda: map(int, input().split())
n = int(input())
s = input()
dp = [[0] * 1005 for i in range(n + 1)]
for i in range(1, 1001):    dp[0][i] = idp[0][1001] = math.inffor
i in range(n): dp[i][0] = math.inffor
i in range(1, n):
if s[i - 1] == 'L':        rmin = math.inf
for j in range(1000, 0, -1):            dp[i][j] = rmin + j
rmin = min(rmin, dp[i - 1][j]) elif s[i - 1] == 'R': rmin = math.inf
for j in range(1, 1001):            dp[i][j] = rmin + j
rmin = min(rmin, dp[i - 1][j]) else:        for j in range(1, 1001):            dp[i][j] = dp[i - 1][j] + jrem =
min((dp[n - 1][j], j) for j in range(1, 1001))[0]
res = [-1] * nfor
i in range(n - 1, -1, -1):
for j in range(1, 1001):        if
rem == dp[i][j]: res[i] = j
rem -= j
continueprint(' '.join(map(str, res)))
