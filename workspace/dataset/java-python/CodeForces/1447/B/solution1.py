for _ in range(int(input())):    n, m = map(int, input().split())
d = list()
s = 0
ans = 0
l = list()
for i in range(n):        a = list(map(int, input().split()))
for k in a:            if
k < 0: ans += 1
s += abs(k)
l.append(abs(k))
if ans % 2 == 1:        s = s - 2 * min(l)
print(s)
