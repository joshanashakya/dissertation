n = int(input())
a = list(map(int, input().split()))
ans = nif
n > 1: i = 1
while i < n:        count = 0
if a[i] == a[i - 1]:            count = 1
while i <= n - 1 and a[i] == a[i - 1]:                i += 1
count += 1
i -= 1
if count > 0:            ans += (count ** 2 - count) // 2
i += 1
print(ans)
