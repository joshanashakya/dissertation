import time #start_time = time.time()#def TIME_(): print(time.time()-start_time) import os, sysfrom io import BytesIO, IOBasefrom types import GeneratorTypefrom bisect import bisect_left, bisect_rightfrom collections import defaultdict as dd, deque as dq, Counter as dcimport math, string, heapq as hBUFSIZE = 8192 class FastIO(IOBase):    newlines = 0    def __init__(self, file):        import os        self.os = os        self._fd = file.fileno()        self.buffer = BytesIO()        self.writable = "x" in file.mode or "r" not in file.mode        self.write = self.buffer.write if self.writable else None    def read(self):        while True:            b = self.os.read(self._fd, max(self.os.fstat(self._fd).st_size, BUFSIZE))            if not b:                break            ptr = self.buffer.tell()            self.buffer.seek(0, 2), self.buffer.write(b), self.buffer.seek(ptr)        self.newlines = 0        return self.buffer.read()    def readline(self):        while self.newlines == 0:            b = self.os.read(self._fd, max(self.os.fstat(self._fd).st_size, BUFSIZE))            self.newlines = b.count(b"\n") + (not b)            ptr = self.buffer.tell()            self.buffer.seek(0, 2), self.buffer.write(b), self.buffer.seek(ptr)        self.newlines -= 1        return self.buffer.readline()    def flush(self):        if self.writable:            self.os.write(self._fd, self.buffer.getvalue())            self.buffer.truncate(0), self.buffer.seek(0) class IOWrapper(IOBase):    def __init__(self, file):        self.buffer = FastIO(file)        self.flush = self.buffer.flush        self.writable = self.buffer.writable        self.write = lambda s: self.buffer.write(s.encode("ascii"))        self.read = lambda: self.buffer.read().decode("ascii")        self.readline = lambda: self.buffer.readline().decode("ascii") sys.stdin, sys.stdout = IOWrapper(sys.stdin), IOWrapper(sys.stdout)input = lambda: sys.stdin.readline().rstrip("\r\n") def getInt(): return int(input())def getStrs(): return input().split()def getInts(): return list(map(int,input().split()))def getStr(): return input()def listStr(): return list(input())def getMat(n): return [getInts() for _ in range(n)]def getBin(): return list(map(int,list(input())))def isInt(s): return '0' <= s[0] <= '9'def ceil_(a,b): return a//b + (a%b > 0) MOD = 10**9 + 7 """ """ primes = [2,3,5,7,11,13,17,19,23,29,31] def solve():    N = getInt()    A = getInts()    ans = [0]*N    used = set()    for i,a in enumerate(A):        for j,p in enumerate(primes):            if a % p == 0:                ans[i] = j+1                used.add(j+1)                break    m = len(used)    lookup = [0]*12    idx = 1    for x in used:        lookup[x] = idx        idx += 1    print(m)    ans = [lookup[x] for x in ans]    print(*ans)    return for _ in range(getInt()):    #print(solve())    solve() #TIME_()
