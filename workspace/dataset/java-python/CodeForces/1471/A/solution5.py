from math import ceilfor

_ in range(int(input())): n, k = map(int, input().split())
l = list(map(int, input().split(' ')))
maxi = ans = value = 0
for i in l:        maxi += ceil(i / k)
for i in l:        if
i % k == 0: ans += i // k else:            value += i
if value % k == 0:                ans += value // k
value = 0
ans += ceil(value / k)
print(ans, maxi)
