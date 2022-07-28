a=int(input())for i in range (a):    c,d=map(int,input().split())    c,d=min(c,d),max(c,d)    if (2*c>d):        print (2*2*c*c)    else:        print (d*d)
