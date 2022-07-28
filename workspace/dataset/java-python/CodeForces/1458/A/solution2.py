import sys, os, ioimport

math, bisect, operatorinf, mod = float(
    'inf'), 10 ** 9 + 7  # sys.setrecursionlimit(10 ** 6)from itertools import groupby,accumulatefrom heapq import heapify,heappop,heappushfrom collections import deque,Counter,defaultdictinput = iter(sys.stdin.buffer.read().decode().splitlines()).__next__Neo = lambda : list(map(int,input().split()))# test, = Neo()n,m = Neo()A = Neo()B = Neo()A.sort()for i in range(1,n):    A[i] -= A[0]if n == 1:    for i in B:        print(i+A[0],end=' ')else:    gcd = A[1]    for i in range(1,n):        gcd = math.gcd(gcd,A[i])    for i in B:        t = math.gcd(gcd,A[0]+i)        print(t,end=' ')
