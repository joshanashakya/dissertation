import re
import sys

exit = sys.exit
from bisect import bisect_left as bsl, bisect_right as bsr
from collections import Counter, defaultdict as ddict, deque
from functools import lru_cache

cache = lru_cache(None)
from heapq import *
from itertools import *
from math import inf
from pprint import pprint as pp

enum = enumerate
ri = lambda: int(rln())
ris = lambda: list(map(int, rfs()))
rln = sys.stdin.readline
rl = lambda: rln().rstrip('\n')
rfs = lambda: rln().split()
mod = 1000000007
d4 = [(0, -1), (1, 0), (0, 1), (-1, 0)]
d8 = [(-1, -1), (0, -1), (1, -1), (-1, 0), (1, 0), (-1, 1), (0, 1), (1, 1)]
########################################################################

n = ri()
a = ris()
freq = Counter(a)
d = {8: 0, 6: 0, 4: 0, 2: 0}
for x in freq:
    k = freq[x]
    for m in d:
        if m <= k:
            d[m] += 1
            break
q = ri()
for _ in range(q):
    c, x = rfs()
    x = int(x)
    if c == '-':
        if freq[x] in d:
            d[freq[x]] -= 1
            if freq[x] > 2:
                d[freq[x] - 2] += 1
        freq[x] -= 1
    else:
        freq[x] += 1
        if freq[x] in d:
            if 2 < freq[x]:
                d[freq[x] - 2] -= 1
            d[freq[x]] += 1
    ok = 0
    if d[8] >= 1:
        ok = 1
    elif d[6] >= 2 or (d[6] and (d[4] or d[2])):
        ok = 1
    elif d[4] >= 2 or (d[4] and d[2] >= 2):
        ok = 1
    if ok:
        print('YES')
    else:
        print('NO')
