ll = lambda: map(int, input().split())
t = lambda: int(input())
ss = lambda: input()
from math import log10, log2, ceil, factorial as f, \
    gcd  # from itertools import combinations_with_replacement as cs #from functools import reduce#from bisect import bisect_right as br,bisect_left as bl#from collections import Counter  for _ in range(t()):     n=t()    a=list(ll())     d=[0]*n    temp=max(a)    d[a.index(temp)]=1    l=[]    l.append(temp)        for i in range(n):        temp1=0        fx=-1        for j in range(n):            if d[j]==0 and gcd(temp,a[j])>temp1:                temp1=gcd(temp,a[j])                fx=j        if fx!=-1:            d[fx]=1            l.append(a[fx])            temp=temp1    print(*l)                     
