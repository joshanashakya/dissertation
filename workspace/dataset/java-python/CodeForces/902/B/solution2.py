import syssys.setrecursionlimit(10**9)from collections import defaultdict    def dfs(nd):    vis[nd]=1    for i in graph[nd]:        if vis[i]==0:            if col[i-1]==col[nd-1]:                dfs(i)            else:                q.append(i)                      for _ in range(1):    n=int(input())    graph=defaultdict(list)        l=list(map(int,input().split()))    col=list(map(int,input().split()))    for i in range(2,n+1):         graph[i].append(l[i-2])        graph[l[i-2]].append(i)    vis=[0]*(n+1)    q=[1]    tc=0    while(q):        tc+=1        dfs(q.pop(0))            print(tc)    