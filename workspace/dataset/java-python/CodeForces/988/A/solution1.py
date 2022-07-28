R=lambda:map(int,input().split())n,k=R()d=dict(zip(R(),range(1,n+1)))if len(d)<k:print('NO')else: print('YES');print(*list(d.values())[:k])
