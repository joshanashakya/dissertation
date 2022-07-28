n,k=map(int,input().split(' '))if n%k==0:    print(n+k)else:    ans=0    i=n//k    while ans<n:        ans=k*i        i+=1         print(ans)
