def STR(): return list(input())def INT(): return int(input())def MAP(): return map(int, input().split())def MAP2():return map(float,input().split())def LIST(): return list(map(int, input().split()))def STRING(): return input()import stringimport sysfrom heapq import heappop , heappushfrom bisect import *from collections import deque , Counter , defaultdictfrom math import *from itertools import permutations , accumulatedx = [-1 , 1 , 0 , 0  ]dy = [0 , 0  , 1  , - 1]#visited = [[False for i in range(m)] for j in range(n)]#sys.stdin = open(r'input.txt' , 'r')#sys.stdout = open(r'output.txt' , 'w')#for tt in range(INT()): #Code def to_decimal(num):    base = 1    res = 0    while num > 0 :        l = num % 10        num//=10        res += base * l        base*= 2     return res l ,r = MAP()count = 0 for i in range(1 , 61):    for j in range(61):        s = '1' * i + '0' + '1' * j        k = to_decimal(int(s))        if l<=k<=r:            count+=1 print(count)  