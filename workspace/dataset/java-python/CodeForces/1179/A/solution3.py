 ######      ###      #######    #######    ##      #     #####        ###     #####  #     #    #   #          #        #       # #     #    #     #      #   #     ###   #     #   #     #        #         #       #  #    #   #       #    #     #    ###   ######   #########      #          #       #   #   #   #           #########    #    ######   #########     #           #       #    #  #   #           #########    #    #     #  #       #    #            #       #     # #   #    ####   #       #    #    #     #  #       #   #             #       #      ##   #    #  #   #       #         ######   #       #  #######     #######    #       #    #####  #   #       #    #    # from __future__ import print_function # for PyPy2from collections import Counter, OrderedDictfrom itertools import permutations as permfrom fractions import Fractionfrom collections import dequefrom sys import stdinfrom bisect import *from heapq import *# from math import * g   = lambda : stdin.readline().strip()gl  = lambda : g().split()gil = lambda : [int(var) for var in gl()]gfl = lambda : [float(var) for var in gl()]gcl = lambda : list(g())gbs = lambda : [int(var) for var in g()]mod = int(1e9)+7inf = float("inf")                       n, q = gil()ans = [None]d = deque(gil()) for i in range(n):	a, b = d.popleft(), d.popleft()	ans.append((a, b))	d.append(min(a, b))	d.appendleft(max(a, b)) maxi = d.popleft()d = list(d) for _ in range(q):	mv, = gil()	if mv <= n:		print(*ans[mv])	else:		mv -= (n+1)		mv %= (n-1)		print(maxi, d[mv])