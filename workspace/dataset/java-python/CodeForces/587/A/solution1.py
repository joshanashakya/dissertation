 ######      ###      #######    #######    ##      #     #####        ###     #####  #     #    #   #          #        #       # #     #    #     #      #   #     ###   #     #   #     #        #         #       #  #    #   #       #    #     #    ###   ######   #########      #          #       #   #   #   #           #########    #    ######   #########     #           #       #    #  #   #           #########    #    #     #  #       #    #            #       #     # #   #    ####   #       #    #    #     #  #       #   #             #       #      ##   #    #  #   #       #         ######   #       #  #######     #######    #       #    #####  #   #       #    #    # from __future__ import print_function # for PyPy2from collections import Counter, OrderedDictfrom itertools import permutations as permfrom fractions import Fractionfrom collections import dequefrom sys import stdinfrom bisect import *from heapq import *from math import * g   = lambda : stdin.readline().strip()gl  = lambda : g().split()gil = lambda : [int(var) for var in gl()]gfl = lambda : [float(var) for var in gl()]gcl = lambda : list(g())gbs = lambda : [int(var) for var in g()]mod = int(1e9)+7inf = float("inf")                        g()n = int(2e6)+2f = [0]*(n)ans = 0 for v in gil():	f[v] += 1 # f[int(1e6)] = int(1e6)  for i in range(n):	ans += (f[i]&1)	f[i] //= 2	if f[i]:		if i+1 < n:			f[i+1] += f[i]		else:			print("break")			print(f[i], i) print(ans)