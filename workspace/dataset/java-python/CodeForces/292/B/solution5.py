n,m=map(int,input().split())g=[0 for _ in range(n)]for _ in range(m):    x,y=map(int,input().split())    g[x-1]+=1    g[y-1]+=1if m==n and max(g)==min(g)==2:    print('ring topology')elif m==n-1 and max(g)<3:    print('bus topology')elif m==n-1 and max(g)==n-1:    print('star topology')else:    print('unknown topology')