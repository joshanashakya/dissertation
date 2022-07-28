import osimport sysfrom io import BytesIO, IOBase BUFSIZE = 8192  class FastIO(IOBase):    newlines = 0     def __init__(self, file):        self._fd = file.fileno()        self.buffer = BytesIO()        self.writable = "x" in file.mode or "r" not in file.mode        self.write = self.buffer.write if self.writable else None     def read(self):        while True:            b = os.read(self._fd, max(os.fstat(self._fd).st_size, BUFSIZE))            if not b:                break            ptr = self.buffer.tell()            self.buffer.seek(0, 2), self.buffer.write(b), self.buffer.seek(ptr)        self.newlines = 0        return self.buffer.read()     def readline(self):        while self.newlines == 0:            b = os.read(self._fd, max(os.fstat(self._fd).st_size, BUFSIZE))            self.newlines = b.count(b"\n") + (not b)            ptr = self.buffer.tell()            self.buffer.seek(0, 2), self.buffer.write(b), self.buffer.seek(ptr)        self.newlines -= 1        return self.buffer.readline()     def flush(self):        if self.writable:            os.write(self._fd, self.buffer.getvalue())            self.buffer.truncate(0), self.buffer.seek(0)  class IOWrapper(IOBase):    def __init__(self, file):        self.buffer = FastIO(file)        self.flush = self.buffer.flush        self.writable = self.buffer.writable        self.write = lambda s: self.buffer.write(s.encode("ascii"))        self.read = lambda: self.buffer.read().decode("ascii")        self.readline = lambda: self.buffer.readline().decode("ascii")  sys.stdin, sys.stdout = IOWrapper(sys.stdin), IOWrapper(sys.stdout)input = lambda: sys.stdin.readline().rstrip("\r\n")#######################################import sys,threadingsys.setrecursionlimit(400000)threading.stack_size(10**8)def dfs(x,y):  global v,c,adj  v[x]=1  c+=1  for i in adj[x]:    if not v[i] and i!=y:      dfs(i,y)def  main():  global v,c,adj  for _ in  range(int(input())):    n,m,a,b=map(int,input().split())    v=[0]*(n+1)    adj=[[] for  i in range(n+1)]    for i in range(m):      x,y=map(int,input().split())      adj[x].append(y)      adj[y].append(x)    c=0    dfs(a,b)    ans1=n-c-1    v=[0]*(n+1)    c=0    dfs(b,a)    ans2=n-c-1    print(ans1*ans2)t=threading.Thread(target=main)t.start()t.join()
