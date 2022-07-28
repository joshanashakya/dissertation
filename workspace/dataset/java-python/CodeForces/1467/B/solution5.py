def is_hv(i):  if


i == 0 or i == n - 1:
return 0 else:    if a[i] > a[i - 1] and a[i] > a[i + 1]:
    return 1    elif a[i] < a[i - 1] and a[i] < a[i + 1]:
    return 1    else:
    return 0
for _ in range(int(input())):  n = int(input())
a = list(map(int, input().split()))
hv = [0] * n
for i in range(1, n - 1):    if
is_hv(i) == 1: hv[i] = 1
s = sum(hv)
result = s
for i in range(n):    if
hv[i] == 1: t = a[i]
for e in [a[i - 1], a[i + 1]]:        a[i] = e
result = min(is_hv(i - 1) + is_hv(i + 1) + s - hv[i - 1] - hv[i + 1] - 1, result)
a[i] = t
print(result)
