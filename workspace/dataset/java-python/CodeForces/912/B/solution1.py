def STR(): return list(input())def INT(): return int(input())def MAP(): return map(int, input().split())def MAP2():return map(float,input().split())def LIST(): return list(map(int, input().split()))def STRING(): return input()import stringimport sysfrom heapq import heappop , heappushfrom bisect import *from collections import deque , Counter , defaultdictfrom math import *from itertools import permutations , accumulatedx = [-1 , 1 , 0 , 0  ]dy = [0 , 0  , 1  , - 1]#visited = [[False for i in range(m)] for j in range(n)]#sys.stdin = open(r'input.txt' , 'r')#sys.stdout = open(r'output.txt' , 'w')#for tt in range(INT()): n , k = MAP() if k == 1 :    print(n)else:    l = len(bin(n))-2    ans = (1<<l)    print(ans-1) 
