#Code by Sounak, IIESTS#------------------------------warmup---------------------------- import osimport sysimport mathfrom io import BytesIO, IOBasefrom fractions import Fractionfrom collections import defaultdictfrom itertools import permutations  BUFSIZE = 8192  class FastIO(IOBase):    newlines = 0        def __init__(self, file):        self._fd = file.fileno()        self.buffer = BytesIO()        self.writable = "x" in file.mode or "r" not in file.mode        self.write = self.buffer.write if self.writable else None         def read(self):        while True:            b = os.read(self._fd, max(os.fstat(self._fd).st_size, BUFSIZE))            if not b:                break            ptr = self.buffer.tell()            self.buffer.seek(0, 2), self.buffer.write(b), self.buffer.seek(ptr)        self.newlines = 0        return self.buffer.read()     def readline(self):        while self.newlines == 0:            b = os.read(self._fd, max(os.fstat(self._fd).st_size, BUFSIZE))            self.newlines = b.count(b"\n") + (not b)            ptr = self.buffer.tell()            self.buffer.seek(0, 2), self.buffer.write(b), self.buffer.seek(ptr)        self.newlines -= 1        return self.buffer.readline()     def flush(self):        if self.writable:            os.write(self._fd, self.buffer.getvalue())            self.buffer.truncate(0), self.buffer.seek(0)  class IOWrapper(IOBase):    def __init__(self, file):        self.buffer = FastIO(file)        self.flush = self.buffer.flush        self.writable = self.buffer.writable        self.write = lambda s: self.buffer.write(s.encode("ascii"))        self.read = lambda: self.buffer.read().decode("ascii")        self.readline = lambda: self.buffer.readline().decode("ascii")  sys.stdin, sys.stdout = IOWrapper(sys.stdin), IOWrapper(sys.stdout)input = lambda: sys.stdin.readline().rstrip("\r\n") #-------------------game starts now-----------------------------------------------------f, s, fs, sf = map(int, input().split(' ')) if sf - fs == 1 and f - sf + 1 > 0 and s - sf + 1 > 0: # 7444...444474747474...7777...7774    r = ['7', '4'] * sf    r[1] = '4' * (f - sf + 1)    r[-2] = '7' * (s - sf + 1)    print(''.join(r))elif sf == fs and f - sf > 0 and s - sf + 1 > 0: # 444...44474747474777...7774    r = ['4', '7'] * sf + ['4']    r[0] = '4' * (f - (sf + 1) + 1)    r[-2] = '7' * (s - sf + 1)    print(''.join(r))elif fs - sf == 1 and f - fs + 1 > 0 and s - fs + 1 > 0: # 444...444747474777...777    r = ['4', '7'] * fs    r[0] = '4' * (f - fs + 1)    r[-1] = '7' * (s - fs + 1)    print(''.join(r))elif f == fs == sf and s - f > 0: # 747474777...777    print('74' * f + '7' * (s - f))else:    print(-1)
