def STR(): return list(input())def INT(): return int(input())def MAP(): return map(int, input().split())def MAP2():return map(float,input().split())def LIST(): return list(map(int, input().split()))def STRING(): return input()import stringimport sysfrom heapq import heappop , heappushfrom bisect import *from collections import deque , Counter , defaultdictfrom math import *from itertools import permutations , accumulatedx = [-1 , 1 , 0 , 0  ]dy = [0 , 0  , 1  , - 1]#visited = [[False for i in range(m)] for j in range(n)]#sys.stdin = open(r'input.txt' , 'r')#sys.stdout = open(r'output.txt' , 'w')#for tt in range(INT()):  #CODE n = INT()s = STR()cnt = 0x = s[0]c1 = 0i = 0while s[i] == x :    c1+=1    i+=1y = s[n-1]c2 = 0j = n-1while s[j] ==y :    c2+=1    j-=1 if s[0] == s[-1]:    print((c1+1)*(c2+1) % 998244353  )else:    print((c1 + c2 + 1) % 998244353   )   