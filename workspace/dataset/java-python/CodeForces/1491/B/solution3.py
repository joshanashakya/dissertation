R = lambda: map(int, input().split())
t, = R()
exec(t * 'n,u,v=R();a=*R(),;d=max(abs(x-y)for x,y in zip(a,a[1:]));print((v+min(u,v),min(u,v*max(0,2-d)))[d>0]);')
