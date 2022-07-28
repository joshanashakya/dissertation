import osimport sysfrom io import BytesIO, IOBase BUFSIZE = 8192  class FastIO(IOBase):    newlines = 0     def __init__(self, file):        self._fd = file.fileno()        self.buffer = BytesIO()        self.writable = "x" in file.mode or "r" not in file.mode        self.write = self.buffer.write if self.writable else None     def read(self):        while True:            b = os.read(self._fd, max(os.fstat(self._fd).st_size, BUFSIZE))            if not b:                break            ptr = self.buffer.tell()            self.buffer.seek(0, 2), self.buffer.write(b), self.buffer.seek(ptr)        self.newlines = 0        return self.buffer.read()     def readline(self):        while self.newlines == 0:            b = os.read(self._fd, max(os.fstat(self._fd).st_size, BUFSIZE))            self.newlines = b.count(b"\n") + (not b)            ptr = self.buffer.tell()            self.buffer.seek(0, 2), self.buffer.write(b), self.buffer.seek(ptr)        self.newlines -= 1        return self.buffer.readline()     def flush(self):        if self.writable:            os.write(self._fd, self.buffer.getvalue())            self.buffer.truncate(0), self.buffer.seek(0)  class IOWrapper(IOBase):    def __init__(self, file):        self.buffer = FastIO(file)        self.flush = self.buffer.flush        self.writable = self.buffer.writable        self.write = lambda s: self.buffer.write(s.encode("ascii"))        self.read = lambda: self.buffer.read().decode("ascii")        self.readline = lambda: self.buffer.readline().decode("ascii")  sys.stdin, sys.stdout = IOWrapper(sys.stdin), IOWrapper(sys.stdout)input = lambda: sys.stdin.readline().rstrip("\r\n")MAX = 1000001bitscount = 30 prefix_count = [[0]*(10**5+1) for i in range(30)]  def findPrefixCount(arr, n):    for i in range(0, bitscount):         prefix_count[i][0] = ((arr[0] >> i) & 1)         for j in range(1, n):            prefix_count[i][j] = ((arr[j] >> i) & 1)            prefix_count[i][j] += prefix_count[i][j - 1]    def rangeOr(l, r):    ans = 0    for i in range(bitscount):         x = 0         if (l == 0):            x = prefix_count[i][r]        else:            x = prefix_count[i][r] - prefix_count[i][l - 1]             # Condition for ith bit        # of answer to be set        if (x == r - l + 1):            ans = (ans | (1 << i))     return ans          n, m = map(int, input().split())a = [[0] * n for i in range(30)]query = []for i in range(m):    l, r, q = map(int, input().split())    query.append([l-1, r-1, q])    c = bin(q)[2:][::-1]    b = []    for j in c:        b.append(int(j))    j = 0    while (j < len(b)):        if b[j] == 1:            a[j][l - 1] += 1            if r != n:                a[j][r] -= 1        j += 1for i in range(30):    j = 1    while (j < n):        a[i][j] += a[i][j - 1]        j += 1    j = 0    while (j < n):        if a[i][j] > 0:            a[i][j] = 1        j += 1res=[]for i in range(n):    s = ""    j=29    while(j>=0):        s += str(a[j][i])        j+=-1    res.append(int(s,2))findPrefixCount(res, n)f=0for j in query:    if rangeOr(j[0],j[1])!=j[2]:        f=1        breakif f==1:    print("NO")else:    print("YES")    print(*res)          
