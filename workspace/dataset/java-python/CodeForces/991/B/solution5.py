#Fast IO Regionimport osimport sysfrom io import BytesIO,IOBaseBUFSIZE = 8192class FastIO(IOBase):    newlines = 0    def __init__(self, file):        self._fd = file.fileno()        self.buffer = BytesIO()        self.writable = "x" in file.mode or "r" not in file.mode        self.write = self.buffer.write if self.writable else None    def read(self):        while True:            b = os.read(self._fd, max(os.fstat(self._fd).st_size, BUFSIZE))            if not b:                break            ptr = self.buffer.tell()            self.buffer.seek(0, 2), self.buffer.write(b), self.buffer.seek(ptr)        self.newlines = 0        return self.buffer.read()    def readline(self):        while self.newlines == 0:            b = os.read(self._fd, max(os.fstat(self._fd).st_size, BUFSIZE))            self.newlines = b.count(b"\n") + (not b)            ptr = self.buffer.tell()            self.buffer.seek(0, 2), self.buffer.write(b), self.buffer.seek(ptr)        self.newlines -= 1        return self.buffer.readline()    def flush(self):        if self.writable:            os.write(self._fd, self.buffer.getvalue())            self.buffer.truncate(0), self.buffer.seek(0)class IOWrapper(IOBase):    def __init__(self, file):        self.buffer = FastIO(file)        self.flush = self.buffer.flush        self.writable = self.buffer.writable        self.write = lambda s: self.buffer.write(s.encode("ascii"))        self.read = lambda: self.buffer.read().decode("ascii")        self.readline = lambda: self.buffer.readline().decode("ascii")sys.stdin, sys.stdout = IOWrapper(sys.stdin), IOWrapper(sys.stdout)input = lambda: sys.stdin.readline().rstrip("\r\n") # Get out of main functoindef main():    pass# decimal to binarydef binary(n):    return (bin(n).replace("0b", ""))# binary to decimaldef decimal(s):    return (int(s, 2))# power of a number base 2def pow2(n):    p = 0    while n > 1:        n //= 2        p += 1    return (p)# if  number is prime in √n timedef isPrime(n):    if (n == 1):        return (False)    else:        root = int(n ** 0.5)        root += 1        for i in range(2, root):            if (n % i == 0):                return (False)        return (True)# list to string ,no spacesdef lts(l):    s = ''.join(map(str, l))    return s# String to listdef stl(s):    # for each character in string to list with no spaces -->    l = list(s)    # for space in string  -->    # l=list(s.split(" "))    return l# Returns list of numbers with a particular sumdef sq(a, target, arr=[]):    s = sum(arr)    if (s == target):        return arr    if (s >= target):        return    for i in range(len(a)):        n = a[i]        remaining = a[i + 1:]        ans = sq(remaining, target, arr + [n])        if (ans):            return ans# Sieve for prime numbers in a rangedef SieveOfEratosthenes(n):    cnt = 0    prime = [True for i in range(n + 1)]    p = 2    while (p * p <= n):        if (prime[p] == True):            for i in range(p * p, n + 1, p):                prime[i] = False        p += 1    for p in range(2, n + 1):        if prime[p]:            cnt += 1            # print(p)    return (cnt)# for positive integerse onlydef nCr(n, r):    f = math.factorial    return f(n) // f(r) // f(n - r)# 1000000007mod = int(1e9) + 7def ssinp(): return input()# s=input()def iinp(): return int(input())# n=int(input())def nninp(): return map(int,input().split())#a,b,c=map(int,input().split())def llinp(): return list(map(int,input().split()))# a=list(map(int,input().split()))def p(xyz): print(xyz)def p2(a,b): print(a,b)import math#import random#sys.setrecursionlimit(300000)#from fractions import Fraction#from collections import OrderedDict#from collections import deque########################                         mat=[[0 for i in range(n)] for j in range(m)]                      ################################################                         list.sort(key=lambda x:x[1]) for sorting a list according to second element in sublist            ################################################                         Speed: STRING < LIST < SET,DICTIONARY                      ################################################                         from collections import deque                              ################################################                         ASCII of A-Z= 65-90                                        ################################################                         ASCII of a-z= 97-122                                       ################################################                         d1.setdefault(key, []).append(value)                       #########################for __ in range(iinp()):n=iinp()a=llinp()ans=0while(sum(a)/n<4.5):    a.sort()    a[0]=5    ans+=1p(ans)         """ Stuff you should look for    1.int overflow, array bounds    2.special cases (n=1?)    3. do something instead of nothing and stay organized    4. WRITE STUFF DOWN (MAIN)	5. DON'T GET STUCK ON ONE APPROACH"""        
