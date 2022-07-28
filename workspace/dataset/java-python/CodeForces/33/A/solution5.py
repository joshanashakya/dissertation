n,m,k=map(int,input().split())un=[1000001]*mfor i in range(n):    q,w=map(int,input().split())    un[q-1]=min(un[q-1],w)ans=0for i in range(m):    ans+=un[i]print(min(ans,k))
