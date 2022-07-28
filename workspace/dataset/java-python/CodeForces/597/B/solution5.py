# SHRi GANESHA    author: Kunal Verma # import os,sysfrom collections import defaultdict, Counter, dequefrom io import BytesIO, IOBasefrom math import gcd, ceil  def lcm(a,b):    return (a*b)//gcd(a,b)'''mod = 10 ** 9 + 7fac = [1]for i in range(1, 2 * 10 ** 5 + 1):    fac.append((fac[-1] * i) % mod)fac_in = [pow(fac[-1], mod - 2, mod)]for i in range(2 * 10 ** 5, 0, -1):    fac_in.append((fac_in[-1] * i) % mod)fac_in.reverse() def comb(a, b):    if a < b:        return 0    return (fac[a] * fac_in[b] * fac_in[a - b]) % mod'''MAXN = 100001spf = [0 for i in range(MAXN)]  def getFactorization(x):    ret = list()    while (x != 1):        ret.append(spf[x])        x = x // spf[x]    return retdef main():    n = int(input())    x = []    z = defaultdict(list)    m = 0    for j in range(n):        a, b = map(int, input().split())        x.append([a, b])     x.sort(key=lambda xx: xx[1])    p = 0    an = 0    for i in range(n):         if x[i][0] > p:            an += 1            p = x[i][1]     print(an)  #Fast IO RegionBUFSIZE = 8192class FastIO(IOBase):    newlines = 0    def __init__(self, file):        self._fd = file.fileno()        self.buffer = BytesIO()        self.writable = "x" in file.mode or "r" not in file.mode        self.write = self.buffer.write if self.writable else None    def read(self):        while True:            b = os.read(self._fd, max(os.fstat(self._fd).st_size, BUFSIZE))            if not b:                break            ptr = self.buffer.tell()            self.buffer.seek(0, 2), self.buffer.write(b), self.buffer.seek(ptr)        self.newlines = 0        return self.buffer.read()    def readline(self):        while self.newlines == 0:            b = os.read(self._fd, max(os.fstat(self._fd).st_size, BUFSIZE))            self.newlines = b.count(b"\n") + (not b)            ptr = self.buffer.tell()            self.buffer.seek(0, 2), self.buffer.write(b), self.buffer.seek(ptr)        self.newlines -= 1        return self.buffer.readline()    def flush(self):        if self.writable:            os.write(self._fd, self.buffer.getvalue())            self.buffer.truncate(0), self.buffer.seek(0)class IOWrapper(IOBase):    def __init__(self, file):        self.buffer = FastIO(file)        self.flush = self.buffer.flush        self.writable = self.buffer.writable        self.write = lambda s: self.buffer.write(s.encode("ascii"))        self.read = lambda: self.buffer.read().decode("ascii")        self.readline = lambda: self.buffer.readline().decode("ascii")sys.stdin, sys.stdout = IOWrapper(sys.stdin), IOWrapper(sys.stdout)input = lambda: sys.stdin.readline().rstrip("\r\n") if __name__ == '__main__':    main()
