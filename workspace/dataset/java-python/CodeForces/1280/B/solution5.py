# ------------------- fast io --------------------import osimport sysfrom io import BytesIO, IOBase BUFSIZE = 8192 class FastIO(IOBase):    newlines = 0    def __init__(self, file):        self._fd = file.fileno()        self.buffer = BytesIO()        self.writable = "x" in file.mode or "r" not in file.mode        self.write = self.buffer.write if self.writable else None     def read(self):        while True:            b = os.read(self._fd, max(os.fstat(self._fd).st_size, BUFSIZE))            if not b:                break            ptr = self.buffer.tell()            self.buffer.seek(0, 2), self.buffer.write(b), self.buffer.seek(ptr)        self.newlines = 0        return self.buffer.read()     def readline(self):        while self.newlines == 0:            b = os.read(self._fd, max(os.fstat(self._fd).st_size, BUFSIZE))            self.newlines = b.count(b"\n") + (not b)            ptr = self.buffer.tell()            self.buffer.seek(0, 2), self.buffer.write(b), self.buffer.seek(ptr)        self.newlines -= 1        return self.buffer.readline()     def flush(self):        if self.writable:            os.write(self._fd, self.buffer.getvalue())            self.buffer.truncate(0), self.buffer.seek(0)  class IOWrapper(IOBase):    def __init__(self, file):        self.buffer = FastIO(file)        self.flush = self.buffer.flush        self.writable = self.buffer.writable        self.write = lambda s: self.buffer.write(s.encode("ascii"))        self.read = lambda: self.buffer.read().decode("ascii")        self.readline = lambda: self.buffer.readline().decode("ascii")  sys.stdin, sys.stdout = IOWrapper(sys.stdin), IOWrapper(sys.stdout)input = lambda: sys.stdin.readline().rstrip("\r\n")# ------------------- fast io --------------------t=int(input())for j in range(t):    r,c=map(int,input().split());grid=[]    for s in range(r):        vals=[k for k in input()]        grid.append(vals)    ans=[0 for s in range(5)]    A=0;P=0    for s in range(r):        row=0        for i in range(c):            if grid[s][i]=="A":                A+=1;row+=1                if (s==0 or s==r-1) and (i==0 or i==c-1):                    ans[2]+=1                elif s==0 or s==r-1 or i==0 or i==c-1:                    ans[3]+=1                else:                    ans[4]+=1            else:                P+=1        if row==c:            if s==0 or s==r-1:                ans[1]+=1            else:                ans[2]+=1    if A==0:        print("MORTAL")    elif P==0:        print(0)    else:        for i in range(c):            col=0            for s in range(r):                if grid[s][i]=="A":                    col+=1            if col==r:                if i==0 or i==c-1:                    ans[1]+=1                else:                    ans[2]+=1        for s in range(len(ans)):            if ans[s]>0:                print(s);break