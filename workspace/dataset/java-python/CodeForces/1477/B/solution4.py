import osimport

sysfrom
io
import BytesIO, \
    IOBase  # region fastioBUFSIZE = 8192class FastIO(IOBase):    def __init__(self, file):        self.newlines = 0        self._fd = file.fileno()        self.buffer = BytesIO()        self.writable = "x" in file.mode or "r" not in file.mode        self.write = self.buffer.write if self.writable else None     def read(self):        while True:            b = os.read(self._fd, max(os.fstat(self._fd).st_size, BUFSIZE))            if not b:                break            ptr = self.buffer.tell()            self.buffer.seek(0, 2), self.buffer.write(b), self.buffer.seek(ptr)        self.newlines = 0        return self.buffer.read()     def readline(self):        while self.newlines == 0:            b = os.read(self._fd, max(os.fstat(self._fd).st_size, BUFSIZE))            self.newlines = b.count(b"\n") + (not b)            ptr = self.buffer.tell()            self.buffer.seek(0, 2), self.buffer.write(b), self.buffer.seek(ptr)        self.newlines -= 1        return self.buffer.readline()     def flush(self):        if self.writable:            os.write(self._fd, self.buffer.getvalue())            self.buffer.truncate(0), self.buffer.seek(0)  class IOWrapper(IOBase):    def __init__(self, file):        self.buffer = FastIO(file)        self.flush = self.buffer.flush        self.writable = self.buffer.writable        self.write = lambda s: self.buffer.write(s.encode("ascii"))        self.read = lambda: self.buffer.read().decode("ascii")        self.readline = lambda: self.buffer.readline().decode("ascii")  sys.stdin, sys.stdout = IOWrapper(sys.stdin), IOWrapper(sys.stdout)input = lambda: sys.stdin.readline() # -------------------------------------------------------------------- def RL(): return map(int, sys.stdin.readline().split())def RLL(): return list(map(int, sys.stdin.readline().split()))def N(): return int(input())def S(): return input().strip()def print_list(l): print(' '.join(map(str, l)))    # sys.setrecursionlimit(200000)# import random# from functools import reduce# from functools import lru_cache# from heapq import *# from collections import deque as dq# import math# import bisect as bs# from collections import Counter# from collections import defaultdict as dc  def set_range(lx, rx, v, now):    if l <= lx and r >= rx:        label[now] = v         node[now] = rx - lx if v else 0        return    mx = (lx + rx) >> 1    nl = now << 1    nr = nl + 1    if label[now] != -1:     # 非对称操作启用该环节        node[nl] = node[nr] = node[now] >> 1        label[nl] = label[nr] = label[now]        label[now] = -1    if l < mx: set_range(lx, mx, v, nl)    if r > mx: set_range(mx, rx, v, nr)    node[now] = node[nl] +  node[nr] def get_range(lx, rx, now):    if l <= lx and r >= rx: return node[now]    mx = (lx + rx) >> 1    nl = now << 1    nr = nl + 1    if label[now] != -1: return min(rx, r) - max(lx, l) if label[now] else 0    m1 = get_range(lx, mx, nl) if l < mx else 0    m2 = get_range(mx, rx, nr) if r > mx else 0    return m1 + m2      def match(lx, rx, now):    if lx >= n: return False    if now >= sn: return node[now] != s[lx]    if label[now] != -1: return any(v != label[now] for v in s[lx:rx])    mx = (rx + lx) >> 1    return match(lx, mx, now << 1) or match(mx, rx, now << 1 | 1) for _ in range(N()):     n, q = RL()    s, t = [int(c) for c in S()], [int(c) for c in S()]    p = [tuple(RL()) for _ in range(q)]    sn = 1 << n.bit_length()    node = [0] * sn + t + [0] * (sn - n)    label = [-1] * (2 * sn)    for i in range(sn - 1, 0, -1): node[i] = node[i << 1] + node[i << 1 | 1]    f = True    for l, r in p[::-1]:        l -= 1        count = get_range(0, sn, 1) * 2        if count == r - l:            f = False            break        set_range(0, sn, 1 if count > r - l else 0, 1)    print('YES' if f and not match(0, sn, 1) else 'NO')
