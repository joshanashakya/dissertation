from sys import stdin, setrecursionlimit, stdout
# from collections import deque
from math import sqrt, floor, ceil, log, log2, log10, pi, gcd, sin, cos, asin


# from heapq import heapify, heappop, heappush, heapreplace, heappushpop
# from bisect import bisect_right, bisect_left

# setrecursionlimit(100000) #use "python" instead of "pypy" to avoid MLE

def ii(): return int(stdin.readline())


def fi(): return float(stdin.readline())


def mi(): return map(int, stdin.readline().split())


def fmi(): return map(float, stdin.readline().split())


def li(): return list(mi())


def si(): return stdin.readline().rstrip()


def lsi(): return list(si())


mod = 1000000007
res = ['NO', 'YES']

#######################################################################################
###########################    M Y     F U N C T I O N S    ###########################
#######################################################################################


#######################################################################################
###########################    M A I N     P R O G R A M    ###########################
#######################################################################################


test, test_case = 0, 1
test_case = ii()
while test < test_case:
    test += 1

    # print('Case #', test, ':', sep='')

    n, m, x = mi()
    c = ceil(x / n)
    r = x % n
    if not r:
        r = n
    print(m * (r - 1) + c)
