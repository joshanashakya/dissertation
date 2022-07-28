from math import log2 for u in range(int(input())):    n = int(input())
x = [int(w) for w in input().split()]
if (n == 1):
    print(0)        else:
    d = {}
for i in x:            y = int(log2(i))
d[y] = d.get(y, 0) + 1         ans = 0
for i in d:            if
    (d[i] > 1): ans += (d[i] * (d[i] - 1)) // 2
print(ans)
