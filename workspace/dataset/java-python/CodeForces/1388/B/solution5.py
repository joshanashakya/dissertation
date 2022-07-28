from math import *
import sys

input = sys.stdin.readline
a = int(input())
for x in range(a):
    b = int(input())
    if b == 1:
        print(8)
    else:
        n = ceil(b / 4)
        t = ((b - n) * "9") + ((n) * "8")
        print(t)
