def fun(n,k):    n=int(n)    k=int(k)    a = list(map(int, input().split()))    if k>n:        a.sort()        print(a[-1])        exit(0)    p=a[0]    s=0    for i in range(1,n):        if p>a[i]:            s+=1        else:            p=a[i]            s=1        if s<k:            continue        break    print(p)a,b=input().split()fun(int(a),int(b))
