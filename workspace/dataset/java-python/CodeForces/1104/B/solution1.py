#!/usr/bin/env pythonimport osimport sysfrom io import BytesIO, IOBase#from bisect import bisect_left as bl                #c++ lowerbound bl(array,element)#from bisect import bisect_right as br               #c++ upperbound br(array,element)  def main():    # sys.stdin = open('input.txt', 'r')    # sys.stdout = open('output.txt', 'w')    # for _ in range(int(input())):    s=input()    prev=s[0]    cnt=0    stk=[]    win=0    for x in range(len(s)):        if prev==s[x]:            cnt+=1        else:            if (cnt//2)%2!=0:                win^=1            if cnt%2==0:                if len(stk)>0 and stk[len(stk)-1]==s[x]:                    cnt=2                    stk.pop()                else:                    cnt=1            else:                cnt=1                stk.append(prev)        prev=s[x]    if(cnt//2)%2!=0:        win^=1    if win==0: print("No")    else: print("Yes")  #-----------------------------BOSS-------------------------------------!# region fastio BUFSIZE = 8192  class FastIO(IOBase):    newlines = 0     def __init__(self, file):        self._fd = file.fileno()        self.buffer = BytesIO()        self.writable = "x" in file.mode or "r" not in file.mode        self.write = self.buffer.write if self.writable else None     def read(self):        while True:            b = os.read(self._fd, max(os.fstat(self._fd).st_size, BUFSIZE))            if not b:                break            ptr = self.buffer.tell()            self.buffer.seek(0, 2), self.buffer.write(b), self.buffer.seek(ptr)        self.newlines = 0        return self.buffer.read()     def readline(self):        while self.newlines == 0:            b = os.read(self._fd, max(os.fstat(self._fd).st_size, BUFSIZE))            self.newlines = b.count(b"\n") + (not b)            ptr = self.buffer.tell()            self.buffer.seek(0, 2), self.buffer.write(b), self.buffer.seek(ptr)        self.newlines -= 1        return self.buffer.readline()     def flush(self):        if self.writable:            os.write(self._fd, self.buffer.getvalue())            self.buffer.truncate(0), self.buffer.seek(0)  class IOWrapper(IOBase):    def __init__(self, file):        self.buffer = FastIO(file)        self.flush = self.buffer.flush        self.writable = self.buffer.writable        self.write = lambda s: self.buffer.write(s.encode("ascii"))        self.read = lambda: self.buffer.read().decode("ascii")        self.readline = lambda: self.buffer.readline().decode("ascii")  sys.stdin, sys.stdout = IOWrapper(sys.stdin), IOWrapper(sys.stdout)input = lambda: sys.stdin.readline().rstrip("\r\n") # endregion if __name__ == "__main__":    main()