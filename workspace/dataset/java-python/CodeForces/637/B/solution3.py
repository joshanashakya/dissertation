n=int(input())l1=[]d= dict()for i in range(n):    x=input()    l1.append(x)    d[x]=0for j in range(n-1,-1,-1):    v=l1[j]    if(d[v]==0):        print(v)        d[v]=1
