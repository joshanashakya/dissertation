#------------------------------warmup----------------------------import osimport sysimport mathfrom io import BytesIO, IOBase BUFSIZE = 8192  class FastIO(IOBase):    newlines = 0     def __init__(self, file):        self._fd = file.fileno()        self.buffer = BytesIO()        self.writable = "x" in file.mode or "r" not in file.mode        self.write = self.buffer.write if self.writable else None     def read(self):        while True:            b = os.read(self._fd, max(os.fstat(self._fd).st_size, BUFSIZE))            if not b:                break            ptr = self.buffer.tell()            self.buffer.seek(0, 2), self.buffer.write(b), self.buffer.seek(ptr)        self.newlines = 0        return self.buffer.read()     def readline(self):        while self.newlines == 0:            b = os.read(self._fd, max(os.fstat(self._fd).st_size, BUFSIZE))            self.newlines = b.count(b"\n") + (not b)            ptr = self.buffer.tell()            self.buffer.seek(0, 2), self.buffer.write(b), self.buffer.seek(ptr)        self.newlines -= 1        return self.buffer.readline()     def flush(self):        if self.writable:            os.write(self._fd, self.buffer.getvalue())            self.buffer.truncate(0), self.buffer.seek(0)  class IOWrapper(IOBase):    def __init__(self, file):        self.buffer = FastIO(file)        self.flush = self.buffer.flush        self.writable = self.buffer.writable        self.write = lambda s: self.buffer.write(s.encode("ascii"))        self.read = lambda: self.buffer.read().decode("ascii")        self.readline = lambda: self.buffer.readline().decode("ascii")  sys.stdin, sys.stdout = IOWrapper(sys.stdin), IOWrapper(sys.stdout)input = lambda: sys.stdin.readline().rstrip("\r\n") #-------------------game starts now----------------------------------------------------a, b = input().split(':')a = list(a)b = list(b)c = 10for i in 'ABCDEFGHIJKLMNOPQRSTUVWXYZ':    for j in range(len(a)):        if a[j] == i:            a[j] = c    for j in range(len(b)):        if b[j] == i:            b[j] = c    c += 1a = list(map(int, a))b = list(map(int, b))ans = []for c in range(2, 200):    x1 = 0    x2 = 0    for p in range(len(a)):        x1 += a[p] * c ** (len(a) - p - 1)    for p in range(len(b)):        x2 += b[p] * c ** (len(b) - p - 1)    if 0 <= x1 <= 23 and 0 <= x2 <= 59 and max(a) < c and max(b) < c:        ans.append(c)if len(ans) > 100:    print(-1)elif ans:    print(*ans)else:    print(0)