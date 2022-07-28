import os
import sys
from io import BytesIO, IOBase
from collections import Counter
import math as mt

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


sys.stdin, sys.stdout = IOWrapper(sys.stdin), IOWrapper(sys.stdout)


def gcd(a, b):
    if a == 0:
        return b
    return gcd(b % a, a)


def lcm(a, b):
    return (a * b) / gcd(a, b)


mod = int(1e9) + 7


def power(k, n):
    if n == 0:
        return 1
    if n % 2:
        return (power(k, n - 1) * k) % mod
    t = power(k, n // 2)
    return (t * t) % mod


def totalPrimeFactors(n):
    count = 0
    if (n % 2) == 0:
        count += 1
        while (n % 2) == 0:
            n //= 2

    i = 3
    while i * i <= n:
        if (n % i) == 0:
            count += 1
            while (n % i) == 0:
                n //= i
        i += 2
    if n > 2:
        count += 1
    return count


# #MAXN = int(1e7 + 1)
# # spf = [0 for i in range(MAXN)]
#
#
# def sieve():
#     spf[1] = 1
#     for i in range(2, MAXN):
#         spf[i] = i
#     for i in range(4, MAXN, 2):
#         spf[i] = 2
#
#     for i in range(3, mt.ceil(mt.sqrt(MAXN))):
#         if (spf[i] == i):
#             for j in range(i * i, MAXN, i):
#                 if (spf[j] == j):
#                     spf[j] = i
#
#
# def getFactorization(x):
#     ret = 0
#     while (x != 1):
#         k = spf[x]
#         ret += 1
#         # ret.add(spf[x])
#         while x % k == 0:
#             x //= k
#
#     return ret


# Driver code

# precalculating Smallest Prime Factor
# sieve()


def main():
    for _ in range(int(input())):
        n = int(input())
        a = list(map(int, input().split()))
        prev = -1
        now = 0
        while 1:
            maxx = 0
            ind = -1
            for i in range(n):
                if i != prev and a[i] > maxx:
                    maxx = a[i]
                    ind = i
            if maxx == 0:
                if now == 0:
                    print('HL')
                else:
                    print('T')
                break
            now ^= 1
            a[ind] -= 1
            prev = ind

    return


if __name__ == "__main__":
    main()
