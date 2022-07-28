import sys
from collections import *
from heapq import *
import math
import bisect


def input():
    return sys.stdin.readline()


for _ in range(int(input())):
    n = int(input())
    if n % 2:
        tmp = (n - 1) // 2
        print(1 + tmp)
    else:
        tmp = n // 2
        print(tmp + 1)
