from math import ceiln, m = list(map(int, input().split()))if m == 0:    print(1)elif m <= (n // 2):    print(m)else:    if n % 2 != 0 and m == ceil(n/2):        print(n//2)    else:        print(n-m)