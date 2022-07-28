n,s=map(int,input().split())r,t=100,0for i in range(n):    x,y=map(int,input().split())    if s>x or (s==x and y==0):        t=1        if y!=0:r=min(r,y)print(100-r if t else -1)
