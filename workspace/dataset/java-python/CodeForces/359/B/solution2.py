n,k = map(int,input().split())a=[i+1 for i in range(n*2)]for i in range(1,k+1):    a[2*(i-1)],a[(2*i)]=a[2*i],a[2*(i-1)]print(*a)
