"""#If FastIO not needed, use this and don't forget to strip#import sys, math#input = sys.stdin.readline""" import os, sys, heapq as h, timefrom io import BytesIO, IOBasefrom types import GeneratorTypefrom bisect import bisect_left, bisect_rightfrom collections import defaultdict as dd, deque as dq, Counter as dcimport math, stringBUFSIZE = 8192 class FastIO(IOBase):    newlines = 0    def __init__(self, file):        import os        self.os = os        self._fd = file.fileno()        self.buffer = BytesIO()        self.writable = "x" in file.mode or "r" not in file.mode        self.write = self.buffer.write if self.writable else None    def read(self):        while True:            b = self.os.read(self._fd, max(self.os.fstat(self._fd).st_size, BUFSIZE))            if not b:                break            ptr = self.buffer.tell()            self.buffer.seek(0, 2), self.buffer.write(b), self.buffer.seek(ptr)        self.newlines = 0        return self.buffer.read()    def readline(self):        while self.newlines == 0:            b = self.os.read(self._fd, max(self.os.fstat(self._fd).st_size, BUFSIZE))            self.newlines = b.count(b"\n") + (not b)            ptr = self.buffer.tell()            self.buffer.seek(0, 2), self.buffer.write(b), self.buffer.seek(ptr)        self.newlines -= 1        return self.buffer.readline()    def flush(self):        if self.writable:            self.os.write(self._fd, self.buffer.getvalue())            self.buffer.truncate(0), self.buffer.seek(0) class IOWrapper(IOBase):    def __init__(self, file):        self.buffer = FastIO(file)        self.flush = self.buffer.flush        self.writable = self.buffer.writable        self.write = lambda s: self.buffer.write(s.encode("ascii"))        self.read = lambda: self.buffer.read().decode("ascii")        self.readline = lambda: self.buffer.readline().decode("ascii") sys.stdin, sys.stdout = IOWrapper(sys.stdin), IOWrapper(sys.stdout)input = lambda: sys.stdin.readline().rstrip("\r\n") #start_time = time.time() def getInt(): return int(input())def getStrs(): return input().split()def getInts(): return list(map(int,input().split()))def getStr(): return input()def listStr(): return list(input())def getMat(n): return [getInts() for _ in range(n)]def isInt(s): return '0' <= s[0] <= '9' MOD = 10**9 + 7  """[1,1,1,1,4,4]We want the split to be as even as possible each timeCan we say that once we pass a certain point, there's no salvaging it? P^X = exp(log(P^X) = exp(X log P)""" T = getInt()for _ in range(1,T+1):    N, P = getInts()    A = getInts()    A.sort()    diff = 0    prev = A[-1]    i = N-1    while i >= 0:        while not diff and i >= 1 and A[i] == A[i-1]:            A.pop()            A.pop()            i -= 2        if i < 0: break        if diff and math.log(diff) + (prev-A[i])*math.log(P) > math.log(i+1): break        if diff: diff *= pow(P,prev-A[i])        if diff == 0:            diff += 1        else:            diff -= 1        prev = A[i]        i -= 1    diff *= pow(P,prev,MOD)    while i >= 0:        diff -= pow(P,A[i],MOD)        i -= 1        diff %= MOD    print(diff)
