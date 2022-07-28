from sys import stdin, stdout
from math import log2

nmbr = lambda: int(stdin.readline())
lst = lambda: list(map(int, stdin.readline().split()))
PI = float('inf')


def RMQ(low, high):
    l = high - low + 1
    k = int(log2(l))
    return min(a[sp[low][k]], a[sp[low + l - (1 << k)][k]])


for _ in range(1):  # nmbr()):
    n = nmbr()
    a = lst()
    col = int(log2(n)) + 1
    sp = [[0 for _ in range(col + 1)] for _ in range(n)]
    for i in range(n):
        sp[i][0] = i
    j = 1
    while (1 << j) <= n:
        i = 0
        while (i + (1 << j) - 1) < n:
            if a[sp[i][j - 1]] < a[sp[i + (1 << (j - 1))][j - 1]]:
                sp[i][j] = sp[i][j - 1]
            else:
                sp[i][j] = sp[i + (1 << (j - 1))][j - 1]
            i += 1
        j += 1
    for i in range(n):
        l, r = i + 1, n - 1
        while l <= r:
            mid = (l + r) >> 1
            if RMQ(mid, n - 1) < a[i]:
                l = mid + 1
            else:
                r = mid - 1
        # print(a[i],r)
        stdout.write(str(r - i - 1) + ' ')
