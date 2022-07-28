c, v0, v1, a, l = map(int, input().split())ans = 0now = 0while now < c:    if now > 0:        now -= l    now += v0    v0 = min(v0 + a, v1)    ans += 1print(ans)
