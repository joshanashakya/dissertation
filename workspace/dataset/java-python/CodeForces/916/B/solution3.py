import osimport sysfrom io import BytesIO, IOBase# region fastio BUFSIZE = 8192 class FastIO(IOBase):    newlines = 0     def __init__(self, file):        self._fd = file.fileno()        self.buffer = BytesIO()        self.writable = "x" in file.mode or "r" not in file.mode        self.write = self.buffer.write if self.writable else None     def read(self):        while True:            b = os.read(self._fd, max(os.fstat(self._fd).st_size, BUFSIZE))            if not b:                break            ptr = self.buffer.tell()            self.buffer.seek(0, 2), self.buffer.write(b), self.buffer.seek(ptr)        self.newlines = 0        return self.buffer.read()     def readline(self):        while self.newlines == 0:            b = os.read(self._fd, max(os.fstat(self._fd).st_size, BUFSIZE))            self.newlines = b.count(b"\n") + (not b)            ptr = self.buffer.tell()            self.buffer.seek(0, 2), self.buffer.write(b), self.buffer.seek(ptr)        self.newlines -= 1        return self.buffer.readline()     def flush(self):        if self.writable:            os.write(self._fd, self.buffer.getvalue())            self.buffer.truncate(0), self.buffer.seek(0)  class IOWrapper(IOBase):    def __init__(self, file):        self.buffer = FastIO(file)        self.flush = self.buffer.flush        self.writable = self.buffer.writable        self.write = lambda s: self.buffer.write(s.encode("ascii"))        self.read = lambda: self.buffer.read().decode("ascii")        self.readline = lambda: self.buffer.readline().decode("ascii")  sys.stdin, sys.stdout = IOWrapper(sys.stdin), IOWrapper(sys.stdout)input = lambda: sys.stdin.readline().rstrip("\r\n") # ------------------------------ def RL(): return map(int, sys.stdin.readline().rstrip().split())def RLL(): return list(map(int, sys.stdin.readline().rstrip().split()))def N(): return int(input())def comb(n, m): return factorial(n) / (factorial(m) * factorial(n - m)) if n >= m else 0def perm(n, m): return factorial(n) // (factorial(n - m)) if n >= m else 0def mdis(x1, y1, x2, y2): return abs(x1 - x2) + abs(y1 - y2)mod = 998244353INF = float('inf')from math import factorialfrom collections import Counter, defaultdict, dequefrom heapq import heapify, heappop, heappushfrom math import log2# ------------------------------  def main():    n, k = RL()    # print(bin(n))     ones = bin(n).count('1')    if ones>k:        print('No')    else:        res = []        carr = 0        pt = -60        for i in range(60, 0, -1):            if n>>i & 1:                ones-=1                carr+=1             if carr*2+ones>k:                res.extend([i]*carr)                pt = i-1                for j in range(pt, -1, -1):                    if n >> j & 1:                        res.append(j)                break            carr*=2        else:            if n&1: carr+=1            now = 0            while carr*2<=k:                carr*=2                now-=1            res.extend([now]*carr)            # print(res)        dif = k-len(res)         if dif>0:            lst = res.pop()            dif+=1             now = 1            pos = lst             res.extend([lst-i for i in range(1, dif-1)])            res.extend([lst-dif+1]*2)              # while now<=dif:            #     if now*2>=dif:            #         mv = dif-now            #         # print(mv, '===', dif, now, pos)            #         res.extend([pos]*(now-mv))            #         res.extend([pos-1]*(mv*2))            #         break            #     else:            #         res.append(lst-1)            #            #     pos-=1            #     now*=2         print("Yes")        print(*res)  if __name__ == "__main__":    main() 