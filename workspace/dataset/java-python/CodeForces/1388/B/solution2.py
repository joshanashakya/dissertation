# cook your dish here
import sys
from collections import defaultdict, deque
import math

INF = float('inf')
MOD = 10 ** 9 + 7;
# MOD = 998244353;
read = lambda: [int(s) for s in sys.stdin.readline().split()]

_ = 1
_ = int(input())

while _:
    n, = read()

    n8 = math.ceil(n / 4)

    n9 = n - n8

    res = ""
    for i in range(n9):
        res += "9"

    for i in range(n8):
        res += "8"

    print(res)

    _ -= 1
