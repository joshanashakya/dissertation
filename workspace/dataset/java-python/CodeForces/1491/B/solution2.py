R = lambda: map(int, input().split())
t, = R()
exec(t * 'n,u,v=R();a=*R(),;u=min(u,v);print((u+v,u,0)[min(2,max(abs(x-y)for x,y in zip(a,a[1:])))]);')
