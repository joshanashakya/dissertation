import osimport

sysfrom
io
import BytesIO, IOBaseimport

heapq as h
from bisect import bisect_left, bisect_rightimport

time
from types import GeneratorTypeBUFSIZE = 8192


class FastIO(IOBase):    newlines = 0


def __init__(self, file):        import os


self.os = os
self._fd = file.fileno()
self.buffer = BytesIO()
self.writable = "x" in file.mode or "r" not in file.mode
self.write = self.buffer.write if self.writable else None


def read(self):        while


True: b = self.os.read(self._fd, max(self.os.fstat(self._fd).st_size, BUFSIZE))
if not b:                break
ptr = self.buffer.tell()
self.buffer.seek(0, 2), self.buffer.write(b), self.buffer.seek(ptr)
self.newlines = 0
return self.buffer.read()


def readline(self):        while


self.newlines == 0: b = self.os.read(self._fd, max(self.os.fstat(self._fd).st_size, BUFSIZE))
self.newlines = b.count(b"\n") + (not b)
ptr = self.buffer.tell()
self.buffer.seek(0, 2), self.buffer.write(b), self.buffer.seek(ptr)
self.newlines -= 1
return self.buffer.readline()


def flush(self):        if


self.writable: self.os.write(self._fd, self.buffer.getvalue())
self.buffer.truncate(0), self.buffer.seek(0)


class IOWrapper(IOBase):    def


__init__(self, file): self.buffer = FastIO(file)
self.flush = self.buffer.flush
self.writable = self.buffer.writable
self.write = lambda s: self.buffer.write(s.encode("ascii"))
self.read = lambda: self.buffer.read().decode("ascii")
self.readline = lambda: self.buffer.readline().decode("ascii")
sys.stdin, sys.stdout = IOWrapper(sys.stdin), IOWrapper(sys.stdout)
input = lambda: sys.stdin.readline().rstrip("\r\n")
from collections import defaultdict as dd, deque as dq, Counter as dcimport

math, string
start_time = time.time()


def getInts():    return [int(s) for s in input().split()]


def getInt():    return int(input())


def getStrs():    return [s for s in input().split()]


def getStr():    return input()


def listStr():    return list(input())


def getMat(n):    return [getInts() for _ in range(n)]


def get_ints(): return map(int, sys.stdin.readline().split())


T = int(input())
for _ in range(T):  n = int(input())
c = 0;
ans = 0
while n > 0:    c += 1
coin = 0
if n % 2 == 1 or (n > 4 and n % 4 == 0):
    coin = 1;n -= 1    else:
    coin = n // 2;n = n // 2
ans += coin * (c % 2)
print(ans)     
