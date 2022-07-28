n,k,t=map(int,input().split(" ") )# print(n,k,t)s=0if t<=k:    # s=k-(k-t)    print(t)elif t>k and t<=n:    print(k)else:    # s=t-(2*k)    s=(t-n)    print(k-s)         
