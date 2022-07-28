from math import *n=int(input())ls=[int(x) for x in input().split()]g=0for i in ls:g=gcd(g,i)x=max(ls)//gif (x-n)&1:print('Alice')else: print('Bob')
