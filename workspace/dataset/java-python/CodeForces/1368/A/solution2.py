# A. C+=t=int(input())for i in range(t):    i=0    a,b,n=map(int,input().split())    while a<=n and b<=n:        if a<b:            a+=b        else:            b+=a        i+=1    print(i)
