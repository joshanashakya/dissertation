fast=lambda:stdin.readline().strip()zzz=lambda:[int(i) for i in fast().split()]z,zz=input,lambda:list(map(int,z().split()))szz,graph,mod,szzz=lambda:sorted(zz()),{},10**9+7,lambda:sorted(zzz())from re import *from sys import *from math import *from heapq import *from queue import *from bisect import *from string import *from itertools import *from collections import *from math import factorial as ffrom bisect import bisect as bsfrom bisect import bisect_left as bslfrom collections import Counter as ccfrom itertools import accumulate as acdef lcd(xnum1,xnum2):return (xnum1*xnum2//gcd(xnum1,xnum2))def prime(x):    p=ceil(x**.5)+1    for i in range(2,p):        if (x%i==0 and x!=2) or x==0:return 0    return 1def dfs(u,visit,graph):    visit[u]=1    for i in graph[u]:        if not visit[i]:            dfs(i,visit,graph)def output(answer):    stdout.write(str(answer))###########################---Test-Case---#################################"""   If you Know me , Then you probably don't know me !  """###########################---START-CODING---##############################  def solve(x):    if x<10: return x    p=1    while x:        if x%10:p*=(x%10)        x//=10    return solve(p) ans=[[]]for i in range(9):ans+=[[0]*1000001] for i in range(1,1000001):    x=solve(i)    ans[x][i]+=1 for i in range(1,10):    for j in range(1,1000001):        ans[i][j]+=ans[i][j-1]  num=int(z())   for i in range(num):    l,r,k=zzz()    print(ans[k][r]-ans[k][l-1])                                                                                                                                                                   