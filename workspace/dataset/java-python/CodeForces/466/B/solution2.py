n,a,b=map(int,input().split())e=n*6while e>a*b:    q,w=min(a,b),max(a,b)    for i in range(q,int(e**.5)+1):        if e%i==0:            if q<=i and w<=e//i:q,w=i,e//i;break            if q<=e//i and w<=i:q,w=e//i,i;break    if b>a:a,b=q,w    else:a,b=w,q    if e>a*b:e+=1print(a*b,a,b)
