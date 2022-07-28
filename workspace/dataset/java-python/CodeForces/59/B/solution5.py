n = int(input())
l = list(map(int, input().split()))
e = []
o = []
for p in l:    if
p % 2 == 0: e.append(p) else:        o.append(p)
ans = sum(e)
o.sort()
if len(o) % 2 == 0:
    ans += sum(o[1:])else:
    ans += sum(o)
if ans % 2 == 0:
    print(0)else:
    print(ans)
