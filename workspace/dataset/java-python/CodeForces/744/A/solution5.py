import osimport sysfrom io import BytesIO, IOBaseBUFSIZE = 8192class FastIO(IOBase):    newlines = 0    def __init__(self, file):        self._fd = file.fileno()        self.buffer = BytesIO()        self.writable = "x" in file.mode or "r" not in file.mode        self.write = self.buffer.write if self.writable else None    def read(self):        while True:            b = os.read(self._fd, max(os.fstat(self._fd).st_size, BUFSIZE))            if not b:                break            ptr = self.buffer.tell()            self.buffer.seek(0, 2), self.buffer.write(b), self.buffer.seek(ptr)        self.newlines = 0        return self.buffer.read()    def readline(self):        while self.newlines == 0:            b = os.read(self._fd, max(os.fstat(self._fd).st_size, BUFSIZE))            self.newlines = b.count(b"\n") + (not b)            ptr = self.buffer.tell()            self.buffer.seek(0, 2), self.buffer.write(b), self.buffer.seek(ptr)        self.newlines -= 1        return self.buffer.readline()    def flush(self):        if self.writable:            os.write(self._fd, self.buffer.getvalue())            self.buffer.truncate(0), self.buffer.seek(0)class IOWrapper(IOBase):    def __init__(self, file):        self.buffer = FastIO(file)        self.flush = self.buffer.flush        self.writable = self.buffer.writable        self.write = lambda s: self.buffer.write(s.encode("ascii"))        self.read = lambda: self.buffer.read().decode("ascii")        self.readline = lambda: self.buffer.readline().decode("ascii")  sys.stdin, sys.stdout = IOWrapper(sys.stdin), IOWrapper(sys.stdout)input = lambda: sys.stdin.readline().rstrip("\r\n")##########################################################def prime_factors(x):    s=set()    n=x    i=2    while i*i<=n:        if n%i==0:            while n%i==0:                n//=i            s.add(i)        i+=1    if n>1:        s.add(n)    return sfrom collections import Counter# c=sorted((i,int(val))for i,val in enumerate(input().split()))import heapq# c=sorted((i,int(val))for i,val in enumerate(input().split()))# n = int(input())# ls = list(map(int, input().split()))# n, k = map(int, input().split())# n =int(input())#arr=[(i,x) for i,x in enum]#arr.sort(key=lambda x:x[0])#print(arr)#import math# e=list(map(int, input().split()))from collections import Counter#print("\n".join(ls))#print(os.path.commonprefix(ls[0:2]))#n=int(input())from bisect import  bisect_right#d=sorted(d,key=lambda x:(len(d[x]),-x))  d=dictionary     d={x:set() for x in arr}#n=int(input())#n,m,k= map(int, input().split())import heapq#for _ in range(int(input())):#n,k=map(int, input().split())#input=sys.stdin.buffer.readline#for _ in range(int(input())):#arr = list(map(int, input().split()))import bisectdef par(x):    if root[x]!=x:        return par(root[x])    else:        return x def max_edge(n):    return n*(n-1)//2 def union(u,v):    x=par(u)    y=par(v)    if x!=y:        if rank[x]>=rank[y]:            root[y]=root[x]            rank[x]+=rank[y]        elif rank[y]>rank[x]:            root[x]=root[y]            rank[y]+=rank[x] n,m,k= map(int, input().split())root=[i for i in range(n+1)]rank=[1]*(n+1)#g=[[] for i in range(n+1)]special = list(map(int, input().split())) for i in range(m):    u,v=map(int, input().split())    union(u,v) ma=0rest_var=nans=0 for i in special:    t=rank[par(i)]    ma=max(ma,t)    rest_var-=t    ans+=max_edge(t)ans-=max_edge(ma)ans+=max_edge(ma+rest_var)ans-=m#print(rank)#print(root)print(ans)#arr = list(map(int, input().split()))
