from collections import Countert = int(input())
for _ in range(t):    n, x = map(int, input().split())
ali = list(map(int, input().split()))
li = ali.copy()
ans = sum(ali)
i = 0
while (ali[i] % x == 0):        ali[i] = ali[i] // x
ans += li[i]
i = (i + 1) % n  # print(ali)    print(ans)  
