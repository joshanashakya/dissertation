n=int(input()) if(n==1):    print(1)else:    ans=2*n-1    while(n>=2):        ans+=4*n-6        n-=1    print(ans)    
