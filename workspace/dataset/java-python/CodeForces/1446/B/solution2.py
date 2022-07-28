import sysimport

mathimport
heapqimport
bisectfrom
collections
import Counterfrom

collections
import defaultdictfrom

io
import BytesIO, IOBaseimport

string  

class FastIO(IOBase):    newlines = 0

 

def __init__(self, file):        import os


self.os = os
self._fd = file.fileno()
self.buffer = BytesIO()
self.writable = "x" in file.mode or "r" not in file.mode
self.write = self.buffer.write if self.writable else None
self.BUFSIZE = 8192 

def read(self):        while


True: b = self.os.read(self._fd, max(self.os.fstat(self._fd).st_size, self.BUFSIZE))
if not b:                break
ptr = self.buffer.tell()
self.buffer.seek(0, 2), self.buffer.write(b), self.buffer.seek(ptr)
self.newlines = 0
return self.buffer.read() 

def readline(self):        while


self.newlines == 0: b = self.os.read(self._fd, max(self.os.fstat(self._fd).st_size, self.BUFSIZE))
self.newlines = b.count(b"\n") + (not b)
ptr = self.buffer.tell()
self.buffer.seek(0, 2), self.buffer.write(b), self.buffer.seek(ptr)
self.newlines -= 1
return self.buffer.readline() 

def flush(self):        if


self.writable: self.os.write(self._fd, self.buffer.getvalue())
self.buffer.truncate(0), self.buffer.seek(0)  

class IOWrapper(IOBase):    def


__init__(self, file): self.buffer = FastIO(file)
self.flush = self.buffer.flush
self.writable = self.buffer.writable
self.write = lambda s: self.buffer.write(s.encode("ascii"))
self.read = lambda: self.buffer.read().decode("ascii")
self.readline = lambda: self.buffer.readline().decode("ascii")  sys.stdin, sys.stdout = IOWrapper(sys.stdin), IOWrapper(
    sys.stdout)
input = lambda: sys.stdin.readline().rstrip("\r\n")  

def get_int():    return int(input())

  

def get_ints():    return list(map(int, input().split(' ')))

  

def get_int_grid(n):    return [get_ints() for _ in range(n)]

  

def get_str():    return input().strip()

  

def get_strs():    return get_str().split(' ')

  

def flat_list(arr):    return [item for subarr in arr for item in subarr]

  

def yes_no(b):    if


b:
return "YES" else:        return "NO"  

def binary_search(good, left, right, delta=1,
                  right_true=False):    """    Performs binary search    ----------    Parameters    ----------    :param good: Function used to perform the binary search    :param left: Starting value of left limit    :param right: Starting value of the right limit    :param delta: Margin of error, defaults value of 1 for integer binary search    :param right_true: Boolean, for whether the right limit is the true invariant    :return: Returns the most extremal value interval [left, right] which is good function evaluates to True,            alternatively returns False if no such value found    """

     limits = [left, right]
while limits[1] - limits[0] > delta:        if
delta == 1: mid = sum(limits) // 2 else:            mid = sum(limits) / 2
if good(mid):
    limits[int(right_true)] = mid        else:
    limits[int(~right_true)] = mid
if good(limits[int(right_true)]):
    return limits[int(right_true)]    else:
    return False  

def prefix_sums(a):    p = [0]


for x in a:        p.append(p[-1] + x)
return p  

def solve_a():    n = int(input())


a = [(i + 1) for i in range(n)]
return a  

def solve_b():    n, m = [int(x) for x in input().split(' ')]


grid = []
for i in range(n):        grid += [int(x) for x in input().split(' ')]
grid_abs = [abs(x) for x in grid]
grid_abs.sort()
if 0 in grid:
    ans = sum(grid_abs)    else:
    ans = sum(grid_abs)
negs = len([x for x in grid if x < 0]) % 2
ans -= grid_abs[0] * 2 * negs
return ans  

def solve_c():    n, m = [int(x) for x in input().split(' ')]


grid = []
for i in range(n):        grid += [int(x) for x in input().split(' ')]
grid_abs = [abs(x) for x in grid]
grid_abs.sort()
if 0 in grid:
    ans = sum(grid_abs)    else:
    ans = sum(grid_abs)
negs = len([x for x in grid if x < 0]) % 2
ans -= grid_abs[0] * 2 * negs
print(ans)  

def solve_d():    n, m = get_ints()


A = get_str()
B = get_str()     dp = [[0] * (m + 1) for _ in range(n + 1)]
M = 0
for i in range(1, n + 1):        for
j in range(1, m + 1):
if A[i - 1] == B[j - 1]:
    dp[i][j] = max(dp[i][j], dp[i - 1][j - 1] + 2)            else:
    dp[i][j] = max(dp[i][j], dp[i - 1][j] - 1, dp[i][j - 1] - 1)
M = max(M, dp[i][j])
return M  print(solve_d())
