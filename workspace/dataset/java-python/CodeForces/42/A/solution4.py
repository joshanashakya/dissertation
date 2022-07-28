n,v=map(int,input().split())a=list(map(int,input().split()))b=list(map(int,input().split()))r=min(b[i]/a[i]*sum(a) for i in range(n))print(min(r,v))
