# CodeForces
# Jason Zhong
import math

cases = int(input())
for c in range(cases):
    n, m, pos = map(int, input().split())
    row = pos % n if pos % n != 0 else n
    col = (pos - 1) // n + 1
    answ = (row - 1) * m + col
    print(answ)
