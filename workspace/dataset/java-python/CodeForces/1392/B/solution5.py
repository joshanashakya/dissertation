#!/usr/bin/env python
from __future__ import division, print_function
import math
import os
import sys
from sys import stdin, stdout
from io import BytesIO, IOBase
from itertools import accumulate
from collections import deque

# sys.setrecursionlimit(10**5)
if sys.version_info[0] < 3:
    from __builtin__ import xrange as range
    from future_builtins import ascii, filter, hex, map, oct, zip
# sys.setrecursionlimit(10**6)

# region fastio

BUFSIZE = 8192


class FastIO(IOBase):
    newlines = 0

    def __init__(self, file):
        self._fd = file.fileno()
        self.buffer = BytesIO()
        self.writable = "x" in file.mode or "r" not in file.mode
        self.write = self.buffer.write if self.writable else None

    def read(self):
        while True:
            b = os.read(self._fd, max(os.fstat(self._fd).st_size, BUFSIZE))
            if not b:
                break
            ptr = self.buffer.tell()
            self.buffer.seek(0, 2), self.buffer.write(b), self.buffer.seek(ptr)
        self.newlines = 0
        return self.buffer.read()

    def readline(self):
        while self.newlines == 0:
            b = os.read(self._fd, max(os.fstat(self._fd).st_size, BUFSIZE))
            self.newlines = b.count(b"\n") + (not b)
            ptr = self.buffer.tell()
            self.buffer.seek(0, 2), self.buffer.write(b), self.buffer.seek(ptr)
        self.newlines -= 1
        return self.buffer.readline()

    def flush(self):
        if self.writable:
            os.write(self._fd, self.buffer.getvalue())
            self.buffer.truncate(0), self.buffer.seek(0)


class IOWrapper(IOBase):
    def __init__(self, file):
        self.buffer = FastIO(file)
        self.flush = self.buffer.flush
        self.writable = self.buffer.writable
        self.write = lambda s: self.buffer.write(s.encode("ascii"))
        self.read = lambda: self.buffer.read().decode("ascii")
        self.readline = lambda: self.buffer.readline().decode("ascii")


def print(*args, **kwargs):
    """Prints the values to a stream, or to sys.stdout by default."""
    sep, file = kwargs.pop("sep", " "), kwargs.pop("file", sys.stdout)
    at_start = True
    for x in args:
        if not at_start:
            file.write(sep)
        file.write(str(x))
        at_start = False
    file.write(kwargs.pop("end", "\n"))
    if kwargs.pop("flush", False):
        file.flush()


if sys.version_info[0] < 3:
    sys.stdin, sys.stdout = FastIO(sys.stdin), FastIO(sys.stdout)
else:
    sys.stdin, sys.stdout = IOWrapper(sys.stdin), IOWrapper(sys.stdout)

input = lambda: sys.stdin.readline().rstrip("\r\n")


# -----------------------------------------------------------------

def regularbracket(t):
    p = 0
    for i in t:
        if i == "(":
            p += 1
        else:
            p -= 1
        if p < 0:
            return False
    else:
        if p > 0:
            return False
        else:
            return True


# -------------------------------------------------
def binarySearchCount(arr, n, key):
    left = 0
    right = n - 1

    count = 0

    while (left <= right):
        mid = int((right + left) / 2)

        # Check if middle element is
        # less than or equal to key
        if (arr[mid] <= key):
            count = mid + 1
            left = mid + 1

        # If key is smaller, ignore right half
        else:
            right = mid - 1
    return count


# ------------------------------reverse string(pallindrome)
def reverse1(string):
    pp = ""
    for i in string[::-1]:
        pp += i
    if pp == string:
        return True
    return False


# --------------------------------reverse list(paindrome)
def reverse2(list1):
    l = []
    for i in list1[::-1]:
        l.append(i)
    if l == list1:
        return True
    return False


def mex(list1):
    # list1 = sorted(list1)
    p = max(list1) + 1
    for i in range(len(list1)):
        if list1[i] != i:
            p = i
            break
    return p


def sumofdigits(n):
    n = str(n)
    s1 = 0
    for i in n:
        s1 += int(i)
    return s1


def perfect_square(n):
    s = math.sqrt(n)
    if s == int(s):
        return True
    return False


# print(perfect_square(16))
# endregion-------------------------------------------

def soretd(s):
    for i in range(1, len(s)):
        if s[i - 1] > s[i]:
            return False
    return True


# print(soretd("1"))

def luckynumwithequalnumberoffourandseven(x, n, a):
    if x >= n and str(x).count("4") == str(x).count("7"):
        a.append(x)
    else:
        if x < 1e12:
            luckynumwithequalnumberoffourandseven(x * 10 + 4, n, a)
            luckynumwithequalnumberoffourandseven(x * 10 + 7, n, a)
    return a


# endregio------------------------------
"""
def main():
    t = int(input())
    for _ in range(t):
        n,m = map(int,input().split())
        l=[]
        ans=[]
        p=[]
        for i in range(m):
            arr = list(map(int,input().split()))
            arr.pop(0)
            p.append(arr)
            for j in arr:
                l.append(j)
        f = (m+1)//2
        #print(p)
        l = sorted(l)
        sett = set(l)
        sett = list(sett)
        #print(sett)
        for i in sett:
            if l.count(i)<=f:
                ans+=[i]*l.count(i)
            else:
                ans+=[i]*(f)
        print(ans)
        if len(ans)>=n:
            print("YES")
            for i in range(m):
                for j in range(len(p[i])):
                    if p[i][j] in ans:
                        print(p[i][j],end=" ")
                        ans.remove(p[i][j])
                        break
            print()
        else:
            print("NO")
if __name__ == '__main__':
    main()
"""


def main():
    for _ in range(int(input())):
        n, k = map(int, (input()).split())
        arr = list(map(int, input().split()))
        d = max(arr)
        for i in range(len(arr)):
            arr[i] = d - arr[i]
        ans1 = arr.copy()
        d = max(arr)
        for i in range(len(arr)):
            arr[i] = d - arr[i]
        ans2 = arr.copy()
        if k % 2 == 0:
            print(*ans2)
        else:
            print(*ans1)


if __name__ == '__main__':
    main()
