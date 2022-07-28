for t in range(int(input())):    n, k = map(int, input().split())
a = list(map(int, input().split()))
a.sort()
ans = 0
for i in range(1, n):        ans += (k - a[i]) // a[0]
print(ans)
