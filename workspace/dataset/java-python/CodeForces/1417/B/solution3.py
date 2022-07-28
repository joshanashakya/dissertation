import matht = int(input())
for _ in range(t):    n, t = map(int, input().split())
a = list(map(int, input().split()))
r = t / 2
ans = []
m = 1
for i in range(0, n):        if
a[i] < r: ans.append(1) elif a[i] > r: ans.append(0) else:            ans.append(m)
m = 1 if m == 0 else 0
print(*ans)
