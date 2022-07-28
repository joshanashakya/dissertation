import math, sys, bisect, heapqfrom

collections
import defaultdict, Counter, dequefrom

itertools
import groupby, accumulatefrom

functools
import \
    lru_cache  # sys.setrecursionlimit(200000000)int1 = lambda x: int(x) - 1#def input(): return sys.stdin.readline().strip()input = iter(sys.stdin.buffer.read().decode().splitlines()).__next__aj = lambda: list(map(int, input().split()))def list3d(a, b, c, d): return [[[d] * c for j in range(b)] for i in range(a)]#MOD = 1000000000 + 7def Y(c):  print(["NO","YES"][c])def y(c):  print(["no","yes"][c])def Yy(c):  print(["No","Yes"][c]) for _ in range(int(input())):    n,k = aj()    A = aj()    diff = len(set(A))    if k >= diff:        print(1)    elif k == 1:        print(-1)    else:        print(math.ceil((diff - 1) / (k - 1)))
