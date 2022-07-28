l,r,k=map(int,input().split())ans=1;c=0while(ans<l):       ans=ans*kwhile(ans<=r):    c=c+1    print(ans)    ans=ans*kif(c==0):    print(-1)
