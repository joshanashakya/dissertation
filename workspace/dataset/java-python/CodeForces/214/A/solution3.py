n,m=map(int,input().split())count=0a=0while a**2<=n:    b=n-a**2    if b>=0 and a+b**2==m:        count+=1    a+=1print(count)
