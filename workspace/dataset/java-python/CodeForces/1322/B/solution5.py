for z in range(1):    co=0    n=int(input())    l=list(map(int, input().split()))    for e in range(1,25):        po=2**e        re=sorted([k%po for k in l])        b=n        r=0        for a in range(n):            b-=1            while re[a]+re[b]>=po and b>=0:                b-=1            b+=1            r+=n-b-(a>=b)        r//=2        if r%2:            co+=2**e    if n%2==0:        for k in l:            co=co^k    print(co)