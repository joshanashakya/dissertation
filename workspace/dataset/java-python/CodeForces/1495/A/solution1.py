from math import sqrtdef

dist(a, b):
return (sqrt(a ** 2 + b ** 2))


def solve():    n = int(input())


d = []
m = []
for p in range(2 * n):       a, b = map(int, input().split())
if a == 0:
    m.append(abs(b))       else:
    d.append(abs(a))
d.sort()
m.sort()
ans = 0
for x in range(n):        ans += dist(d[x], m[x])
print(ans)
for _ in range(int(input())):    solve()
