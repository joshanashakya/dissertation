t = int(input()) while t>0:    a,b,n = map(int, input().split())    xorval = a^b    if n%3==0:        print(a)    elif n%3 == 1:        print(b)    else:        print(xorval)    t-=1
