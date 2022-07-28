n, m = map(int, input().split())a = sorted(list(map(int, input().split())))s = a[-1] - a[0]for i in range(n - 1, m):    s = min(s, a[i] - a[i - n + 1])print(s)
