# Legends Always Come Up with Solution# Author: Manvir Singh import osimport sysfrom io import BytesIO, IOBasefrom collections import deque def main():    n=int(input())    tree=[[] for _ in range(n+1)]    for i in range(n-1):        x,y=map(int,input().split())        tree[x].append(y)        tree[y].append(x)    h,v,l,c,q=[0]*(n+1),[0]*(n+1),[],0,deque()    for i in range(1,n+1):        if len(tree[i])>1:            q.append(i)            v[i]=1            break    while q:        z,f=q.popleft(),0        for i in tree[z]:            if not v[i]:                h[i],v[i]=h[z]+1,1                q.append(i)                if len(tree[i])==1:                    l.append(i)                    f=1        if f:            c+=1    for i in range(len(l)-1):        if h[l[i]]%2!=h[l[i+1]]%2:            print(3,n-1-len(l)+c)            return     print(1,n-1-len(l)+c)    # region fastioBUFSIZE = 8192class FastIO(IOBase):    newlines = 0     def __init__(self, file):        self._fd = file.fileno()        self.buffer = BytesIO()        self.writable = "x" in file.mode or "r" not in file.mode        self.write = self.buffer.write if self.writable else None     def read(self):        while True:            b = os.read(self._fd, max(os.fstat(self._fd).st_size, BUFSIZE))            if not b:                break            ptr = self.buffer.tell()            self.buffer.seek(0, 2), self.buffer.write(b), self.buffer.seek(ptr)        self.newlines = 0        return self.buffer.read()     def readline(self):        while self.newlines == 0:            b = os.read(self._fd, max(os.fstat(self._fd).st_size, BUFSIZE))            self.newlines = b.count(b"\n") + (not b)            ptr = self.buffer.tell()            self.buffer.seek(0, 2), self.buffer.write(b), self.buffer.seek(ptr)        self.newlines -= 1        return self.buffer.readline()     def flush(self):        if self.writable:            os.write(self._fd, self.buffer.getvalue())            self.buffer.truncate(0), self.buffer.seek(0)  class IOWrapper(IOBase):    def __init__(self, file):        self.buffer = FastIO(file)        self.flush = self.buffer.flush        self.writable = self.buffer.writable        self.write = lambda s: self.buffer.write(s.encode("ascii"))        self.read = lambda: self.buffer.read().decode("ascii")        self.readline = lambda: self.buffer.readline().decode("ascii")  sys.stdin, sys.stdout = IOWrapper(sys.stdin), IOWrapper(sys.stdout)input = lambda: sys.stdin.readline().rstrip("\r\n") if __name__ == "__main__":    main()