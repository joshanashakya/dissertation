import time,math as mt,bisect as bs,sysfrom sys import stdin,stdoutfrom collections import dequefrom fractions import Fractionfrom collections import Counterfrom collections import OrderedDictpi=3.14159265358979323846264338327950def II(): # to take integer input    return int(stdin.readline())def IP(): # to take tuple as input    return map(int,stdin.readline().split())def L(): # to take list as input    return list(map(int,stdin.readline().split()))def P(x): # to print integer,list,string etc..    return stdout.write(str(x)+"\n")def PI(x,y): # to print tuple separatedly    return stdout.write(str(x)+" "+str(y)+"\n")def lcm(a,b): # to calculate lcm    return (a*b)//gcd(a,b)def gcd(a,b): # to calculate gcd    if a==0:        return b    elif b==0:        return a    if a>b:        return gcd(a%b,b)    else:        return gcd(a,b%a)def bfs(adj,v): # a schema of bfs    visited=[False]*(v+1)    q=deque()    while q:        passdef sieve():    li=[True]*(2*(10**5)+5)    li[0],li[1]=False,False    for i in range(2,len(li),1):        if li[i]==True:            for j in range(i*i,len(li),i):                li[j]=False    prime=[]    for i in range((2*(10**5)+5)):        if li[i]==True:            prime.append(i)    return primedef setBit(n):    count=0    while n!=0:        n=n&(n-1)        count+=1    return countmx=10**7spf=[mx]*(mx+1)def SPF():    spf[1]=1    for i in range(2,mx+1):        if spf[i]==mx:            spf[i]=i            for j in range(i*i,mx+1,i):                if i<spf[j]:                    spf[j]=i    returndef readTree(n,e): # to read tree    adj=[set() for i in range(n+1)]    for i in range(e):        u1,u2=IP()        adj[u1].add(u2)    return adj#####################################################################################mod=10**9+7def solve():    n,l,r,ql,qr=IP()    li=L()    pref=[0]+[li[0]]+[0]*(n-1)    ans=1e9    for i in range(2,len(pref)):        pref[i]=pref[i-1]+li[i-1]    for i in range(n+1):        cost=pref[i]*l+(pref[n]-pref[i])*r        x,y=i,n-i        if (x>y):            cost+=(x-y-1)*ql        elif (y>x):            cost+=(y-x-1)*qr        ans=min(ans,cost)    print(int(ans))    return t=1for i in range(t):    solve()     #######   #  # #######   #     #  # ####   # #     #       #  # #   #  # #   #  # # #   #      #  ####  #  # ####   ####  # #######  #   # #### #    # #   #   #  