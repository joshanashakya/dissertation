n = int(input())
a = list(map(int, input().split()))
a.append(a[-1] + 1)
r = []
k = 1
for i in range(1, n + 1):    if
a[i] == a[i - 1]: k += 1 else:        r.append(k)
k = 1
print(sum(map(lambda x: x * (x + 1) // 2, r)))
