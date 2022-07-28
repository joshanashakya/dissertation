t=int(input())for _ in range(t):    n=int(input())    a=0    for i in range(30):        if n&1<<i:            a+=1    print(2**a)
