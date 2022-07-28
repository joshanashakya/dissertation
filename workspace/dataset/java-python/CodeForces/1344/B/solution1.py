import os, sysfrom io import BytesIO, IOBasefrom types import GeneratorTypefrom bisect import bisect_left, bisect_rightfrom collections import defaultdict as dd, deque as dq, Counter as dcimport math, stringimport heapq as h, timeBUFSIZE = 8192 class FastIO(IOBase):    newlines = 0    def __init__(self, file):        import os        self.os = os        self._fd = file.fileno()        self.buffer = BytesIO()        self.writable = "x" in file.mode or "r" not in file.mode        self.write = self.buffer.write if self.writable else None    def read(self):        while True:            b = self.os.read(self._fd, max(self.os.fstat(self._fd).st_size, BUFSIZE))            if not b:                break            ptr = self.buffer.tell()            self.buffer.seek(0, 2), self.buffer.write(b), self.buffer.seek(ptr)        self.newlines = 0        return self.buffer.read()    def readline(self):        while self.newlines == 0:            b = self.os.read(self._fd, max(self.os.fstat(self._fd).st_size, BUFSIZE))            self.newlines = b.count(b"\n") + (not b)            ptr = self.buffer.tell()            self.buffer.seek(0, 2), self.buffer.write(b), self.buffer.seek(ptr)        self.newlines -= 1        return self.buffer.readline()    def flush(self):        if self.writable:            self.os.write(self._fd, self.buffer.getvalue())            self.buffer.truncate(0), self.buffer.seek(0) class IOWrapper(IOBase):    def __init__(self, file):        self.buffer = FastIO(file)        self.flush = self.buffer.flush        self.writable = self.buffer.writable        self.write = lambda s: self.buffer.write(s.encode("ascii"))        self.read = lambda: self.buffer.read().decode("ascii")        self.readline = lambda: self.buffer.readline().decode("ascii") sys.stdin, sys.stdout = IOWrapper(sys.stdin), IOWrapper(sys.stdout)input = lambda: sys.stdin.readline().rstrip("\r\n") #start_time = time.time() def getInt(): return int(input())def getStrs(): return input().split()def getInts(): return list(map(int,input().split()))def getStr(): return input()def listStr(): return list(input())def getMat(n): return [getInts() for _ in range(n)]def getBin(): return list(map(int,list(input())))def isInt(s): return '0' <= s[0] <= '9'def ceil_(a,b): return a//b + (a%b > 0) MOD = 10**9 + 7  """It's possible if there are no dots between hashes The min number = the min number of connected components DSU the points for i in range(1,N+1), for j in range(1,M+1)row i column j is cell i*M + j""" def solve():    def find(a):        if a != p[a]:            p[a] = find(p[a])        return p[a]            def union(a, b):        a, b = find(a), find(b)        if a == b: return        if size[a] > size[b]:            a, b = b, a        p[a] = b        size[b] += size[a]        return        N, M = getInts()    grid = ['.']*(M+2)    for _ in range(N): grid += ['.'] + listStr() + ['.']    grid += ['.']*(M+2)    N += 2    M += 2    num = N*M    bad_row = bad_col = 0        #Check whether it's possible: i.e. whether #.# exists in any row/col    for i in range(1,N-1):        seen_hash = False        seen_dot = False        for j in range(1,M-1):            if grid[i*M + j] == '#':                if seen_dot:                    return -1                seen_hash = True            else:                if seen_hash:                    seen_dot = True        if not seen_hash: bad_row = 1        for j in range(1,M-1):        seen_hash = False        seen_dot = False        for i in range(1,N-1):            if grid[i*M + j] == '#':                if seen_dot:                    return -1                seen_hash = True            else:                if seen_hash:                    seen_dot = True        if not seen_hash: bad_col = 1        if bad_row ^ bad_col: return -1        #If we've made it this far, it's possible and we just need to count connected components    p = [i for i in range(num)]    size = [1]*num    for i in range(num-M-1):        if grid[i] != '#':            p[i] = -i-1            continue        if grid[i+1] == '#':            union(i,i+1)        if grid[i+M] == '#':            union(i,i+M)    ans = set()    for i in range(num-M-1):        if p[i] < 0: continue        f = find(i)        if f != -1: ans.add(f)        return len(ans) #for _ in range(getInt()):print(solve())#solve() #print(time.time()-start_time)
