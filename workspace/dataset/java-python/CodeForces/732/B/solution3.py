n,k=map(int,input().split())l=list(map(int,input().split()))ans=0for i in range(1,n):    if l[i]+l[i-1]<k:        ans=ans+k-l[i]-l[i-1]        l[i]=l[i]+k-(l[i]+l[i-1])print(ans)print(*l)    
