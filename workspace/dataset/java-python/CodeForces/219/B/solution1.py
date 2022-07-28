a,b=map(int,input().split())a=a+1n=ak=10while(True):    if ((a%k)>b):        break    n=a-(a%k)    k*=10print(n-1)
