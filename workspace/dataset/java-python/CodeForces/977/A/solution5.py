n,k=input().split()n=int(n)k=int(k)for i in range(k):    if(n%10==0):        n=int(n/10)    else:        n=n-1print(n)        
