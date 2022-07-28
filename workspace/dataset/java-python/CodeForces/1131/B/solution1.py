n=int(input())a,b=0,0;ans=1for  _ in range(n):  p,q=map(int,input().split());temp=0  if a!=b:temp=1  if  min(p,q)-max(a,b)+temp>=0:       ans+=min(p,q)-max(a,b)+temp         a,b=p,qprint(ans)
