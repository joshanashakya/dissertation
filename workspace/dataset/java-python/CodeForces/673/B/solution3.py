a,b=map(int,input().split())l,r=1,afor _ in " "*b:u,v=sorted(map(int,input().split()));l=max(l,u);r=min(r,v)print(max(r-l,0))
