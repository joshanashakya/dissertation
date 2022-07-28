n = int(input()) s = list(map(int, input().split()))ex  = 10**9 for i in range(n):    ex = min(ex, s[i]//max(i, n-i-1))print(ex)
