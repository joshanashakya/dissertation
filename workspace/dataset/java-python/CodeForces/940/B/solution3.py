n,k,a,b,s=int(input()),int(input()),int(input()),int(input()),0if(k>1):    while(((n//k)*(k-1)*a)>b):        s+=(n%k)*a+b        n//=kprint(int(s+(n-1)*a))
