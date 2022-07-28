#!/usr/bin/env pythonfrom __future__ import division, print_functionimport mathimport osimport sysfrom fractions import *from sys import stdin,stdoutfrom io import BytesIO, IOBasefrom itertools import accumulatefrom collections import deque#sys.setrecursionlimit(10**5) def inp(): return sys.stdin.readline().rstrip("\r\n")  # for fast input def out(var): sys.stdout.write(str(var))  # for fast output, always take string def lis(): return list(map(int, inp().split())) def stringlis(): return list(map(str, inp().split())) def sep(): return map(int, inp().split()) def strsep(): return map(str, inp().split()) def fsep(): return map(float, inp().split()) def inpu(): return int(inp()) if sys.version_info[0] < 3:    from __builtin__ import xrange as range    from future_builtins import ascii, filter, hex, map, oct, zip#sys.setrecursionlimit(10**6) # region fastio BUFSIZE = 8192  class FastIO(IOBase):    newlines = 0     def __init__(self, file):        self._fd = file.fileno()        self.buffer = BytesIO()        self.writable = "x" in file.mode or "r" not in file.mode        self.write = self.buffer.write if self.writable else None     def read(self):        while True:            b = os.read(self._fd, max(os.fstat(self._fd).st_size, BUFSIZE))            if not b:                break            ptr = self.buffer.tell()            self.buffer.seek(0, 2), self.buffer.write(b), self.buffer.seek(ptr)        self.newlines = 0        return self.buffer.read()     def readline(self):        while self.newlines == 0:            b = os.read(self._fd, max(os.fstat(self._fd).st_size, BUFSIZE))            self.newlines = b.count(b"\n") + (not b)            ptr = self.buffer.tell()            self.buffer.seek(0, 2), self.buffer.write(b), self.buffer.seek(ptr)        self.newlines -= 1        return self.buffer.readline()     def flush(self):        if self.writable:            os.write(self._fd, self.buffer.getvalue())            self.buffer.truncate(0), self.buffer.seek(0)  class IOWrapper(IOBase):    def __init__(self, file):        self.buffer = FastIO(file)        self.flush = self.buffer.flush        self.writable = self.buffer.writable        self.write = lambda s: self.buffer.write(s.encode("ascii"))        self.read = lambda: self.buffer.read().decode("ascii")        self.readline = lambda: self.buffer.readline().decode("ascii")  def print(*args, **kwargs):    """Prints the values to a stream, or to sys.stdout by default."""    sep, file = kwargs.pop("sep", " "), kwargs.pop("file", sys.stdout)    at_start = True    for x in args:        if not at_start:            file.write(sep)        file.write(str(x))        at_start = False    file.write(kwargs.pop("end", "\n"))    if kwargs.pop("flush", False):        file.flush()  if sys.version_info[0] < 3:    sys.stdin, sys.stdout = FastIO(sys.stdin), FastIO(sys.stdout)else:    sys.stdin, sys.stdout = IOWrapper(sys.stdin), IOWrapper(sys.stdout) input = lambda: sys.stdin.readline().rstrip("\r\n")#----------------------------------------------------------------- def regularbracket(t):    p=0    for i in t:        if i=="(":            p+=1        else:            p-=1        if p<0:            return False    else:        if p>0:            return False        else:            return True #-------------------------------------------------def binarySearchCount(arr, n, key):    left = 0    right = n - 1     count = 0     while (left <= right):        mid = int((right + left) / 2)         # Check if middle element is        # less than or equal to key        if (arr[mid] <= key):            count = mid+1            left = mid + 1         # If key is smaller, ignore right half        else:            right = mid - 1    return count#------------------------------reverse string(pallindrome)def reverse1(string):    pp=""    for i in string[::-1]:        pp+=i    if pp==string:        return True    return False#--------------------------------reverse list(paindrome)def reverse2(list1):    l=[]    for i in list1[::-1]:        l.append(i)    if l==list1:        return True    return Falsedef mex(list1):    #list1 = sorted(list1)    p = max(list1)+1    for i in range(len(list1)):        if list1[i]!=i:            p = i            break    return pdef sumofdigits(n):    n = str(n)    s1=0    for i in n:        s1+=int(i)    return s1def perfect_square(n):    s = math.sqrt(n)    if s==int(s):        return True    return False #-----------------------------romandef roman_number(x):    if x>15999:        return    value=[5000,4000,1000,900,500,400,100,90,50,40,10,9,5,4,1]    symbol = ["F","MF","M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"]    roman=""    i=0    while x>0:        div = x//value[i]        x = x%value[i]        while div:            roman+=symbol[i]            div-=1        i+=1    return roman def soretd(s):    for i in range(1,len(s)):        if s[i-1]>s[i]:            return False    return True#print(soretd("1"))#---------------------------------def binpow(a,b):    if b==0:        return 1    else:        res=binpow(a,b//2)    if b%2!=0:        return res*res*a    else:        return res*res#-------------------------------------------------------def binpowmodulus(a,b,m):    a %= m    res = 1    while (b > 0):        if (b & 1):            res = res * a % m        a = a * a % m        b >>= 1    return res#-------------------------------------------------------------def coprime_to_n(n):    result = n    i=2    while(i*i<=n):        if (n % i == 0):            while (n % i == 0):                n //= i            result -= result // i        i+=1    if (n > 1):        result -= result // n    return result#-------------------primedef prime(x):    if x==1:        return False    else:        for i in range(2,int(math.sqrt(x))+1):            if(x%i==0):                return False        else:            return True def luckynumwithequalnumberoffourandseven(x,n,a):    if x >= n and str(x).count("4") == str(x).count("7"):        a.append(x)    else:        if x < 1e12:            luckynumwithequalnumberoffourandseven(x * 10 + 4,n,a)            luckynumwithequalnumberoffourandseven(x * 10 + 7,n,a)    return a #def mapu(): return map(int,input().split())#endregion------------------------------l=[]for i in range(1,20):    l.append(2**i)def main():    x,y,n = sep()     c = (Fraction(x,y).limit_denominator(n))   # print(type(c))   # print(c)    c = str(c)    if "/" in c:            print(c)    else:            print(c+"/"+"1")if __name__ == '__main__':    main()