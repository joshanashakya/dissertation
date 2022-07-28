n,k=map(int,input().split())h=0for e,i in enumerate(input().split()):    h+=int(i)    k-=min(8,h)    h-=min(8,h)    if k<=0:print(e+1);breakelse:print(-1)
