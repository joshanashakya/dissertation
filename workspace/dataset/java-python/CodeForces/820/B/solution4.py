n, a = map(int, input().split()) ans = [2, 1, n]d = abs(180 * (n - 2) / n - a)for i in range(3, n):    tmp = 180 * (i - 2) / n    if abs(tmp - a) < d:        d = abs(tmp - a)        ans[2] = i print(' '.join(map(str, ans)))