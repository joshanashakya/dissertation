import sys

input = sys.stdin.readline

import math

n = int(input())
a = list(map(int, input().split()))
a.sort()
j = a[0]

c = 1
mn = 10 ** 18
inf = 10 ** 18
if n <= 2:
    print(a[0] - 1)
else:
    while c <= 10 ** 9:

        cnt = 0
        ok = 0
        for i in range(n):
            k = c ** i - a[i]
            cnt += abs(k)
            if c ** i > inf:
                break
        if cnt < mn:
            mn = cnt
        if c ** (n - 1) > mn + a[-1]:
            break
        c += 1
    print(mn)
