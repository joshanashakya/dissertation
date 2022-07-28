t = int(input())
for test in range(t):
    n, k, z = map(int, input().split())
    arr = list(map(int, input().split()))
    dp = [[[0, 0] for i in range(z + 1)] for j in range(n)]
    dp[0][0][0] = arr[0]
    m = 0
    for j in range(z + 1):
        for i in range(n):
            if i > 0:
                dp[i][j] = [arr[i] + dp[i - 1][j][0], dp[i - 1][j][1] + 1]
            if i < n - 1 and j > 0 and dp[i][j - 1][0] + arr[i + 1] + arr[i] > dp[i][j][0]:
                dp[i][j] = [dp[i][j - 1][0] + arr[i + 1] + arr[i], dp[i + 1][j - 1][1] + 1]
            if dp[i][j][1] == k:
                m = max(m, dp[i][j][0])
    print(m)
