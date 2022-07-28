import sys

input = sys.stdin.readline


def getInts():
    return [int(s) for s in input().split()]


def getInt():
    return int(input())


def getStrs():
    return [s for s in input().split()]


def getStr():
    return input().strip()


def listStr():
    return list(input().strip())


import collections as col
import math

"""

"""


def solve():
    N, D, M = getInts()
    A = getInts()
    A.sort(reverse=True)
    if N == 1 or A[0] <= M:
        return sum(A)
    safe, dangerous = [], []
    for a in A:
        if a <= M:
            safe.append(a)
        else:
            dangerous.append(a)
    safe_pref = [0]
    for s in safe:
        safe_pref.append(safe_pref[-1] + s)
    dang_pref = [0]
    for d in dangerous:
        dang_pref.append(dang_pref[-1] + d)
    # we can choose anything from 1 to (N-1)//(D+1) + 1 dangerous numbers
    # if we have x dangerous numbers, then we have N-x spaces. For (x-1) of these, there are an additional D spaces, so total N-(D+1)*x-1 safe numbers
    best = 0

    for x in range(1, min((N - 1) // (D + 1) + 2, len(dang_pref))):
        safe_num = min(N - x - (x - 1) * D, len(safe_pref) - 1)
        best = max(best, dang_pref[x] + safe_pref[safe_num])
    return best


# for _ in range(getInt()):
#    solve()
print(solve())
