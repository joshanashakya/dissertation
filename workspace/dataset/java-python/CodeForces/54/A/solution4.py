n, k = map(int, input().split())
d = list(map(int, input().split()))[1:] + [n + 1]
res, mx = 0, kfor
i in range(len(d)): res += max(0, (d[i] - mx + k - 1) // k) + 1
mx = max(mx, d[i] + k)
print(res - 1)
