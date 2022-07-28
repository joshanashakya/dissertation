n,m=map(int,raw_input().split())a=map(int,raw_input().split())ans=0.0for i in range(m):    x,y,z=map(int,raw_input().split())    ans=max(ans,1.0*(a[x-1]+a[y-1])/(1.0*z))print ('%.15f'%ans)
