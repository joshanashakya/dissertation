def dp(n):    if n < 0:        return 0    if not n:        return 1    return 2 * dp(n - 2)print(dp(int(input())))
