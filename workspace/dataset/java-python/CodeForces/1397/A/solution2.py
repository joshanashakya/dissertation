import sys

input = sys.stdin.readline
import math

for _ in range(int(input())):
    n = int(input())
    s = ""
    for i in range(n):
        s += input()
    b = [0] * 200
    for i in s:
        b[ord(i)] += 1
    ok = 1
    for i in range(len(b)):
        if b[i] % n != 0:
            ok = 0
    if ok == 0:
        print("NO")
    else:
        print("YES")
