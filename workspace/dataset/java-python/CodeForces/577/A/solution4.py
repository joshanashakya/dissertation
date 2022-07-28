a=list(map(int,input().split()))n=a[0]x=a[1]c=0for i in range(1,n+1):    if x%i==0 and x/i<=n:        c=c+1print(c)            
