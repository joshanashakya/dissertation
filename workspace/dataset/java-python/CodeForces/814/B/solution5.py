def STR(): return list(input())def INT(): return int(input())def MAP(): return map(int, input().split())def MAP2():return map(float,input().split())def LIST(): return list(map(int, input().split()))def STRING(): return input()import stringimport sysfrom heapq import heappop , heappushfrom bisect import *from collections import deque , Counterfrom math import *from itertools import permutations , accumulatedx = [-1 , 1 , 0 , 0  ]dy = [0 , 0  , 1  , - 1]#visited = [[False for i in range(m)] for j in range(n)]#sys.stdin = open(r'input.txt' , 'r')#sys.stdout = open(r'output.txt' , 'w')#for tt in range(INT()): def valid(d):    for i in range(1 , n +1):        if i not in d :            return False    return True def cnt_diff(n , a , b):    cnt = 0    for i in range(n):        if a[i] != b[i]:            cnt+=1    return cnt n = INT()a = LIST()b = LIST()lst1 = []for i in range(n):    if a[i] != b[i]:        lst1.append(i) lst2 = []for i in range(1 , n + 1):    if i not in a :        lst2.append(i) for i in range(n):    for j in range(n):        d = a[:]        d[lst1[j]] = lst2[i]        if valid(d) and cnt_diff(n , d , b) == 1 and d != b :            print(*d)            exit(0)   
