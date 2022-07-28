n,x,y=map(int,input().split())s=input()i=0;n=n-1;ans=0while i<x:    if s[n-i]=='1' and i!=y:        ans+=1    i+=1if s[n-y]=='0':    print(ans+1)else:    print(ans) 
