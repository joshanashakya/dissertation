t=int(input())for _ in range(t):    n,l=map(int,input().split())    a=[]    m=0    ans=10**10    for i in range(n):        x,y=map(int,input().split())        m=max(m,x)        a.append([x,y])    d=0    for i in range(n):        if a[i][0]>a[i][1]:            d=max(d,a[i][0]-a[i][1])    if d==0:        if m<l:            print(-1)        else:            print(1)    else:        l=l-m        ans=max(l//d +bool(l%d)+1,1)        print(ans)