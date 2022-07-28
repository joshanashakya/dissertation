import sys input = lambda: sys.stdin.readline().rstrip("\r\n")
from math import sqrt, ceil, gcd  n, m = map(int, input().split())
a = list(map(int, input().split()))
b = list(map(int, input().split()))
t = a[0]
for i in range(n):    a[
    i] -= tans=0  # print(a)ck=0for i in a:    ck=gcd(ck,i)#print(ck)for i in b:    print(gcd(t+i,ck),end=' ')print()
