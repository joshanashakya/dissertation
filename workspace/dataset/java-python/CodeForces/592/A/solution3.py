def STR(): return list(input())def INT(): return int(input())def MAP(): return map(int, input().split())def MAP2():return map(float,input().split())def LIST(): return list(map(int, input().split()))def STRING(): return input()import stringfrom heapq import heappop , heappushfrom bisect import *from collections import deque , Counterfrom math import *from itertools import permutations , accumulatedx = [-1 , 1 , 0 , 0  ]dy = [0 , 0  , 1  , - 1]#visited = [[False for i in range(m)] for j in range(n)]#for tt in range(INT()): g = []for i in range(8):    s = STR()    g.append(s) r1 = []r2 = []for i in range(len(g)):    for j in range(len(g)):        f = True        if g[i][j] == 'W':            for k in range(0,i):                if g[k][j] == 'B':                    f = False                    break            if f :                x = i - 0                r1.append(x)         elif g[i][j] == 'B':            for k in range(i+1 , 8):                if g[k][j] == 'W':                    f = False                    break            if f :                x = 7 - i                r2.append(x) r1.sort()r2.sort()#print(r1)#print(r2)if len(r1)==0:    print('B')    exit(0)if len(r2)==0:    print('A')    exit(0) if r1[0]<=r2[0]:    print('A')else:    print('B')
