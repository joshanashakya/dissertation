# DEFINING SOME GOOD STUFFimport sysfrom math import *import threadingfrom itertools import countfrom pprint import pprintfrom collections import defaultdict'''    intialise defaultdict by any kind of value by default you want to take ( int -> 0 | list -> [] )'''from heapq import heapify, heappop, heappushsys.setrecursionlimit(300000)# threading.stack_size(10**8)'''-> if you are increasing recursionlimit then remember submitting using python3 rather pypy3-> sometimes increasing stack size don't work locally but it will work on CF''' mod = 10 ** 9 + 7inf = 10 ** 15decision = ['NO', 'YES']yes = 'YES'no = 'NO' # ------------------------------FASTIO----------------------------import os from io import BytesIO, IOBase BUFSIZE = 8192  class FastIO(IOBase):    newlines = 0     def __init__(self, file):        self._fd = file.fileno()        self.buffer = BytesIO()        self.writable = "x" in file.mode or "r" not in file.mode        self.write = self.buffer.write if self.writable else None     def read(self):        while True:            b = os.read(self._fd, max(os.fstat(self._fd).st_size, BUFSIZE))            if not b:                break            ptr = self.buffer.tell()            self.buffer.seek(0, 2), self.buffer.write(b), self.buffer.seek(ptr)        self.newlines = 0        return self.buffer.read()     def readline(self):        while self.newlines == 0:            b = os.read(self._fd, max(os.fstat(self._fd).st_size, BUFSIZE))            self.newlines = b.count(b"\n") + (not b)            ptr = self.buffer.tell()            self.buffer.seek(0, 2), self.buffer.write(b), self.buffer.seek(ptr)        self.newlines -= 1        return self.buffer.readline()     def flush(self):        if self.writable:            os.write(self._fd, self.buffer.getvalue())            self.buffer.truncate(0), self.buffer.seek(0)  class IOWrapper(IOBase):    def __init__(self, file):        self.buffer = FastIO(file)        self.flush = self.buffer.flush        self.writable = self.buffer.writable        self.write = lambda s: self.buffer.write(s.encode("ascii"))        self.read = lambda: self.buffer.read().decode("ascii")        self.readline = lambda: self.buffer.readline().decode("ascii")  sys.stdin, sys.stdout = IOWrapper(sys.stdin), IOWrapper(sys.stdout)input = lambda: sys.stdin.readline().rstrip("\r\n")   # _______________________________________________________________# def npr(n, r):    return factorial(n) // factorial(n - r) if n >= r else 0  def ncr(n, r):    return factorial(n) // (factorial(r) * factorial(n - r)) if n >= r else 0  def lower_bound(li, num):    answer = -1    start = 0    end = len(li) - 1     while (start <= end):        middle = (end + start) // 2        if li[middle] >= num:            answer = middle            end = middle - 1        else:            start = middle + 1    return answer  # min index where x is not less than num  def upper_bound(li, num):    answer = -1    start = 0    end = len(li) - 1     while (start <= end):        middle = (end + start) // 2         if li[middle] <= num:            answer = middle            start = middle + 1         else:            end = middle - 1    return answer  # max index where x is not greater than num  def abs(x):    return x if x >= 0 else -x  def binary_search(li, val):    # print(lb, ub, li)    ans = -1    lb = 0    ub = len(li) - 1    while (lb <= ub):        mid = (lb + ub) // 2        # print('mid is',mid, li[mid])        if li[mid] > val:            ub = mid - 1        elif val > li[mid]:            lb = mid + 1        else:            ans = mid  # return index            break    return ans  def kadane(x):  # maximum sum contiguous subarray    sum_so_far = 0    current_sum = 0    for i in x:        current_sum += i        if current_sum < 0:            current_sum = 0        else:            sum_so_far = max(sum_so_far, current_sum)    return sum_so_far  def pref(li):    pref_sum = [0]    for i in li:        pref_sum.append(pref_sum[-1] + i)    return pref_sum  def SieveOfEratosthenes(n):    prime = [True for i in range(n + 1)]    p = 2    li = []    while (p * p <= n):        if (prime[p] == True):            for i in range(p * p, n + 1, p):                prime[i] = False        p += 1     for p in range(2, len(prime)):        if prime[p]:            li.append(p)    return li  def primefactors(n):    factors = []    while (n % 2 == 0):        factors.append(2)        n //= 2    for i in range(3, int(sqrt(n)) + 1, 2):  # only odd factors left        while n % i == 0:            factors.append(i)            n //= i    if n > 2:  # incase of prime        factors.append(n)    return factors  def prod(li):    ans = 1    for i in li:        ans *= i    return ans  # _______________________________________________________________#  # def main():for _ in range(1):# for _ in range(int(input())):#     n = int(input())    n, m = map(int, input().split())    # w, b = map(int, input().split())    # a = list(map(int, input().split()))    # b = list(map(int, input().split()))    # c = list(map(int, input().split()))    # s = list(input())    # d = defaultdict(int)    a = []    for i in range(n):        a.append(list(map(int, input().split())))    x, y = [], []    for i in range(n):        for j in range(m):            if a[i][j] == 0:                x.append(i)                y.append(j)    b = [[1 for j in range(m)] for i in range(n)]    for i in x:        for j in range(m):            b[i][j] = 0    for i in y:        for j in range(n):            b[j][i] = 0     # checking if the answer is correct    x, y = [], []    for i in range(n):        for j in range(m):            if b[i][j] == 1:                x.append(i)                y.append(j)    temp = [[0 for j in range(m)] for i in range(n)]    for i in x:        for j in range(m):            temp[i][j] = 1    for i in y:        for j in range(n):            temp[j][i] = 1    f = 1    for i in range(n):        for j in range(m):            if temp[i][j] != a[i][j]:                f = 0                break    if f:        print(yes)        for i in range(n):            print(*b[i])    else:        print(no)                                                          # t = threading.Thread(target=main)# t.start()# t.join()
