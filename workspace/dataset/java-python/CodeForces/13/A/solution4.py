from math import gcdn,s=int(input()),0for i in range(2,n):  k=n  while k!=0:    s+=k%i    k//=ip=gcd(s,n-2)print(f'{s//p}/{(n-2)//p}')
