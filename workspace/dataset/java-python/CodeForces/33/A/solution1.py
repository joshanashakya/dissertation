n,m,k=list(map(int,input().split()))a=[[] for i in range(m)]for i in range(n):    r,c=list(map(int,input().split()))    a[r-1].append(c)b=0for i in range(m):    d=-1    for j in a[i]:        if d==-1 or j<d:            d=j    b+=dprint(min(b,k))
