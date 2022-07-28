t=int(input())while t:     import math     n = int(input())    if n == 1 or n == 2:        print(0)    else:        value = math.floor(n / 2) + 1        print(n - value)    t-=1 
