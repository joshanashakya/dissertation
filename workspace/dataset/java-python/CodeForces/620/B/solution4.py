def STR(): return list(input())def INT(): return int(input())def MAP(): return map(int, input().split())def MAP2():return map(float,input().split())def LIST(): return list(map(int, input().split()))def STRING(): return input()import stringimport sysfrom heapq import heappop , heappushfrom bisect import *from collections import deque , Counter , defaultdictfrom math import *from itertools import permutations , accumulatedx = [-1 , 1 , 0 , 0  ]dy = [0 , 0  , 1  , - 1]#visited = [[False for i in range(m)] for j in range(n)]#sys.stdin = open(r'input.txt' , 'r')#sys.stdout = open(r'output.txt' , 'w')#for tt in range(INT()):  #CODE a , b = MAP()d = {'0':6,'1':2,'2':5,'3':5,'4':4,'5':5,'6':6,'7':3,'8':7,'9':6}sm = 0 for i in range(a , b + 1):    for j in str(i):        sm += d[j] print(sm)  