import itertools as itimport collections as ccimport heapq as hpimport sysimport collections as ccinput=sys.stdin.readlineI=lambda : list(map(int,input().split()))n,m=I()edg=[]g=[[0]*(n) for i in range(n)]deg=[0]*(n)for i in range(m):	x,y=I()	x-=1;y-=1	edg.append([x,y])	g[x][y]=1	g[y][x]=1	deg[x]+=1	deg[y]+=1ans=10**9+7tf=0for i in edg:	x,y=i	for j in range(n):		if g[x][j] and g[y][j]:			temp=deg[x]+deg[y]+deg[j]-6			ans=min(ans,temp)			tf=1if tf:	print(ans)else:	print(-1)   