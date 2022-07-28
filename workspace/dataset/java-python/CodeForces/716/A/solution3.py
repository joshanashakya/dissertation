n,x=map(int,input().split())a=list(map(int,input().split()))c=0for i in range(1,n):    if((a[i]-a[i-1])<=x):        c=c+1    else:        c=0print(c+1)    
