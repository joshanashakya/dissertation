import mathn,o=int(input()),0for i in range(n):    r,t=map(int,input().split())    r+=math.ceil(math.log(t,4))    r+=t==1    o=max(o,r)print(o)
