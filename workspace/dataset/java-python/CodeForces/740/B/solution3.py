n,q=map(int,input().split())a=list(map(int,input().split()))b=[a[0]]for i in range(1,n):    b.append(b[i-1]+a[i]) ans=0for i in range(q):    x,y=map(int,input().split())    temp=b[y-1]    if x!=1:        temp-=b[x-2]    ans=max(ans,ans+temp)print(ans)
