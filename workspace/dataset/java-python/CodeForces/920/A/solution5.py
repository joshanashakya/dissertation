import sys,math,itertoolsfrom collections import Counter,deque,defaultdictfrom bisect import bisect_left,bisect_right from heapq import heappop,heappush,heapify, nlargestfrom copy import deepcopymod = 10**9+7INF = float('inf')def inp(): return int(sys.stdin.readline())def inpl(): return list(map(int, sys.stdin.readline().split()))def inpl_1(): return list(map(lambda x:int(x)-1, sys.stdin.readline().split()))def inps(): return sys.stdin.readline()def inpsl(x): tmp = sys.stdin.readline(); return list(tmp[:x])def err(x): print(x); exit() for _ in range(inp()):    n,k = inpl()    a = inpl_1()    res = [INF]*n    se = set(a)    pr = -INF    for i in range(n):        if i in se: pr = i        res[i] = min(res[i], i-pr+1)    pr = INF    for i in range(n)[::-1]:        if i in se: pr = i        res[i] = min(res[i], pr-i+1)    print(max(res))