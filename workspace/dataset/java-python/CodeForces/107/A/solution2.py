import sys,os,ioimport math,bisect,operatorinf,mod = float('inf'),10**9+7# sys.setrecursionlimit(10 ** 6)from itertools import groupby,accumulatefrom heapq import heapify,heappop,heappushfrom collections import deque,Counter,defaultdictI = lambda : int(sys.stdin.buffer.readline())Neo = lambda : list(map(int, sys.stdin.buffer.readline().split()))n,p = Neo()G = defaultdict(list)d = defaultdict(int)parent = [0]*(n+1)if p == 0:    print(0)    exit()for i in range(p):    a,b,c = Neo()    G[a].append(b)    d[(a,b)] = c    parent[b] = avis = [0]*(n+1)def hello(n):    vis[n] = 1    global f,t,last    last = n    for i in G[n]:        if vis[i]:            f = 0            return        t = min(t,d[(n,i)])            hello(i)             Ans = []# print(parent)for i in range(1,n+1):    if vis[i] or i not in G:        continue    f = 1    t = inf    last = -1    p = i    while parent[i] != 0 and parent[i] != p:        i = parent[i]        hello(i)        if f:        Ans.append((i,last,t)) Ans.sort()         print(len(Ans))for i,j,k in Ans:    print(i,j,k)            
