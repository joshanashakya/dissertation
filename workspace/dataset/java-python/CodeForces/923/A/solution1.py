import os, sysfrom io import BytesIO, IOBasefrom math import sqrt,ceil,gcd,log2 BUFSIZE = 8192  class FastIO(IOBase):    newlines = 0     def __init__(self, file):        self._fd = file.fileno()        self.buffer = BytesIO()        self.writable = "x" in file.mode or "r" not in file.mode        self.write = self.buffer.write if self.writable else None     def read(self):        while True:            b = os.read(self._fd, max(os.fstat(self._fd).st_size, BUFSIZE))            if not b:                break            ptr = self.buffer.tell()            self.buffer.seek(0, 2), self.buffer.write(b), self.buffer.seek(ptr)        self.newlines = 0        return self.buffer.read()     def readline(self):        while self.newlines == 0:            b = os.read(self._fd, max(os.fstat(self._fd).st_size, BUFSIZE))            self.newlines = b.count(b"\n") + (not b)            ptr = self.buffer.tell()            self.buffer.seek(0, 2), self.buffer.write(b), self.buffer.seek(ptr)        self.newlines -= 1        return self.buffer.readline()     def flush(self):        if self.writable:            os.write(self._fd, self.buffer.getvalue())            self.buffer.truncate(0), self.buffer.seek(0)  class IOWrapper(IOBase):    def __init__(self, file):        self.buffer = FastIO(file)        self.flush = self.buffer.flush        self.writable = self.buffer.writable        self.write = lambda s: self.buffer.write(s.encode("ascii"))        self.read = lambda: self.buffer.read().decode("ascii")        self.readline = lambda: self.buffer.readline().decode("ascii") def dtb(n):    return bin(n).replace("0b", "")sys.stdin, sys.stdout = IOWrapper(sys.stdin), IOWrapper(sys.stdout)input = lambda: sys.stdin.readline().rstrip("\r\n") def lcm(a,b):    return a*b//gcd(a,b)ar = [i for i in range( 1000001)]for i in range(2, 1000001):    if ar[i] == i:        for j in range(i+i, 1000001, i):            ar[j] = i#print(ar[-30:])n=int(input())z=nck=ar[n]#print(ck)if ck==n:    print(n)else:    ans = n    for j in range((n//ck -1)*ck+ 1,n):        ck=ar[j]        t=(j//ck -1)        if not t:            t=ck        else:            t=t*ck +1        ans=min(ans,t)       # print(j,ck,ans)    print(ans)   