from collections import defaultdictn = int(input())arr = tuple(map(int, input().split()))d = defaultdict(int)for i in arr:    d[i] += 1i = 0ans = 0while i <= n or d[i - 1] != 0:    if d[i]:        ans += d[i] - 1        d[i + 1] += d[i] - 1    i += 1print(ans)