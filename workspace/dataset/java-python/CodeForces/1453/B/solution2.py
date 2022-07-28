t = int(input())
for _ in range(t):    n = int(input())
a = [int(s) for s in input().split(" ")]
ans = 0
for i in range(1, n):        ans += abs(a[i] - a[i - 1])
mx = max(abs(a[0] - a[1]), abs(a[n - 1] - a[n - 2]))
for i in range(1, n - 1):        mx = max(mx, abs(a[i] - a[i - 1]) + abs(a[i + 1] - a[i]) - abs(a[i + 1] - a[i - 1]))
print(ans - mx)
