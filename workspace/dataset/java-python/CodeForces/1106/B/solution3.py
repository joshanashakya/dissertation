import osimport sysfrom io import BytesIO, IOBasefrom collections import defaultdict, deque, Counter, OrderedDictimport threadingfrom heapq import * def main():    n,m=map(int,input().split())    a = [*map(int,input().split())]    c = [*map(int,input().split())]    D = []    for i in range(n):        D.append([c[i],i])    D.sort(key = lambda z: z[0])    q = deque(D)    for i in range(m):        ans = 0        t, d = map(int,input().split()); t-=1        if a[t] > d:            ans = d * c[t]            a[t] -= d            d = 0        else:            ans = a[t] * c[t]            d -= a[t]            a[t] = 0            while q:                if a[q[0][1]] >= d:                    ans += c[q[0][1]] * d                    a[q[0][1]]-=d                    d = 0                    if a[q[0][1]] == 0: q.popleft()                    break                else:                    ans += c[q[0][1]] * a[q[0][1]]                    d -= a[q[0][1]]                    a[q[0][1]] = 0                    q.popleft()        if d > 0: print(0)        else:print(ans)   BUFSIZE = 8192  class FastIO(IOBase):    newlines = 0     def __init__(self, file):        self._fd = file.fileno()        self.buffer = BytesIO()        self.writable = "x" in file.mode or "r" not in file.mode        self.write = self.buffer.write if self.writable else None     def read(self):        while True:            b = os.read(self._fd, max(os.fstat(self._fd).st_size, BUFSIZE))            if not b:                break            ptr = self.buffer.tell()            self.buffer.seek(0, 2), self.buffer.write(b), self.buffer.seek(ptr)        self.newlines = 0        return self.buffer.read()     def readline(self):        while self.newlines == 0:            b = os.read(self._fd, max(os.fstat(self._fd).st_size, BUFSIZE))            self.newlines = b.count(b"\n") + (not b)            ptr = self.buffer.tell()            self.buffer.seek(0, 2), self.buffer.write(b), self.buffer.seek(ptr)        self.newlines -= 1        return self.buffer.readline()     def flush(self):        if self.writable:            os.write(self._fd, self.buffer.getvalue())            self.buffer.truncate(0), self.buffer.seek(0)  class IOWrapper(IOBase):    def __init__(self, file):        self.buffer = FastIO(file)        self.flush = self.buffer.flush        self.writable = self.buffer.writable        self.write = lambda s: self.buffer.write(s.encode("ascii"))        self.read = lambda: self.buffer.read().decode("ascii")        self.readline = lambda: self.buffer.readline().decode("ascii")  sys.stdin, sys.stdout = IOWrapper(sys.stdin), IOWrapper(sys.stdout)input = lambda: sys.stdin.readline().rstrip("\r\n") # endregion if __name__ == "__main__":    """sys.setrecursionlimit(400000)    threading.stack_size(40960000)    thread = threading.Thread(target=main)    thread.start()"""    main()
