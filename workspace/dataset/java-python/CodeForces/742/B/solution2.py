 ######      ###      #######    #######    ##      #     #####        ###     #####  #     #    #   #          #        #       # #     #    #     #      #   #     ###   #     #   #     #        #         #       #  #    #   #       #    #     #    ###   ######   #########      #          #       #   #   #   #           #########    #    ######   #########     #           #       #    #  #   #           #########    #    #     #  #       #    #            #       #     # #   #    ####   #       #    #    #     #  #       #   #             #       #      ##   #    #  #   #       #         ######   #       #  #######     #######    #       #    #####  #   #       #    #    # from __future__ import print_function # for PyPy2from collections import Counter, OrderedDictfrom itertools import permutations as permfrom fractions import Fractionfrom collections import dequefrom sys import stdinfrom bisect import *from heapq import *from math import * g   = lambda : stdin.readline().strip()gl  = lambda : g().split()gil = lambda : [int(var) for var in gl()]gfl = lambda : [float(var) for var in gl()]gcl = lambda : list(g())gbs = lambda : [int(var) for var in g()]mod = int(1e9)+7inf = float("inf")                       n, x = gil()a = gil()b = Counter(a)ans = 0if x:	for v in a:		ans += b.get(x^v, 0) 	print(ans//2) else:	for v in b.values():		ans += (v*(v-1))//2	print(ans)