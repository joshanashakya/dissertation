n=int(input())l=list(map(int,input().split()))c=1ans=0for i in range(n-1):    if 2*l[i]>=l[i+1]:        c=c+1    else:        ans=max(c,ans)        c=1ans=max(ans,c)print(ans)    
