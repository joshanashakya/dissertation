import sys, os, iodef rs(): return sys.stdin.readline().rstrip()def ri(): return int(sys.stdin.readline())def ria(): return list(map(int, sys.stdin.readline().split()))def ws(s): sys.stdout.write(s + '\n')def wi(n): sys.stdout.write(str(n) + '\n')def wia(a): sys.stdout.write(' '.join([str(x) for x in a]) + '\n')import math,datetime,functools,itertools,operator,bisect,fractions,statisticsfrom collections import deque,defaultdict,OrderedDict,Counterfrom fractions import Fractionfrom decimal import Decimalfrom sys import stdoutfrom heapq import heappush, heappop, heapify ,_heapify_max,_heappop_max,nsmallest,nlargest def main():    # mod=1000000007    # InverseofNumber(mod)    # InverseofFactorial(mod)    # factorial(mod)    starttime=datetime.datetime.now()    if(os.path.exists('input.txt')):        sys.stdin = open("input.txt","r")        sys.stdout = open("output.txt","w")        tc=ri()    for _ in range(tc):        n,m,k=ria()        d=min(n,m)        bachein=max(n,m)-min(n,m)        c=0        if bachein%2==0:            d+=bachein        else:            d+=bachein-1            c=1        op=max(n,m)        if op>k:            wi(-1)        else:            abkitnabacha=k-op            if c:                abkitnabacha+=1                d+=abkitnabacha-1            else:                if abkitnabacha%2==1:                    abkitnabacha-=2                d+=abkitnabacha                        wi(d)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  #<--Solving Area Ends    endtime=datetime.datetime.now()    time=(endtime-starttime).total_seconds()*1000    if(os.path.exists('input.txt')):        print("Time:",time,"ms")                      class FastReader(io.IOBase):    newlines = 0     def __init__(self, fd, chunk_size=1024 * 8):        self._fd = fd        self._chunk_size = chunk_size        self.buffer = io.BytesIO()     def read(self):        while True:            b = os.read(self._fd, max(os.fstat(self._fd).st_size, self._chunk_size))            if not b:                break            ptr = self.buffer.tell()            self.buffer.seek(0, 2), self.buffer.write(b), self.buffer.seek(ptr)        self.newlines = 0        return self.buffer.read()     def readline(self, size=-1):        while self.newlines == 0:            b = os.read(self._fd, max(os.fstat(self._fd).st_size, self._chunk_size if size == -1 else size))            self.newlines = b.count(b"\n") + (not b)            ptr = self.buffer.tell()            self.buffer.seek(0, 2), self.buffer.write(b), self.buffer.seek(ptr)        self.newlines -= 1        return self.buffer.readline()  class FastWriter(io.IOBase):     def __init__(self, fd):        self._fd = fd        self.buffer = io.BytesIO()        self.write = self.buffer.write     def flush(self):        os.write(self._fd, self.buffer.getvalue())        self.buffer.truncate(0), self.buffer.seek(0)  class FastStdin(io.IOBase):    def __init__(self, fd=0):        self.buffer = FastReader(fd)        self.read = lambda: self.buffer.read().decode("ascii")        self.readline = lambda: self.buffer.readline().decode("ascii")  class FastStdout(io.IOBase):    def __init__(self, fd=1):        self.buffer = FastWriter(fd)        self.write = lambda s: self.buffer.write(s.encode("ascii"))        self.flush = self.buffer.flush  if __name__ == '__main__':    sys.stdin = FastStdin()    sys.stdout = FastStdout()    main()    
