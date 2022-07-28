y, k, n = map(int,input().split())x=k-y%kif x+y>n:    print('-1')while x+y<=n:    print(x)    x+=k
