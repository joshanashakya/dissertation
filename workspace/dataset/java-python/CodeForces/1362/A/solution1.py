import math  a=int(input())for i in range (a):    c,d=map(int,input().split())    c,d=min(c,d),max(c,d)    num=0;    while (c!=d):        if (math.floor(d/c)==d//c and (d//c)%8==0):            c*=8            num+=1        elif (math.floor(d/c)==d//c and d//c%4==0):            c*=4            num+=1        elif (math.floor(d/c)==d//c and d//c%2==0):            c*=2            num+=1        else:            num=-1            break    print (num)
