import reimport

sysexit = sys.exitfrom
bisect
import bisect_left as bsl, bisect_right as bsrfrom

collections
import Counter, defaultdict as ddict, dequefrom

functools
import lru_cachecache=lru_cache(None)
from heapq import *
from itertools import *
from math import inffrom

pprint
import pprint as ppenum=enumerateri = lambda: int(rln())
ris = lambda: list(map(int, rfs()))
rln = sys.stdin.readlinerl = lambda: rln().rstrip('\n')
rfs = lambda: rln().split()
mod = 1000000007
d4 = [(0, -1), (1, 0), (0, 1), (-1, 0)]
d8 = [(-1, -1), (0, -1), (1, -1), (-1, 0), (1, 0), (-1, 1), (0, 1), (1,
                                                                     1)]  ######################################################################## t=ri()for _ in range(t):  n=ri()  grid=[rl() for _ in range(n)]  pos=[(0,1),(1,0),(n-2,n-1),(n-1,n-2)]  have=''.join(grid[r][c] for r,c in pos)  for want in '0011','1100':    ans=[]    for rc,x,y in zip(pos,have,want):      if x!=y:        ans.append(rc)    if len(ans)<=2:      print(len(ans))      for r,c in ans:        print(r+1,c+1)      break
