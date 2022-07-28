import timestartTimeProblem=time.time() import fileinput, sys, itertools, functools, mathfrom bisect import *from heapq import *from collections import *  MOD = 10**9+7 #isprimedef lcm(a, b):      return (a*b)/math.gcd(a, b) def precompute_binom(n,p):    facts = [0]*n    invfacts = [0]*n     facts[0] = 1    invfacts[0] = 1     for i in range(1,n):                facts[i] = (facts[i-1]*i)%p        invfacts[i] = pow(facts[i],p-2,p)     return facts, invfacts def binom_pre_computed(facts, invfacts, n, k, p):    # n! / (k!^(p-2) * (n-k)!^(p-2)) (mod p)    return (facts[n] * ((invfacts[k]*invfacts[n-k] % p))) % p class UnionFind:    def __init__(self, n):        self.link = [i for i in range(n)]        self.size = [i for i in range(n)]        def find(self, i):        while i!=self.link[i]:            i = self.link[i]        return i        def same(self, i, j):        return self.find(i) == self.find(j)        def unite(self, i, j):        i = self.find(i)        j = self.find(j)         if self.size[i] < self.size[j]:            i, j = j,i                size[i]+=size[j]        link[j] = i  class InputHelper:    def __init__(self):        self.myinput = fileinput.input()     def isLocal(self):        return not fileinput.isstdin()     def int(self):        return int(self.myinput.readline().rstrip())     def ints(self):        return [int(_) for _ in self.myinput.readline().rstrip().split()]     def str(self):        return self.myinput.readline().rstrip()     def strs(self):        return [_ for _ in self.myinput.readline().rstrip().split()] class OutputHelper:    def int(self, a):        print(a)         def ints(self, a):          print(" ".join([str(_) for _ in a]))        def intsNL(self, a):        for _ in a:            print(_)        def str(self, s):        print(s)     def strs(self, s):        print(" ".join([_ for _ in s]))     def strsNL(self, s):        for st in s:            print(st) class ListNode:    def __init__(self, val):        self.val = val        self.next = None        self.prev = None class SegmentTree:    def __init__(self, arr):                       self.n = 2**math.ceil(math.log2(len(arr)))        self.me = [0]*(self.n*2)                        for i in range(self.n, 2*self.n):            ct = i-self.n             if ct>=len(arr):                break             self.me[i] = arr[ct] if ct<len(arr) else 0                            for i in range(2*self.n-1, 0, -1):            self.me[i//2] += self.me[i]        def getFromToIncl(self, a, b):        """        O(log n)        """         a+=self.n        b+=self.n         s = 0         while a<=b:            if a%2==1:                s += self.me[a]                a+=1            if b%2==0:                s += self.me[b]                b-=1                        a//=2            b//=2         return s            def op(self, pos, val):        """        O(log n)        """        pos+=self.n        self.me[pos]+=val         pos//=2         while pos>=1:            self.me[pos] = self.me[2*pos]+self.me[2*pos+1]            pos//=2     In = InputHelper()Out = OutputHelper() ########################################sys.setrecursionlimit(10000) l = In.int()x = 0stck = deque([1])ok = Trueborder = (2**32)-1mod = 10**20+7 for _ in range(l):    cur_line = In.str()     if cur_line == "add":        x+=stck[-1]    elif cur_line == "end":        stck.pop()    else:        forlp = int(cur_line[4::])        stck.append((stck[-1]*forlp) % mod)                    if x>border:        ok=False        break if ok:    Out.int(x)else:    Out.str("OVERFLOW!!!")  ###################################### if len(sys.argv)>2 and sys.argv[2]=="TIMEIT":    fin = (time.time()-startTimeProblem)*1000    print("{:.2f}".format(fin) + "ms")