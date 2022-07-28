n,b,p=map(int,input().split())ans=0x=nwhile(n>1):    ans = ((n//2)*2*b) + (n//2) + ans    n= (n//2 )+ (n - ((n//2)*2))print(ans,x*p)
