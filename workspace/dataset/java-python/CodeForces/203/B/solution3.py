a,b=map(int,input().split())z=[[0]*(a+4) for i in range(a+4)]def gh(i,j):    for i1 in range(i-2,i+1):        for j1 in range(j-2,j+1):            if i1<1 or j1<1:continue            ok=True            for i2 in range(i1,i1+3):                for j2 in range(j1,j1+3):                    if z[i2][j2]==0:ok=False;break                if not(ok):break            if ok:return ok    return False for _ in range(1,b+1):    u,v=map(int,input().split())    z[u][v]=1    if gh(u,v):exit(print(_))print(-1)
