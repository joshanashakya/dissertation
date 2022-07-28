from itertools import accumulate as ac
from collections import Counter as cc
from bisect import bisect_left as bsl
from bisect import bisect as bs
from math import factorial as f
from collections import *
from itertools import *
from string import *
from bisect import *
from queue import *
from heapq import *
from math import *
from sys import *
from re import *


def fast(): return stdin.readline().strip()


def zzz(): return [int(i) for i in fast().split()]


z, zz = input, lambda: list(map(int, z().split()))
szz, graph, mod, szzz = lambda: sorted(
    zz()), {}, 10 ** 9 + 7, lambda: sorted(zzz())


def lcd(xnum1, xnum2): return (xnum1 * xnum2 // gcd(xnum1, xnum2))


def output(answer): stdout.write(str(answer))


###########################---Test-Case---#################################
"""

  If you Know me , Then you probably don't know me !


"""
###########################---START-CODING---##############################

num = int(z())

for _ in range(num):
    n = int(z())
    arr = szzz()
    if arr[0] == arr[-1]:
        print(n)
    else:
        print(1)
