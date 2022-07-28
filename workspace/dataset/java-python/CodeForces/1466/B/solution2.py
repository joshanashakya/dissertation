from collections import defaultdictfor

_ in range(int(input())): n = int(input())
a = sorted(list(map(int, input().split())), reverse=1)
d = defaultdict(int)
for i in a:        d[i] += 1
for i in a:        if
not d[i + 1]: d[i] -= 1
if not d[i]:                del d[i]
d[i + 1] = 1
print(len(d))
