import sys;
import collections;
import math;
import bisect;
import heapqinf = sys.maxsizedef
get_ints():
return map(int, sys.stdin.readline().strip().split())


def get_array(): return list(map(int, sys.stdin.readline().strip().split()))


def input(): return sys.stdin.readline().strip()


mod = 1000000007 for _ in range(int(input())):    a, b, c = sorted(get_ints())
print(c + 1)
