from math import *from collections import *from random import *from decimal import Decimalfrom heapq import *from bisect import *import sysinput=sys.stdin.readlinesys.setrecursionlimit(10**5)def lis():    return list(map(int,input().split()))def ma():    return map(int,input().split())def inp():    return int(input())def st():    return input().rstrip('\n')d=100000000000n,m=ma()for i in range(m):    x,y=ma()    d=min(d,y-x)r=[i for i in range(d+1)]i=0print(d+1)while(i<n):    print(r[i%(d+1)],end=" ")    i+=1                     
