import osimport sysfrom io import BytesIO, IOBase _print = printBUFSIZE = 8192  class FastIO(IOBase):    newlines = 0     def __init__(self, file):        self._fd = file.fileno()        self.buffer = BytesIO()        self.writable = 'x' in file.mode or 'r' not in file.mode        self.write = self.buffer.write if self.writable else None     def read(self):        while True:            b = os.read(self._fd, max(os.fstat(self._fd).st_size, BUFSIZE))            if not b:                break            ptr = self.buffer.tell()            self.buffer.seek(0, 2), self.buffer.write(b), self.buffer.seek(ptr)        self.newlines = 0        return self.buffer.read()     def readline(self):        while self.newlines == 0:            b = os.read(self._fd, max(os.fstat(self._fd).st_size, BUFSIZE))            self.newlines = b.count(b'\n') + (not b)            ptr = self.buffer.tell()            self.buffer.seek(0, 2), self.buffer.write(b), self.buffer.seek(ptr)        self.newlines -= 1        return self.buffer.readline()     def flush(self):        if self.writable:            os.write(self._fd, self.buffer.getvalue())            self.buffer.truncate(0), self.buffer.seek(0)  class IOWrapper(IOBase):    def __init__(self, file):        self.buffer = FastIO(file)        self.flush = self.buffer.flush        self.writable = self.buffer.writable        self.write = lambda s: self.buffer.write(s.encode('ascii'))        self.read = lambda: self.buffer.read().decode('ascii')        self.readline = lambda: self.buffer.readline().decode('ascii')  def inp():    return sys.stdin.readline().rstrip()  def mpint():    return map(int, inp().split(' '))  def itg():    return int(inp())  # ############################## import# https://codeforces.com/contest/1070/submission/71820555# ############################## mainfrom collections import deque D = 507S = 5007  def solve():    d, sm = mpint()    dq = deque([(0, 0)])    mod = [i % d for i in range(S)]    dp = [[0] * D for _ in range(S)]    ar = [[(0, 0)] * D for _ in range(S)]    dp[0][0] = 1    while dq and not dp[sm][0]:        s, r = dq.popleft()        for i in range(10):            a = s + i            b = mod[10 * r + i]            if a == 0 or a > sm:                continue            if dp[a][b] == 0:                dq.append((a, b))                dp[a][b] = 1                ar[a][b] = s, r    if not dp[sm][0]:        return -1    s = sm    r = 0    ans = []    while s:        a, b = ar[s][r]        ans.append(chr(ord('0') + s - a))        s, r = ar[s][r]    ans.reverse()    return ''.join(ans)  def main():    print(solve())  DEBUG = 0URL = 'https://codeforces.com/contest/1070/problem/A' if __name__ == '__main__':    # 0: normal, 1: runner, 2: debug, 3: interactive    if DEBUG == 1:        import requests        from ACgenerator.Y_Test_Case_Runner import TestCaseRunner         runner = TestCaseRunner(main, URL)        inp = runner.input_stream        print = runner.output_stream        runner.checking()    else:        if DEBUG != 2:            sys.stdin, sys.stdout = IOWrapper(sys.stdin), IOWrapper(sys.stdout)        if DEBUG:            def print(*args, **kwargs):                _print(*args, **kwargs)                sys.stdout.flush()        main()# Please check!
