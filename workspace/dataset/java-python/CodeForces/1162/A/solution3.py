n,h,m=map(int,input().split())l=[h]*nfor i in range (0,m):    p,r,x=map(int,input().split())    for j in range (p-1,r):        if (l[j]>x ):            l[j]=x        else:            passc=0for i in range (n):    c=c+l[i]*l[i]print(c)
