import math, sys, bisect, heapq, os
from collections import defaultdict, Counter, deque
from itertools import groupby, accumulate
from functools import lru_cache

# sys.setrecursionlimit(200000000)
int1 = lambda x: int(x) - 1


def input(): return sys.stdin.readline().rstrip('\r\n')


# input = iter(sys.stdin.buffer.read().decode().splitlines()).__next__
aj = lambda: list(map(int, input().split()))


def list3d(a, b, c, d): return [[[d] * c for j in range(b)] for i in range(a)]


# MOD = 1000000000 + 7
def Y(c):  print(["NO", "YES"][c])


def y(c):  print(["no", "yes"][c])


def Yy(c):  print(["No", "Yes"][c])


def solve():
    for _ in range(int(input())):
        n, k, z = aj()
        A = aj()
        B = list(accumulate(A))
        ans = 0
        for i in range(1, n):
            if i <= k:
                temp = B[i]
                back = min(z, math.ceil((k - i) / 2))
                temp += back * A[i - 1]
                forw = max(0, back - 1)
                temp += forw * A[i]
                rem = max(0, k - i - forw - back)
                if back:
                    temp += B[i + rem - 1] - B[i - 1]
                else:
                    temp += B[i + rem] - B[i]
                ans = max(ans, temp)
            # print(temp,back,forw,rem,B[i+rem] - B[i-1])
        print(ans)


try:
    # os.system("online_judge.py")
    sys.stdin = open('input.txt', 'r')
    sys.stdout = open('output.txt', 'w')
except:
    pass

solve()
