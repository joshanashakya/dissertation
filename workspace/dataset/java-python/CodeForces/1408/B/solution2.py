import sys, os, ioimport

math, bisect, operatorinf, mod = float(
    'inf'), 10 ** 9 + 7  # sys.setrecursionlimit(10 ** 6)from itertools import groupby,accumulatefrom heapq import heapify,heappop,heappushfrom collections import deque,Counter,defaultdictinput = iter(sys.stdin.buffer.read().decode().splitlines()).__next__Neo = lambda : list(map(int,input().split()))test, = Neo()for i in range(test):    n,k = Neo()    A = Neo()    A.sort()    c = 0    if len(set(A)) == 1:        print(1)    elif k == 1:        if len(set(A)) == 1:            print(1)        else:            print(-1)    else:        for i,j in zip(A,A[1:]):            if j-i != 0:                c += 1        print(math.ceil(c/(k-1)))
