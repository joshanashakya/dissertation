n, k = map(int, input().split())
a = list(map(int, input().split()))
t = 1
ans = 0
for i in range(1, n + 1):    if
i in a[1:]: ans += 1
t = 1 elif t == k: ans += 1
t = 1 else:        t += 1
print(ans)
