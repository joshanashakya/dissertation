#------------------------template--------------------------#import osimport sysfrom math import *from collections import *# from fractions import *# from heapq import*from bisect import *from io import BytesIO, IOBasedef vsInput():    sys.stdin = open('input.txt', 'r')    sys.stdout = open('output.txt', 'w')BUFSIZE = 8192class FastIO(IOBase):    newlines = 0    def __init__(self, file):        self._fd = file.fileno()        self.buffer = BytesIO()        self.writable = "x" in file.mode or "r" not in file.mode        self.write = self.buffer.write if self.writable else None    def read(self):        while True:            b = os.read(self._fd, max(os.fstat(self._fd).st_size, BUFSIZE))            if not b:                break            ptr = self.buffer.tell()            self.buffer.seek(0, 2), self.buffer.write(b), self.buffer.seek(ptr)        self.newlines = 0        return self.buffer.read()    def readline(self):        while self.newlines == 0:            b = os.read(self._fd, max(os.fstat(self._fd).st_size, BUFSIZE))            self.newlines = b.count(b"\n") + (not b)            ptr = self.buffer.tell()            self.buffer.seek(0, 2), self.buffer.write(b), self.buffer.seek(ptr)        self.newlines -= 1        return self.buffer.readline()    def flush(self):        if self.writable:            os.write(self._fd, self.buffer.getvalue())            self.buffer.truncate(0), self.buffer.seek(0)class IOWrapper(IOBase):    def __init__(self, file):        self.buffer = FastIO(file)        self.flush = self.buffer.flush        self.writable = self.buffer.writable        self.write = lambda s: self.buffer.write(s.encode("ascii"))        self.read = lambda: self.buffer.read().decode("ascii")        self.readline = lambda: self.buffer.readline().decode("ascii")sys.stdin, sys.stdout = IOWrapper(sys.stdin), IOWrapper(sys.stdout)input = lambda: sys.stdin.readline().rstrip("\r\n")ALPHA='abcdefghijklmnopqrstuvwxyz'M=998244353EPS=1e-6def Ceil(a,b): return a//b+int(a%b>0)def value():return tuple(map(int,input().split()))def array():return [int(i) for i in input().split()]def Int():return int(input())def Str():return input()def arrayS():return [i for i in input().split()]  #-------------------------code---------------------------## vsInput()  def Get(x):    ans = 0    for i in a:        if(i%3 == x): ans += 1    return ans def Remove(x,a):     i = len(a) - 1    while(i >= 0):        if(a[i]%3 == x): break        i -= 1    return a[:i] + a[i+1:]    n = Int()a = array()a.sort(reverse = True) if(a[-1]): print(-1)else:    c2 = Get(2)    c1 = Get(1)    mod = sum(a)%3     if(mod == 1 and c1): a = Remove(1,a)    elif(mod == 2 and c2): a = Remove(2,a)    else:         if(mod == 1):            a = Remove(2,a)            a = Remove(2,a)        elif(mod == 2):            a = Remove(1,a)            a = Remove(1,a)     if(len(set(a)) == 1): a = [0]    print(*a,sep="")               
