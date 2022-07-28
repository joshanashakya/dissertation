import math
import sys
import collections
import bisect
import time


def get_ints(): return map(int, sys.stdin.readline().strip().split())


def get_list(): return list(map(int, sys.stdin.readline().strip().split()))


def get_string(): return sys.stdin.readline().strip()


for t in range(int(input())):
    r, g, b, w = get_ints()
    ans = [r, g, b, w]
    odd = 0
    for i in ans:
        if i % 2 == 1:
            odd += 1
    if odd <= 1:
        print("Yes")
        continue
    change = min(r, g, b, 1)
    r -= change
    g -= change
    b -= change
    w += change
    ans = [r, g, b, w]
    odd = 0
    for i in ans:
        if i % 2 == 1:
            odd += 1
    if odd <= 1:
        print("Yes")
        continue
    print("No")
