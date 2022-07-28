from math import sqrtn=int(input())for i in range(2,int(sqrt(n))+1):    while n%(i**2)==0:        n//=iprint(n)
