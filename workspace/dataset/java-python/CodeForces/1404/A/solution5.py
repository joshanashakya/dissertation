from collections import Counter  

def solve(s, k):    r = [None] * k


for i in range(len(s)):        c = s[i]
if c != '?':            if
r[i % k] is None: r[i % k] = c elif r[i % k] != c:
return False
c = Counter(r)
return abs(c['0'] - c['1']) <= c[None]  t = int(input())
for _ in range(t):    _, k = map(int, input().split())
s = input()
print("YES" if solve(s, k) else "NO")
