from sys import stdin,stdoutfrom collections import defaultdictfrom heapq import heapify,heappop,heappushnmbr = lambda: int(stdin.readline())lst = lambda: list(map(int,stdin.readline().split()))PI=float('inf')def dijsktra():    dist=[PI]*(1+n)    dist[1]=0    # vis=[0]*(1+n)    hp=[]    heappush(hp,(0,1))    while hp:        curDis,curNode=heappop(hp)        # if vis[curNode]:continue        # vis[curNode]=1        for neigh,wt in g[curNode]:            # if vis[neigh]:continue            eff_wt=wt            if curDis in t[curNode]:eff_wt+=t[curNode][curDis]-curDis            if curDis+eff_wt<dist[neigh]:                dist[neigh]=curDis+eff_wt                heappush(hp,(curDis+eff_wt,neigh))    # print(dist)    return dist[n] for _ in range(1):#nmbr()):    n,eg=lst()    g=defaultdict(list)    for i in range(eg):        u,v,wt=lst()        g[u]+=[[v,wt]]        g[v]+=[[u,wt]]    t=[{} for _ in range(1+n)]    for ii in range(1,1+n):        aa=lst()        if aa[0]!=0:            for i in range(aa[0],0,-1):                if aa[i]+1 in t[ii]:t[ii][aa[i]]=t[ii][aa[i]+1]                else:t[ii][aa[i]]=aa[i]+1    # print(t)    ans=dijsktra()    print(ans if ans!=PI else -1) # 8 10# 1 2 3# 2 8 3# 1 4 1# 4 3 6# 3 7 7# 4 5 5# 5 7 2# 7 8 1# 1 6 8# 6 8 7# 0# 4 1 2 3 4# 0# 0# 0# 0# 0# 0
