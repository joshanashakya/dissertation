import sysimport mathimport bisectfrom sys import stdin, stdoutfrom math import gcd, floor, sqrt, log2, ceilfrom collections import defaultdict as ddfrom bisect import bisect_left as bl, bisect_right as brfrom bisect import insortfrom collections import Counterfrom collections import dequefrom heapq import heappush,heappop,heapifyfrom itertools import permutations,combinationsmod = int(1e9)+7  ip = lambda : int(stdin.readline())inp = lambda: map(int,stdin.readline().split())ips = lambda: stdin.readline().rstrip()out = lambda x : stdout.write(str(x)+"\n")  import random    def primeFactors(n):    arr = set()    while n % 2 == 0:        arr.add(2)        n = n // 2    for i in range(3, int(math.sqrt(n))+1, 2):          while n % i == 0:             n = n // i            arr.add(i)    if n>2:        arr.add(n)    arr = list(arr)    return arr        t = 1for _ in range(t):    p,y = inp()    if y == p:        ans = -1    else:        for i in range(y,p,-1):            arr = primeFactors(i)            flag = True            for j in arr:                if j>=2 and j<= p:                    flag = False                    break            if flag:                break        if flag:            ans = i        else:            ans = -1    out(ans)                                                                                                                    