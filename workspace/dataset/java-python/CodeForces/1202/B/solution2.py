# ------------------- fast io --------------------import osimport sysfrom io import BytesIO, IOBase BUFSIZE = 8192 class FastIO(IOBase):    newlines = 0    def __init__(self, file):        self._fd = file.fileno()        self.buffer = BytesIO()        self.writable = "x" in file.mode or "r" not in file.mode        self.write = self.buffer.write if self.writable else None     def read(self):        while True:            b = os.read(self._fd, max(os.fstat(self._fd).st_size, BUFSIZE))            if not b:                break            ptr = self.buffer.tell()            self.buffer.seek(0, 2), self.buffer.write(b), self.buffer.seek(ptr)        self.newlines = 0        return self.buffer.read()     def readline(self):        while self.newlines == 0:            b = os.read(self._fd, max(os.fstat(self._fd).st_size, BUFSIZE))            self.newlines = b.count(b"\n") + (not b)            ptr = self.buffer.tell()            self.buffer.seek(0, 2), self.buffer.write(b), self.buffer.seek(ptr)        self.newlines -= 1        return self.buffer.readline()     def flush(self):        if self.writable:            os.write(self._fd, self.buffer.getvalue())            self.buffer.truncate(0), self.buffer.seek(0)  class IOWrapper(IOBase):    def __init__(self, file):        self.buffer = FastIO(file)        self.flush = self.buffer.flush        self.writable = self.buffer.writable        self.write = lambda s: self.buffer.write(s.encode("ascii"))        self.read = lambda: self.buffer.read().decode("ascii")        self.readline = lambda: self.buffer.readline().decode("ascii")  sys.stdin, sys.stdout = IOWrapper(sys.stdin), IOWrapper(sys.stdout)input = lambda: sys.stdin.readline().rstrip("\r\n")# ------------------- fast io --------------------def main():    vals=[int(k) for k in input()];n=len(vals)    store=[[[[-1 for s in range(10)] for i in range(10)] for j in range(10)] for k in range(10)]    #[p1][p2][num1][num2]    for p1 in range(10):        for p2 in range(10):            for num1 in range(10):                for num2 in range(num1,10):                    minans=99999                    for coef1 in range(11):                        for coef2 in range(11):                            if (p1+coef1*num1+coef2*num2)%10==p2 and (coef1>0 or coef2>0):                                minans=min(minans,max(coef1+coef2-1,0))                    if minans!=99999:                        store[p1][p2][num1][num2]=minans                        store[p1][p2][num2][num1]=minans    setty={}    for s in range(n-1):        pair=(vals[s],vals[s+1])        if not(pair in setty):            setty[pair]=1        else:            setty[pair]+=1    ans=[[-1 for s in range(10)] for j in range(10)]    for num1 in range(10):        for num2 in range(num1,10):            count=0;broke=False            for pair in setty:                p1=pair[0];p2=pair[1]                if store[p1][p2][num1][num2]!=-1:                    count+=store[p1][p2][num1][num2]*setty[pair]                else:                    broke=True                    break            if broke==False:                ans[num1][num2]=count                ans[num2][num1]=count    for i in range(10):        print(*ans[i])main()