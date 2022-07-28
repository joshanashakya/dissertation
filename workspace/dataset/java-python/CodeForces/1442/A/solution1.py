inf = 10 ** 9


def solve():    l = inf


r = -1
for a in aa:        l = min(a, l, a - r)
r = a - l
if l < 0 or r < 0: return "NO"
return "YES"
for _ in range(int(input())):    n = int(input())
aa = list(map(int, input().split()))
print(solve())
