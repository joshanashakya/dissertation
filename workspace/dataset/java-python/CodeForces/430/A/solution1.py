from sys import stdin,stdoutnmbr = lambda: int(stdin.readline())lst = lambda: list(map(int,stdin.readline().split()))for _ in range(1):#nmbr()):    n,k=lst()    mp={}    a=lst()    for i in range(n):        mp[a[i]]=i    b=sorted(a)    turn=0    ans=[0]*n    for v in b:        ans[mp[v]]=turn&1        turn+=1    print(*ans)# 10 10# 3 4 2 6 1 9 0 5 8 7# 5 7# 2 6# 0 1# 5 6# 3 4# 2 5# 2 10# 4 6# 3 6# 3 7
