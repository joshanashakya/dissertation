def gcd(a,b):    while b:        a%=b        a,b=b,a    return an=int(input())l=list(map(int,input().split()))g=l[0]for i in range(1,n):    g=gcd(g,l[i])if g!=1:    print(-1)else:    a=l.count(1)    if a>0:        print(n-a)    else:        ans=float('inf')        for i in range(n):            g=l[i]            for j in range(i+1,n):                g=gcd(g,l[j])                if g==1:                    d=j-i+n-1                    #print(d)                    ans=min(ans,d)        print(ans)
