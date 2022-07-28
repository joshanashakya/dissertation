#------------------------------warmup----------------------------import osimport sysimport mathfrom io import BytesIO, IOBase BUFSIZE = 8192  class FastIO(IOBase):    newlines = 0     def __init__(self, file):        self._fd = file.fileno()        self.buffer = BytesIO()        self.writable = "x" in file.mode or "r" not in file.mode        self.write = self.buffer.write if self.writable else None     def read(self):        while True:            b = os.read(self._fd, max(os.fstat(self._fd).st_size, BUFSIZE))            if not b:                break            ptr = self.buffer.tell()            self.buffer.seek(0, 2), self.buffer.write(b), self.buffer.seek(ptr)        self.newlines = 0        return self.buffer.read()     def readline(self):        while self.newlines == 0:            b = os.read(self._fd, max(os.fstat(self._fd).st_size, BUFSIZE))            self.newlines = b.count(b"\n") + (not b)            ptr = self.buffer.tell()            self.buffer.seek(0, 2), self.buffer.write(b), self.buffer.seek(ptr)        self.newlines -= 1        return self.buffer.readline()     def flush(self):        if self.writable:            os.write(self._fd, self.buffer.getvalue())            self.buffer.truncate(0), self.buffer.seek(0)  class IOWrapper(IOBase):    def __init__(self, file):        self.buffer = FastIO(file)        self.flush = self.buffer.flush        self.writable = self.buffer.writable        self.write = lambda s: self.buffer.write(s.encode("ascii"))        self.read = lambda: self.buffer.read().decode("ascii")        self.readline = lambda: self.buffer.readline().decode("ascii")  sys.stdin, sys.stdout = IOWrapper(sys.stdin), IOWrapper(sys.stdout)input = lambda: sys.stdin.readline().rstrip("\r\n") #-------------------game starts now----------------------------------------------------# Function to call the actual solutiondef solution(li, n, m):	s = [[] for i in range(n)]	for j in range(2, n, 2):		s[j] = [2]	for i in range(3, n, 2):		if s[i]:			continue		for j in range(i, n, i):			s[j].append(i)	p, d, r = {}, set(), [''] * m	for j in range(len(li)):		t = li[j][0]		i = int(li[j][1])		if t[0] == '+':			if i in d:				r[j] = 'Already on'				continue			for q in s[i]:				if q in p:					r[j] = 'Conflict with ' + str(p[q])					break			else:				r[j] = 'Success'				d.add(i)				for q in s[i]: p[q] = i		else:			if i in d:				r[j] = 'Success'				for q in s[i]: p.pop(q)				d.remove(i)			else:				r[j] = 'Already off'	return r   # Function to take inputdef input_test():	# for _ in range(int(input())):		# n = int(input())		n, m = map(int, input().strip().split(" "))		quer = []		for i in range(m):			qu = list(map(str, input().strip().split(" ")))			quer.append(qu)		# a, b, c = map(int, input().strip().split(" "))		# li = list(map(int, input().strip().split(" ")))		out = solution(quer, n+1, m)		for i in out:			print(i) # Function to test my codedef test():	pass # seive()input_test()# test()
