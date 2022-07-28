n=int(input())x=list(map(int,input().split()))l=len(x)c=0d=x[2]-x[0]for i in range(1,l):    c=max(x[i]-x[i-1],c)    if i>=2:        d=min(x[i]-x[i-2],d)print(max(c,d))
