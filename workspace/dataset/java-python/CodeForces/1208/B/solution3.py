 ######      ###      #######    #######    ##      #     #####        ###     #####  #     #    #   #          #        #       # #     #    #     #      #   #     ###   #     #   #     #        #         #       #  #    #   #       #    #     #    ###   ######   #########      #          #       #   #   #   #           #########    #    ######   #########     #           #       #    #  #   #           #########    #    #     #  #       #    #            #       #     # #   #    ####   #       #    #    #     #  #       #   #             #       #      ##   #    #  #   #       #         ######   #       #  #######     #######    #       #    #####  #   #       #    #    # from __future__ import print_function # for PyPy2from collections import Counter, OrderedDictfrom itertools import permutations as permfrom fractions import Fractionfrom collections import dequefrom sys import stdinfrom bisect import *from heapq import *# from math import * g   = lambda : stdin.readline().strip()gl  = lambda : g().split()gil = lambda : [int(var) for var in gl()]gfl = lambda : [float(var) for var in gl()]gcl = lambda : list(g())gbs = lambda : [int(var) for var in g()]mod = int(1e9)+7inf = float("inf")                       n, = gil()a = gil()ans = set(a)b = Counter(a) if len(ans) == n:	print(0);exit() final_ans = max(1, n-1) for l in range(n):	st = ans.copy()	f = b.copy()	seg_len = 0	for r in range(l, n):		seg_len += 1		if f[a[r]] == 1:			st.remove(a[r])			del f[a[r]]		else:			f[a[r]] -= 1 		if len(st) == n-seg_len:			final_ans = min(final_ans, seg_len)			break print(final_ans)  