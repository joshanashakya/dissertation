#------------------Important Modules------------------# from sys import stdin,stdoutfrom bisect import bisect_left as blfrom bisect import bisect_right as brfrom heapq import *input=stdin.readlineprin=stdout.writefrom random import sample from collections import Counter,dequefrom math import sqrt,ceil,log2,gcd#dist=[0]*(n+1)mod=10**9+7class DisjSet:     def __init__(self, n):         # Constructor to create and         # initialize sets of n items         self.rank = [1] * n         self.parent = [i for i in range(n)]         # Finds set of given item x     def find(self, x):                   # Finds the representative of the set         # that x is an element of         if (self.parent[x] != x):                           # if x is not the parent of itself             # Then x is not the representative of             # its set,             self.parent[x] = self.find(self.parent[x])                           # so we recursively call Find on its parent             # and move i's node directly under the             # representative of this set           return self.parent[x]         # Do union of two sets represented     # by x and y.     def union(self, x, y):                   # Find current sets of x and y         xset = self.find(x)         yset = self.find(y)           # If they are already in same set         if xset == yset:             return          # Put smaller ranked item under         # bigger ranked item if ranks are         # different         if self.rank[xset] < self.rank[yset]:             self.parent[xset] = yset           elif self.rank[xset] > self.rank[yset]:             self.parent[yset] = xset           # If ranks are same, then move y under         # x (doesn't matter which one goes where)         # and increment rank of x's tree         else:             self.parent[yset] = xset             self.rank[xset] = self.rank[xset] + 1  # Driver code    def f(arr,i,j,d,dist):    if i==j:        return     nn=max(arr[i:j])    for tl in range(i,j):        if arr[tl]==nn:            dist[tl]=d            #print(tl,dist[tl])            f(arr,i,tl,d+1,dist)            f(arr,tl+1,j,d+1,dist)    #return dist                    def ps(n):    cp=0;lk=0;arr=[];countprev=0;    while n%2==0:        n=n//2        lk+=1                for ps in range(3,ceil(sqrt(n))+1,2):        lk=0        while n%ps==0:            n=n//ps            lk+=1                            if n!=1:        lk+=1        return [lk,"NO"]            return [lk,"YES"]  #count=0#dp=[[0 for i in range(m)] for j in range(n)]#[int(x) for x in input().strip().split()]def gcd(x, y):           while(y):         x, y = y, x % y           return x           # Driver Code         def factorials(n,r):    #This calculates ncr mod 10**9+7    slr=n;dpr=r    qlr=1;qs=1    mod=10**9+7        for ip in range(n-r+1,n+1):        qlr=(qlr*ip)%mod    for ij in range(1,r+1):        qs=(qs*ij)%mod    #print(qlr,qs)    ans=(qlr*modInverse(qs))%mod    return ans                 def modInverse(b):    qr=10**9+7    return pow(b, qr - 2,qr) #===============================================================================================### START ITERATE RECURSION ###from types import GeneratorTypedef iterative(f, stack=[]):  def wrapped_func(*args, **kwargs):    if stack: return f(*args, **kwargs)    to = f(*args, **kwargs)    while True:      if type(to) is GeneratorType:        stack.append(to)        to = next(to)        continue      stack.pop()      if not stack: break      to = stack[-1].send(to)    return to  return wrapped_funcdef power(arr):  listrep = arr  subsets = []  for i in range(2**len(listrep)):    subset = []    for k in range(len(listrep)):                  if i & 1<<k:        subset.append(listrep[k])    subsets.append(subset)          return subsetsdef dis(xa,ya,xb,yb):    return sqrt((xa-xb)**2+(ya-yb)**2)#### END ITERATE RECURSION #### #===============================================================================================#----------Input functions--------------------#def ii():    return int(input())def ilist():    return [int(x) for x in input().strip().split()]def outstrlist(array:list)->str:    array=[str(x) for x in array]    return ' '.join(array);def islist():    return list(map(str,input().split().rstrip()))def outfast(arr:list)->str:    ss=''    for ip in arr:        ss+=str(ip)+' '    return prin(ss); ###-------------------------CODE STARTS HERE--------------------------------#####################################################################################################t=int(input())t=1for jj in range(t):    n=ii()    sums1=[0]*n    sums2=[0]*n    arr=ilist();    sum1=0;sum2=0    for i in range(n):        if i%2==0:            sum1+=arr[i]        else:            sum2+=arr[i]        sums1[i]=sum1;        sums2[i]=sum2;    cc=0    for i in range(n):        ab=sums1[n-1]-sums1[i];        bc=sums2[n-1]-sums2[i];        if i%2==0:                        if sums1[i]-arr[i]+bc==ab+sums2[i]:                cc+=1        else:            if sums2[i]-arr[i]+ab==sums1[i]+bc:                cc+=1    print(cc)                                                                                                                                                                                        