# ------------------- fast io --------------------import osimport sysfrom io import BytesIO, IOBase#sys.setrecursionlimit(10**5) BUFSIZE = 8192  class FastIO(IOBase):    newlines = 0     def __init__(self, file):        self._fd = file.fileno()        self.buffer = BytesIO()        self.writable = "x" in file.mode or "r" not in file.mode        self.write = self.buffer.write if self.writable else None     def read(self):        while True:            b = os.read(self._fd, max(os.fstat(self._fd).st_size, BUFSIZE))            if not b:                break            ptr = self.buffer.tell()            self.buffer.seek(0, 2), self.buffer.write(b), self.buffer.seek(ptr)        self.newlines = 0        return self.buffer.read()     def readline(self):        while self.newlines == 0:            b = os.read(self._fd, max(os.fstat(self._fd).st_size, BUFSIZE))            self.newlines = b.count(b"\n") + (not b)            ptr = self.buffer.tell()            self.buffer.seek(0, 2), self.buffer.write(b), self.buffer.seek(ptr)        self.newlines -= 1        return self.buffer.readline()     def flush(self):        if self.writable:            os.write(self._fd, self.buffer.getvalue())            self.buffer.truncate(0), self.buffer.seek(0)  class IOWrapper(IOBase):    def __init__(self, file):        self.buffer = FastIO(file)        self.flush = self.buffer.flush        self.writable = self.buffer.writable        self.write = lambda s: self.buffer.write(s.encode("ascii"))        self.read = lambda: self.buffer.read().decode("ascii")        self.readline = lambda: self.buffer.readline().decode("ascii")  sys.stdin, sys.stdout = IOWrapper(sys.stdin), IOWrapper(sys.stdout)input = lambda: sys.stdin.readline().rstrip("\r\n")if os.path.exists('input.txt'):    sys.stdin = open('input.txt','r')    sys.stdout = open('output.txt','w')  # ------------------- fast io --------------------from math import *from itertools import * # chain,groupby,permutations,combinationsfrom collections import Counterfrom bisect import * """def prod(a, mod=10**9+7):    ans = 1    for each in a:        ans = (ans * each) % mod    return ans def lcm(a, b): return a * b // gcd(a, b) def binary(x, length=16):    y = bin(x)[2:]    return y if len(y) >= length else "0" * (length - len(y)) + y  def powerset(s):    n=len(s)        return chain.from_iterable(combinations(s,r) for r in range(1,n)) def binarySearch(arr,x):     l=0    r=len(arr)-1    while l <= r:           mid = l + (r - l) // 2;         if arr[mid] == x:             return mid         elif arr[mid] < x:             l = mid + 1        else:             r = mid - 1    return -1 def prime(): #array of prime numbers    arr = [1]*10000    for i in range(10000):        if i==0:            arr[i]=0        elif i==1:            arr[i]=0        else:            if not arr[i]:                continue            j=i            for k in range(2,10000):                if j*k>=len(arr):                    break                arr[j*k]=0    return arr def isprime(x) -> bool: #return true if number is prime    i=2    while i*i<=x:        if x%i==0:            return 0        i+=1    return 1  def palindrome(string,start,end):    if start==end:        return True    if end==1:        return True    return string[start]==string[end-1] and palindrome(string,start+1,end-1)  """ #----#    def aa(): #for int    return(int(input()))def bb(): #for int arr    return(list(map(int,input().split())))def cc():  #for string    s = input()    return (list(s))def dd(): #space seperated intege    return(map(int,input().split()))#----#  def koi_coding_sikha_do():       n=aa()    s = cc()    temp = [s[0],s[1]]    count=0    for i in range(2,n):        if s[i]=="x":            if temp[-1]=="x" and temp[-2]=="x":                count+=1            else:                temp.append("x")        else:            temp.append(s[i])    print(count)               if __name__ == "__main__":    t=1#aa()    while(t):        koi_coding_sikha_do()        t-=1   """ __________          __  .__                              __    __             _________                          \______   \___.__._/  |_|  |__   ____   ____             \ \   \ \            \_   ___ \     .__         .__      |     ___<   |  |\   __\  |  \ /  _ \ /    \             \ \   \ \           /    \  \/   __|  |___   __|  |___  |    |    \___  | |  | |   Y  (  <_> )   |  \            / /   / /           \     \____ /__    __/  /__    __/  |____|    / ____| |__| |___|  /\____/|___|  /           /_/   /_/             \______  /    |__|        |__|               \/                \/            \/                                         \/                          Unke aakhon me aasu aur chahre pe hasi hai......lagta hai unki lulli unki zip me phasi hai""" 
