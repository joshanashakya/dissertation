import sysfrom functools import lru_cache, cmp_to_keyfrom heapq import merge, heapify, heappop, heappush# from math import *from collections import defaultdict as dd, deque, Counter as Cfrom itertools import combinations as comb, permutations as permfrom bisect import bisect_left as bl, bisect_right as br, bisectfrom time import perf_counterfrom fractions import Fractionimport copyimport timestarttime = time.time()mod = int(pow(10, 9) + 7)mod2 = 998244353from sys import stdininput = stdin.readlinedef data(): return sys.stdin.readline().strip()def out(*var, end="\n"): sys.stdout.write(' '.join(map(str, var))+end)def L(): return list(sp())def sl(): return list(ssp())def sp(): return map(int, data().split())def ssp(): return map(str, data().split())def l1d(n, val=0): return [val for i in range(n)]def l2d(n, m, val=0): return [l1d(n, val) for j in range(m)]try:    # sys.setrecursionlimit(int(pow(10,6)))    sys.stdin = open("input.txt", "r")    # sys.stdout = open("../output.txt", "w")except:    pass from array import arraydef input():    return sys.stdin.buffer.readline().decode('utf-8')def solve():    n = int(input())    matrix = [array('i', list(map(int, input().split()))) for _ in range(n)]    a = tuple(map(lambda x: int(x) - 1, input().split()))    ans = [''] * n     for i in range(n - 1, -1, -1):        x = a[i]        for u in range(n):            for v in range(n):                if matrix[u][v] > matrix[u][x] + matrix[x][v]:                    matrix[u][v] = matrix[u][x] + matrix[x][v]         upper, lower = 0, 0        for u in a[i:]:            for v in a[i:]:                lower += matrix[u][v]            if lower >= 10**9:                upper += 1                lower -= 10**9        ans[i] = str(upper * 10**9 + lower)     sys.stdout.buffer.write(' '.join(ans).encode('utf-8'))solve()    endtime = time.time()# print(f"Runtime of the program is {endtime - starttime}")
