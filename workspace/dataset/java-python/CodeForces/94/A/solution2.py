import sys
from functools import lru_cache, cmp_to_key
from heapq import merge, heapify, heappop, heappush
from math import *
from collections import defaultdict as dd, deque, Counter as C
from itertools import combinations as comb, permutations as perm
from bisect import bisect_left as bl, bisect_right as br, bisect, insort
from time import perf_counter
from fractions import Fraction
import copy
from copy import deepcopy
import time

starttime = time.time()
mod = int(pow(10, 9) + 7)
mod2 = 998244353


def data(): return sys.stdin.readline().strip()


def out(*var, end="\n"): sys.stdout.write(' '.join(map(str, var)) + end)


def L(): return list(sp())


def sl(): return list(ssp())


def sp(): return map(int, data().split())


def ssp(): return map(str, data().split())


def l1d(n, val=0): return [val for i in range(n)]


def l2d(n, m, val=0): return [l1d(n, val) for j in range(m)]


try:
    # sys.setrecursionlimit(int(pow(10,6)))
    sys.stdin = open("input.txt", "r")
    # sys.stdout = open("../output.txt", "w")
except:
    pass


def pmat(A):
    for ele in A:
        print(*ele, end="\n")


s = input()
d = {}
for i in range(10):
    d[input()] = str(i)
ans = ""
for i in range(0, 80, 10):
    ans += d[s[i:i + 10]]
print(ans)

endtime = time.time()
# print(f"Runtime of the program is {endtime - starttime}")
