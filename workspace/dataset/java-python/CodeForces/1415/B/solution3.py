t = int(input())
for i in range(t):    n, k = map(int, input().split())
a = list(map(int, input().split()))
res = []
for i in range(1, 101):        j = 0
c = 0
while j < n:            if
a[j] == i: j += 1 else:                j += k
c += 1
res.append(c)
print(min(res))
