from sys import stdin,stdoutnmbr = lambda: int(stdin.readline())lst = lambda: list(map(int,stdin.readline().split()))for _ in range(1):#nmbr()):    mp={}    sx=set()    sy=set()    f=1    for i in range(8):        a,b=lst()        sx.add(a)        sy.add(b)        mp[a,b]=1    if len(sx)!=3 or len(sy)!=3:        print('ugly')        continue    a,b,c=sorted(sx)    a1,b1,c1=sorted(sy)    for i in [a,b,c]:        for j in [a1,b1,c1]:            if i==b and j==b1:continue            if (i,j) not in mp:                f=0                break    print('respectable' if f else 'ugly')