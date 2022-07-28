import sys, math
import io, os

data = io.BytesIO(os.read(0, os.fstat(0).st_size)).readline
from bisect import bisect_left as bl, bisect_right as br, insort
from heapq import heapify, heappush, heappop
from collections import defaultdict as dd, deque, Counter


# from itertools import permutations,combinations
# def data(): return sys.stdin.readline().strip()
def mdata(): return list(map(int, data().split()))


def outl(var): sys.stdout.write('\n'.join(map(str, var)) + '\n')


def out(var): sys.stdout.write(str(var) + '\n')


from decimal import Decimal
from fractions import Fraction

# sys.setrecursionlimit(100000)
INF = float('inf')
mod = int(1e9) + 7


def cal(num, l):
    if num == k:
        S = 0
        for i in range(k):
            S ^= val[i][l[i]]
        if S == H:
            return 1
        return 0
    else:
        ans = 0
        for i in range(len(l) + 1):
            ans += cal(num + 1, l + [i])
        return ans


n, m, k = mdata()
val = [[0] * k for i in range(k)]
g = [[] for i in range(n)]
for i in range(m):
    u, v, w = mdata()
    g[u - 1].append((w, v - 1))

HASH = [4343434343439 + (10 ** 9 + 7) * i for i in range(n + 1)]
H = HASH[0]
for x in HASH:
    H ^= x

for i in range(n):
    g[i].sort()
    for j in range(len(g[i])):
        val[len(g[i]) - 1][j] ^= HASH[g[i][j][1] + 1]
out(cal(0, []))
