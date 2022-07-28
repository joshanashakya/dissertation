n, k = [int(i) for i in input().split()]
a = list(map(int, input().split()))[:n]
b = 0
while a.count(k) != len(a):    for
i in set(a):
if i != k:            x = a.index(i)
a[x] = a[x] + 1
b = b + 1
print(b)
