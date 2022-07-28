t = int(input())
for _ in range(t):  n, m = map(int, input().split())
k = list(map(int, input().split()))
k.sort(reverse=True)
c = list(map(int, input().split()))
idx = 0
ans = 0
for i in range(n):    if
idx < k[i] - 1: ans += c[idx]
idx += 1 else:      ans += c[k[i] - 1]
print(ans)
