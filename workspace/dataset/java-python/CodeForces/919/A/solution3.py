import sys n,m=map(int,input().split())k=sys.maxsizefor _ in range(n):    x,y=map(int,input().split())    k=min(k,x/y)print(round(m*k,8))
