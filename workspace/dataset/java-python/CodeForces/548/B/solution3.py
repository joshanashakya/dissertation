r=lambda:input().split()g=lambda s:max(map(len,"".join(s).split('0')))n,m,q=map(int,r())a=[r() for nn in range(n)]b=list(map(g,a))for qq in range(q):    x,y=map(int,r())    a[x-1][y-1]=str(1-int(a[x-1][y-1]))    b[x-1]=g(a[x-1])    print(max(b))