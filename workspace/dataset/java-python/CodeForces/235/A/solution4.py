import sys,os,ioimport math,bisect,operatorinf,mod = float('inf'),10**9+7# sys.setrecursionlimit(10 ** 6)from itertools import groupby,accumulatefrom heapq import heapify,heappop,heappushfrom collections import deque,Counter,defaultdictinput = iter(sys.stdin.buffer.read().decode().splitlines()).__next__Neo = lambda : list(map(int,input().split()))# test, = Neo()n = int(input())if n <= 2:    print(n)elif n % 2 == 1:    print(n*(n-1)*(n-2))elif n % 3 == 0:    print((n-1)*(n-2)*(n-3))else:    print(n*(n-1)*(n-3))