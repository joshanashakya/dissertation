t = int(input())for _ in range(t):    a,b,c = map(int,input().split())    if c<a:        print(c)    else:        if b%c==0:            print(b+c)        else:            print((c+b)-b%c)
