gg=int(input())for i in range(gg):    n,m=map(int,input().split())    if(n<=m):        print((n*(n-1)//2)+1)    else:        print(m*(m+1)//2)
