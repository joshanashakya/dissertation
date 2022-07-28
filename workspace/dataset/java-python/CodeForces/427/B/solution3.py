s = 0ans = 0n, t, c = map(int, input().split())for i in map(int, input().split()):    if i <= t:        s += 1    else:        s = 0    if s >= c:        ans += 1print(ans)
