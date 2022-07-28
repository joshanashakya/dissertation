n,m=map(int,input().split())i=0c=0while i**2<=n:    if i+(n-i**2)**2==m:        c+=1    i+=1print(c)
