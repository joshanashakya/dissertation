n,k=input().split(sep=' ')n=int(n)k=int(k)kcont=0 for i in range(0,k):    if n%10==0:        n=n/10    else:        n=n-1 print(int(n))
