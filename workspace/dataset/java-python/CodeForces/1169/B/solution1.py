 ######      ###      #######    #######    ##      #     #####        ###     #####  #     #    #   #          #        #       # #     #    #     #      #   #     ###   #     #   #     #        #         #       #  #    #   #       #    #     #    ###   ######   #########      #          #       #   #   #   #           #########    #    ######   #########     #           #       #    #  #   #           #########    #    #     #  #       #    #            #       #     # #   #    ####   #       #    #    #     #  #       #   #             #       #      ##   #    #  #   #       #         ######   #       #  #######     #######    #       #    #####  #   #       #    #    # from __future__ import print_function # for PyPy2from collections import Counter, OrderedDictfrom itertools import permutations as permfrom fractions import Fractionfrom collections import dequefrom sys import stdinfrom bisect import *from heapq import *from math import * g   = lambda : stdin.readline().strip()gl  = lambda : g().split()gil = lambda : [int(var) for var in gl()]gfl = lambda : [float(var) for var in gl()]gcl = lambda : list(g())gbs = lambda : [int(var) for var in g()]mod = int(1e9)+7inf = float("inf")                       m, n = gil()p = []for _ in range(n):	p.append(gil())  def getLeft(x, it):	left = []	# print(left)	for i in it:		if x not in p[i]:			left.append(i) 	return left  left1 = getLeft(p[0][0], range(n)) if len(left1) > 1:	# print(left1)	x, y = p[left1[0]]	if getLeft(x, left1) == [] or getLeft(y, left1) == []:		print("YES")		exit()else:	print("YES")	exit()  left2 = getLeft(p[0][1], range(n)) if len(left2) > 1:	x, y = p[left2[0]]	if getLeft(x, left2) == [] or getLeft(y, left2) == []:		print("YES")		exit()else:	print("YES")	exit() print("NO")
