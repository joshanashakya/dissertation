def fac(a,b):    k = 1    for i in range(a+1,b+1):        k = k%10 * i%10        if k==0:            return 0    return k a, b = map(int,input().split())print(fac(a,b))
