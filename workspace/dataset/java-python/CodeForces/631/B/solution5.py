def STR(): return list(input())def INT(): return int(input())def MAP(): return map(int, input().split())def MAP2():return map(float,input().split())def LIST(): return list(map(int, input().split()))def STRING(): return input()import stringimport sysfrom heapq import heappop , heappushfrom bisect import *from collections import deque , Counter , defaultdictfrom math import *from itertools import permutations , accumulatedx = [-1 , 1 , 0 , 0  ]dy = [0 , 0  , 1  , - 1]#visited = [[False for i in range(m)] for j in range(n)]#sys.stdin = open(r'input.txt' , 'r')#sys.stdout = open(r'output.txt' , 'w')#for tt in range(INT()):  #CODE n , m , k = MAP()rows = [[0 , -1] for i in range(n)]cols = [[0 , -1] for i in range(m)] for i in range(k):    x , y , z = MAP()    if x == 1 :        rows[y-1][0] = z        rows[y-1][1] = i     else:        cols[y-1][0] = z        cols[y-1][1] = i  g = [[0 for i in range(m)] for j in range(n)]for i in range(n):    for j in range(m):        if rows[i][1] > cols[j][1]:            g[i][j] = rows[i][0]         else:            g[i][j] = cols[j][0]  for i in range(n):    for j in range(m):        print(g[i][j] , end = ' ')     print()   