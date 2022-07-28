n,a,b=map(int,input().split())if a*b<n:print(-1);exit()for i in range(a):    x = [str(j)if j<=n else'0'for j in range(i*b+1,(i+1)*b+1)]    if i&1==0:        x=list(reversed(x))    print(' '.join(x))
