from sys import stdininput=stdin.readlinen=int(input())a=list(map(int,input().split()))e,z,ans,o=1,0,0,0for i in range(n):    z+=(a[i]<0)    if z%2:        ans+=e    else:        ans+=o    e+=z%2==0    o+=z%2print(ans,n*(n+1)//2-ans)