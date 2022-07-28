import sys input = lambda: sys.stdin.readline().rstrip("\r\n") for _ in range(int(input())):    n, k = map(int,
                                                                                                           input().split())
a = list(map(int, input().split()))
b = list(map(int, input().split()))
d = dict()
for i in b:        d[i] = -1
ans = 1
ck = set()
ck.add(-1)
ck.add(n)     for i, v in enumerate(a):        if
v in d: d[v] = i
ck.add(i)
ans = 1
for i in b:        if
d[i] + 1 in ck and d[i] - 1 in ck: ans = 0
break
if d[i] + 1 not in ck and d[i] - 1 not in ck:            ans *= 2
ck.remove(d[i])
ans = ans % 998244353
print(ans)   
