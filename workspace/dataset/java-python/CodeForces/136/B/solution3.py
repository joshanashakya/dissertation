#(っ◔◡◔)っ ♥ GLHF ♥import os                                                                            #(っ◔◡◔)っimport sys                                                                           #(っ◔◡◔)っfrom io import BytesIO, IOBase                                                       #(っ◔◡◔)っdef main():                                                                          #(っ◔◡◔)っ    line = input().split()    x, ans = int(line[0]), int(line[1])     x3 = []    ans3 = []     while(x > 0):        x3.append(x%3)        x //= 3    while(ans>0):        ans3.append(ans%3)        ans //= 3    x3.reverse()    ans3.reverse()    while(len(x3) < len(ans3)):        x3.insert(0, 0)    while(len(x3) > len(ans3)):        ans3.insert(0, 0)    # print(x3, ans3)    b = []    for i in range(len(ans3)):        b.append((ans3[i] - x3[i])%3)    summ = 0    b.reverse()    for i in range(len(b)):        summ += (3**i)*(b[i])     print(summ)    # print(b) BUFSIZE = 8192                                                                       #(っ◔◡◔)っclass FastIO(IOBase):                                                                #(っ◔◡◔)っ    newlines = 0                                                                     #(っ◔◡◔)っ    def __init__(self, file):                                                        #(っ◔◡◔)っ        self._fd = file.fileno()                                                     #(っ◔◡◔)っ        self.buffer = BytesIO()                                                      #(っ◔◡◔)っ        self.writable = "x" in file.mode or "r" not in file.mode                     #(っ◔◡◔)っ        self.write = self.buffer.write if self.writable else None                    #(っ◔◡◔)っ    def read(self):                                                                  #(っ◔◡◔)っ        while True:                                                                  #(っ◔◡◔)っ            b = os.read(self._fd, max(os.fstat(self._fd).st_size, BUFSIZE))          #(っ◔◡◔)っ            if not b:                                                                #(っ◔◡◔)っ                break                                                                #(っ◔◡◔)っ            ptr = self.buffer.tell()                                                 #(っ◔◡◔)っ            self.buffer.seek(0, 2), self.buffer.write(b), self.buffer.seek(ptr)      #(っ◔◡◔)っ        self.newlines = 0                                                            #(っ◔◡◔)っ        return self.buffer.read()                                                    #(っ◔◡◔)っ    def readline(self):                                                              #(っ◔◡◔)っ        while self.newlines == 0:                                                    #(っ◔◡◔)っ            b = os.read(self._fd, max(os.fstat(self._fd).st_size, BUFSIZE))          #(っ◔◡◔)っ            self.newlines = b.count(b"\n") + (not b)                                 #(っ◔◡◔)っ            ptr = self.buffer.tell()                                                 #(っ◔◡◔)っ            self.buffer.seek(0, 2), self.buffer.write(b), self.buffer.seek(ptr)      #(っ◔◡◔)っ        self.newlines -= 1                                                           #(っ◔◡◔)っ        return self.buffer.readline()                                                #(っ◔◡◔)っ    def flush(self):                                                                 #(っ◔◡◔)っ        if self.writable:                                                            #(っ◔◡◔)っ            os.write(self._fd, self.buffer.getvalue())                               #(っ◔◡◔)っ            self.buffer.truncate(0), self.buffer.seek(0)                             #(っ◔◡◔)っclass IOWrapper(IOBase):                                                             #(っ◔◡◔)っ    def __init__(self, file):                                                        #(っ◔◡◔)っ        self.buffer = FastIO(file)                                                   #(っ◔◡◔)っ        self.flush = self.buffer.flush                                               #(っ◔◡◔)っ        self.writable = self.buffer.writable                                         #(っ◔◡◔)っ        self.write = lambda s: self.buffer.write(s.encode("ascii"))                  #(っ◔◡◔)っ        self.read = lambda: self.buffer.read().decode("ascii")                       #(っ◔◡◔)っ        self.readline = lambda: self.buffer.readline().decode("ascii")               #(っ◔◡◔)っsys.stdin, sys.stdout = IOWrapper(sys.stdin), IOWrapper(sys.stdout)                  #(っ◔◡◔)っinput = lambda: sys.stdin.readline().rstrip("\r\n")                                  #(っ◔◡◔)っif __name__ == "__main__":                                                           #(っ◔◡◔)っ    main()                                                                           #(っ◔◡◔)っ#██╗░░░██╗██╗██████╗░██████╗░██╗░░██╗#██║░░░██║██║██╔══██╗╚════██╗██║░██╔╝#╚██╗░██╔╝██║██║░░██║░░███╔═╝█████═╝░#░╚████╔╝░██║██║░░██║██╔══╝░░██╔═██╗░#░░╚██╔╝░░██║██████╔╝███████╗██║░╚██╗#░░░╚═╝░░░╚═╝╚═════╝░╚══════╝╚═╝░░╚═╝