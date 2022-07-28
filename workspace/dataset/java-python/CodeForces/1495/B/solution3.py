import sysimport

mathfrom
math
import factorial, inf, gcdfrom

heapq
import * from functools
import * from itertools
import * from collections
import * from typing
import

*sys.setrecursionlimit(
    10 ** 5)  # int(i) for i in input().split() t = 1# t = int(input())for ii in range(t):    n = int(input())    a = [int(i) for i in input().split()]    v = []    v2 = []    i = 0    while i + 1 < n:        j = i        while i + 1 < n and a[i + 1] > a[i]:            i += 1        t1 = i - j + 1        j = i        while i + 1 < n and a[i + 1] < a[i]:            i += 1        t2 = i - j + 1        v.append(t1)        v.append(t2)        if t1 % 2 == 1 and t1 == t2:            v2.append(t1)    p = max(v)    print(1 if v2.count(p) == 1 and v.count(p) == 2 else 0)
