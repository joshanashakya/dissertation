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

def ok():
    if s[8]:
        return 1
    elif s[6] >= 2:
        return 1
    elif s[6] and (s[4] >= 2 or s[2] >= 2):
        return 1
    elif s[4] >= 2:
        return 1
    elif s[4] and s[2] >= 3:
        return 1
    else:
        return 0


n = ri()
a = ris()
freq = ddict(int)
s = ddict(int)
for x in a:
    freq[x] += 1
    s[freq[x]] += 1
q = ri()
for _ in range(q):
    c, x = rfs()
    x = int(x)
    if c == '-':
        s[freq[x]] -= 1
        freq[x] -= 1
    else:
        freq[x] += 1
        s[freq[x]] += 1
    if ok():
        print('YES')
    else:
        print('NO')
