import math n=int(input())a=list(map(int,input().split())) e=0for i in range(n):    e+=a[i]-1    if e%2==0:        print(2)    else:        print(1)    
