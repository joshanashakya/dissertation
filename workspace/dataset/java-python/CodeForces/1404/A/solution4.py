from collections import Counter  

def good(s, k):    n = len(s)


x = [None] * k
for i in range(n):        if
s[i] != '?':
if x[i % k] is None:
    x[i % k] = s[i]            elif x[i % k] != s[i]:
    return False
c = Counter(x)
return abs(c['1'] - c['0']) <= c[None]  tc = int(input())
for _ in range(tc):    _, k = map(int, input().split())
s = input()
print("YES" if good(s, k) else "NO")
