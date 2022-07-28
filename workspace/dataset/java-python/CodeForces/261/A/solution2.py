I=lambda:map(int,input().split())m,q,n,a,r,k=int(input()),min(I()),int(input())-1,sorted(I()),0,0while n>-1:    r+=a[n]    k+=1    if k==q:n-=3;k=0    else:n-=1print(r)
