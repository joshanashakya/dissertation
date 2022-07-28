n,x = map(int, input().split())a = list(map(int, input().split())) ans = 0d = {}for k in a:    if d.get(k^x, 0) > 0:        ans += d.get(k^x)    d[k] = d.get(k, 0) + 1print(ans)
