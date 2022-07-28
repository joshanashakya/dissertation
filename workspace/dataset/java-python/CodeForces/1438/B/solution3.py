from collections import defaultdict for t in range(int(input())):    n = int(input())
b = list(map(int, input().split()))
d = defaultdict(int)
for x in b:        d[x] += 1
ok = False
for v in d.values():        if
v > 1: ok = True
break
print("YES" if ok else "NO")
