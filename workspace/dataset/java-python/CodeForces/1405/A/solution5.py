from collections import Countert = int(input())
for _ in range(t):    n = int(input())
ali = list(map(int, input().split()))
q = reversed(ali)
print(*q)
