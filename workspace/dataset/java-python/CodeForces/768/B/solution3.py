import sys,math # FASTEST IO from io import BytesIO, IOBasefrom types import GeneratorType BUFSIZE = 8192class FastIO(IOBase):    newlines = 0     def __init__(self, file):        import os        self.os = os        self._fd = file.fileno()        self.buffer = BytesIO()        self.writable = "x" in file.mode or "r" not in file.mode        self.write = self.buffer.write if self.writable else None     def read(self):        while True:            b = self.os.read(self._fd, max(self.os.fstat(self._fd).st_size, BUFSIZE))            if not b:                break            ptr = self.buffer.tell()            self.buffer.seek(0, 2), self.buffer.write(b), self.buffer.seek(ptr)        self.newlines = 0        return self.buffer.read()     def readline(self):        while self.newlines == 0:            b = self.os.read(self._fd, max(self.os.fstat(self._fd).st_size, BUFSIZE))            self.newlines = b.count(b"\n") + (not b)            ptr = self.buffer.tell()            self.buffer.seek(0, 2), self.buffer.write(b), self.buffer.seek(ptr)        self.newlines -= 1        return self.buffer.readline()     def flush(self):        if self.writable:            self.os.write(self._fd, self.buffer.getvalue())            self.buffer.truncate(0), self.buffer.seek(0)  class IOWrapper(IOBase):    def __init__(self, file):        self.buffer = FastIO(file)        self.flush = self.buffer.flush        self.writable = self.buffer.writable        self.write = lambda s: self.buffer.write(s.encode("ascii"))        self.read = lambda: self.buffer.read().decode("ascii")        self.readline = lambda: self.buffer.readline().decode("ascii")  sys.stdin, sys.stdout = IOWrapper(sys.stdin), IOWrapper(sys.stdout) # End of FASTEST IO def func(n,m,q):    if m==1:        return 1    x=m//2    if x+1==q:        return n%2    else:        if q>x+1:            q-=(x+1)        return func(n//2,m//2,q)  def main():     n,l,r=map(int,sys.stdin.readline().strip().split())     count=0     if n>=1:        m=2**(int(math.log(n,2))+1)-1        for i in range(l,r+1):            if func(n,m,i)==1:                count+=1     sys.stdout.write(str(count)+'\n')  main()