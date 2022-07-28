n=int(input())x=list(map(int,input().split()))c=0s=0for i in range(1,n):    x[i]+=c    if x[i]<x[i-1]:        c+=x[i-1]-x[i]        x[i]=x[i-1]print(c)
