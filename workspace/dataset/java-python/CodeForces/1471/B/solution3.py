# ------------------Important Modules------------------#from sys import stdin,stdoutfrom bisect import bisect_left as blfrom bisect import bisect_right as brfrom heapq import *from random import *input=stdin.readlineprin=stdout.writefrom random import samplefrom collections import Counter,dequefrom fractions import *from math import sqrt,ceil,log2,gcd#dist=[0]*(n+1)mod=10**9+7"""class DisjSet:     def __init__(self, n):                 self.rank = [1] * n         self.parent = [i for i in range(n)]     def find(self, x):         if (self.parent[x] != x):                                        self.parent[x] = self.find(self.parent[x])                                   return self.parent[x]             def union(self, x, y):                            xset = self.find(x)         yset = self.find(y)           if xset == yset:             return          if self.rank[xset] < self.rank[yset]:             self.parent[xset] = yset           elif self.rank[xset] > self.rank[yset]:             self.parent[yset] = xset           else:             self.parent[yset] = xset             self.rank[xset] = self.rank[xset] + 1   """ def f(arr,i,j,d,dist):    if i==j:        return     nn=max(arr[i:j])    for tl in range(i,j):        if arr[tl]==nn:            dist[tl]=d            #print(tl,dist[tl])            f(arr,i,tl,d+1,dist)            f(arr,tl+1,j,d+1,dist)    #return dist                    def ps(n):    cp=0;lk=0;arr={}    #print(n)    #cc=0;    while n%2==0:        n=n//2        #arr.append(n);arr.append(2**(lk+1))        lk+=1                        for ps in range(3,ceil(sqrt(n))+1,2):        lk=0        cc=0        while n%ps==0:            n=n//ps            #cc=1            #arr.append(n);arr.append(ps**(lk+1))            lk+=1                                    if n!=1:        #lk+=1        #arr[n]=1        #ans*=n;        lk+=1        return False        #return arr        #print(arr)        return True  #count=0#dp=[[0 for i in range(m)] for j in range(n)]#[int(x) for x in input().strip().split()]def gcd(x, y):           while(y):         x, y = y, x % y           return x           # Driver Code         def factorials(n,r):    #This calculates ncr mod 10**9+7    slr=n;dpr=r    qlr=1;qs=1    mod=10**9+7        for ip in range(n-r+1,n+1):        qlr=(qlr*ip)%mod    for ij in range(1,r+1):        qs=(qs*ij)%mod    #print(qlr,qs)    ans=(qlr*modInverse(qs))%mod    return ans                 def modInverse(b):    qr=10**9+7    return pow(b, qr - 2,qr) #===============================================================================================### START ITERATE RECURSION ###from types import GeneratorTypedef iterative(f, stack=[]):  def wrapped_func(*args, **kwargs):    if stack: return f(*args, **kwargs)    to = f(*args, **kwargs)    while True:      if type(to) is GeneratorType:        stack.append(to)        to = next(to)        continue      stack.pop()      if not stack: break      to = stack[-1].send(to)    return to  return wrapped_funcdef power(arr):  listrep = arr  subsets = []  for i in range(2**len(listrep)):    subset = []    for k in range(len(listrep)):                  if i & 1<<k:        subset.append(listrep[k])    subsets.append(subset)          return subsetsdef pda(n) :    list = []     for i in range(1, int(sqrt(n) + 1)) :         if (n % i == 0) :            if (n // i == i) :                list.append(i)            else :                list.append(n//i);list.append(i)                     # The list will be printed in reverse        return listdef dis(xa,ya,xb,yb):    return sqrt((xa-xb)**2+(ya-yb)**2)#### END ITERATE RECURSION #### #===============================================================================================#----------Input functions--------------------#def ii():    return int(input())def ilist():    return [int(x) for x in input().strip().split()]def islist():    return list(map(str,input().split().rstrip()))def inp():    return input().strip()def google(test,ans):    return "Case #"+str(test)+": "+str(ans);def overlap(x1,y1,x2,y2):    if x2>y1:        return y1-x2    if y1>y2:        return y2-x2    return y1-x2;  ###-------------------------CODE STARTS HERE--------------------------------###########def pal(s):    k=len(s)    n=len(s)//2    for i in range(n):        if s[i]==s[k-1-i]:            continue        else:            return 0    return 1     #########################################################################################t=int(input())#t=1for p in range(t):    n,x=ilist()    arr=ilist()    count=[0]*n        sums=0    for i in range(n):        kk=arr[i]        while kk%x==0:            kk=kk//x            count[i]+=1    ss=min(count)    term=0    for jl in range(n):        if count[jl]==ss:            term=jl            break    for tt in range(n):        ran=ss        count=0        if tt<term:            ran+=1        kk=arr[tt]        while count<=ran:            sums+=kk*x**count            count+=1            kk=kk//x            #print(sums)    print(sums)                                        #print(sums)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
