#Code by Sounak, IIESTS#------------------------------warmup---------------------------- import osimport sysimport mathfrom io import BytesIO, IOBasefrom fractions import Fractionimport collectionsfrom itertools import permutationsfrom collections import defaultdict  BUFSIZE = 8192  class FastIO(IOBase):    newlines = 0        def __init__(self, file):        self._fd = file.fileno()        self.buffer = BytesIO()        self.writable = "x" in file.mode or "r" not in file.mode        self.write = self.buffer.write if self.writable else None         def read(self):        while True:            b = os.read(self._fd, max(os.fstat(self._fd).st_size, BUFSIZE))            if not b:                break            ptr = self.buffer.tell()            self.buffer.seek(0, 2), self.buffer.write(b), self.buffer.seek(ptr)        self.newlines = 0        return self.buffer.read()     def readline(self):        while self.newlines == 0:            b = os.read(self._fd, max(os.fstat(self._fd).st_size, BUFSIZE))            self.newlines = b.count(b"\n") + (not b)            ptr = self.buffer.tell()            self.buffer.seek(0, 2), self.buffer.write(b), self.buffer.seek(ptr)        self.newlines -= 1        return self.buffer.readline()     def flush(self):        if self.writable:            os.write(self._fd, self.buffer.getvalue())            self.buffer.truncate(0), self.buffer.seek(0)  class IOWrapper(IOBase):    def __init__(self, file):        self.buffer = FastIO(file)        self.flush = self.buffer.flush        self.writable = self.buffer.writable        self.write = lambda s: self.buffer.write(s.encode("ascii"))        self.read = lambda: self.buffer.read().decode("ascii")        self.readline = lambda: self.buffer.readline().decode("ascii")  sys.stdin, sys.stdout = IOWrapper(sys.stdin), IOWrapper(sys.stdout)input = lambda: sys.stdin.readline().rstrip("\r\n") #-------------------game starts now-----------------------------------------------------n=int(input())a=list(map(int,input().split()))d=dict()st=set(a)t=set()for i in a:    if i in d:        d[i]+=1    else:        d[i]=1two=0more=0for i in d:    if d[i]==2:        two+=1        t.add(i)    elif d[i]>2:        more+=1a.sort()if two>1 or more>0 or sum(a)==0 or a.count(0)>1:    print("cslnb")else:    c=0    for i in range (n):        m=max(0,a[i]-i)        c+=m    #print(c)    for i in t:        if i-1 in st:            c=0    if c%2==0:        print("cslnb")    else:        print("sjfnb")