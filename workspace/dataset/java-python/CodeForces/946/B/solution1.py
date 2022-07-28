n,m=map(int,input().split())while n>0 and m>0:    if n>=2*m:        n=n%(2*m)    elif m>=2*n:        m=m%(2*n)    else:        breakprint(n,m, sep=" ")             
