from  math import *t=int(input())for _ in range(t):    n=int(input())     i=2    res=n-1    while i<=sqrt(n):        if n%i==0:            res=n//i            break        i+=1     print(res,n-res)
