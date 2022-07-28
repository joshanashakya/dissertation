from math import *p = int(input())cnt=0c=0d=0for i in range(1,p):    if gcd(i,p-1)==1:        cnt+=1print(cnt)
