from math import gcdn, m = map(int, input().split())
a = list(map(int, input().split()))
b = list(map(int, input().split()))
d = 0
for i in range(1, n):    d = gcd(d, abs(a[i] - a[i - 1]))
ans = [gcd(d, a[0] + elm) for elm in b]
print(*ans)
