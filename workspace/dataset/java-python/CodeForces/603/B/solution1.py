n,k=map(int,input().split())m=10**9+7if k==0:    print(pow(n,n-1,m))elif k==1:    print(pow(n,n,m))else:    c=1    x=k    while x!=1:        x=(x*k)%n        c+=1    print(pow(n,(n-1)//c,m))    
