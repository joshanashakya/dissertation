# import sys#import math#sys.stdout=open("python/output.txt","w")#sys.stdin=open("python/input.txt","r")t=int(input())for i in range(t):    n=int(input())    a=list(map(int,input().split()))    b=list(map(int,input().split()))    c=list(map(int,input().split()))    l=[]    l.append(a[0])    for i in range(1,n):        if i!=(n-1):            if a[i]!=l[i-1]:                l.append(a[i])            elif b[i]!=l[i-1]:                l.append(b[i])            else:                l.append(c[i])        else:            if a[i]!=l[0] and a[i]!=l[i-1]:                l.append(a[i])            elif b[i]!=l[0] and b[i]!=l[i-1]:                l.append(b[i])            else:                l.append(c[i])     for i in range(n):        print(l[i],end=" ")    print()           