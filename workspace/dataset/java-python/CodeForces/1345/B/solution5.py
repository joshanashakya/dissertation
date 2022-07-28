t = int(input()) for i in range(t):    n = int(input())    count = 0    while n>=2:        k = (-1+(1+24*n)**0.5)//6        count += 1        n -= (3*k**2 + k)//2    print(count)
