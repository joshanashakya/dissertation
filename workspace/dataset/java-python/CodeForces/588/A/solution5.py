n=int(input())c=0for i in range(n):    a,b=map(int,input().split())    if i==0:        m=b        c=a*b    else:        m=min(m,b)        c=c+m*aprint(c)    
