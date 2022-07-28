def dp(n):    if n == 1:        return 1    return 4 * (n - 1) + dp(n - 1)print(dp(int(input())))
