n,x=map(int,input().split())count=0for i in range(1,n+1):    if x%i==0 and x//i<=n and i<=n:        count=count+1print(count)
