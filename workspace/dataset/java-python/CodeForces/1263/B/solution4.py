#------------------Important Modules------------------# from sys import stdin,stdoutfrom bisect import bisect_left as blfrom bisect import bisect_right as brfrom heapq import *input=stdin.readlineprin=stdout.writefrom random import sample from collections import Counter,dequefrom math import sqrt,ceil,log2,gcd#dist=[0]*(n+1)mod=10**9+7class DisjSet:     def __init__(self, n):         # Constructor to create and         # initialize sets of n items         self.rank = [1] * n         self.parent = [i for i in range(n)]         # Finds set of given item x     def find(self, x):                   # Finds the representative of the set         # that x is an element of         if (self.parent[x] != x):                           # if x is not the parent of itself             # Then x is not the representative of             # its set,             self.parent[x] = self.find(self.parent[x])                           # so we recursively call Find on its parent             # and move i's node directly under the             # representative of this set           return self.parent[x]         # Do union of two sets represented     # by x and y.     def union(self, x, y):                   # Find current sets of x and y         xset = self.find(x)         yset = self.find(y)           # If they are already in same set         if xset == yset:             return          # Put smaller ranked item under         # bigger ranked item if ranks are         # different         if self.rank[xset] < self.rank[yset]:             self.parent[xset] = yset           elif self.rank[xset] > self.rank[yset]:             self.parent[yset] = xset           # If ranks are same, then move y under         # x (doesn't matter which one goes where)         # and increment rank of x's tree         else:             self.parent[yset] = xset             self.rank[xset] = self.rank[xset] + 1  # Driver code    def f(arr,i,j,d,dist):    if i==j:        return     nn=max(arr[i:j])    for tl in range(i,j):        if arr[tl]==nn:            dist[tl]=d            #print(tl,dist[tl])            f(arr,i,tl,d+1,dist)            f(arr,tl+1,j,d+1,dist)    #return dist                    def ps(n):    cp=0;lk=0;arr={}    #print(n)    while n%2==0:        n=n//2        #arr.append(n);arr.append(2**(lk+1))        lk+=1    arr[2]=lk;                for ps in range(3,ceil(sqrt(n))+1,2):        lk=0        while n%ps==0:            n=n//ps            arr.append(n);arr.append(ps**(lk+1))            lk+=1        arr[ps]=lk;                            if n!=1:        lk+=1        arr[n]=lk        #return arr        #print(arr)    return arr  #count=0#dp=[[0 for i in range(m)] for j in range(n)]#[int(x) for x in input().strip().split()]def gcd(x, y):           while(y):         x, y = y, x % y           return x           # Driver Code         def factorials(n,r):    #This calculates ncr mod 10**9+7    slr=n;dpr=r    qlr=1;qs=1    mod=10**9+7        for ip in range(n-r+1,n+1):        qlr=(qlr*ip)%mod    for ij in range(1,r+1):        qs=(qs*ij)%mod    #print(qlr,qs)    ans=(qlr*modInverse(qs))%mod    return ans                 def modInverse(b):    qr=10**9+7    return pow(b, qr - 2,qr) #===============================================================================================### START ITERATE RECURSION ###from types import GeneratorTypedef iterative(f, stack=[]):  def wrapped_func(*args, **kwargs):    if stack: return f(*args, **kwargs)    to = f(*args, **kwargs)    while True:      if type(to) is GeneratorType:        stack.append(to)        to = next(to)        continue      stack.pop()      if not stack: break      to = stack[-1].send(to)    return to  return wrapped_funcdef power(arr):  listrep = arr  subsets = []  for i in range(2**len(listrep)):    subset = []    for k in range(len(listrep)):                  if i & 1<<k:        subset.append(listrep[k])    subsets.append(subset)          return subsetsdef dis(xa,ya,xb,yb):    return sqrt((xa-xb)**2+(ya-yb)**2)#### END ITERATE RECURSION #### #===============================================================================================#----------Input functions--------------------#def ii():    return int(input())def ilist():    return [int(x) for x in input().strip().split()]def outstrlist(array:list)->str:    array=[str(x) for x in array]    return ' '.join(array);def islist():    return list(map(str,input().split().rstrip()))def outfast(arr:list)->str:    ss=''    for ip in arr:        ss+=str(ip)+' '    return prin(ss);def pda(n) :    list = []          # List to store half of the divisors    for i in range(1, int(sqrt(n) + 1)) :                 if (n % i == 0) :                         # Check if divisors are equal            if (n / i == i) :                #print (i, end =" ")                list.append(i)            else :                # Otherwise print both                #print (i, end =" ")                list.append(int(n / i));list.append(i)                     # The list will be printed in reverse        return list         ###-------------------------CODE STARTS HERE--------------------------------####################################################################################################t=int(input())#t=1for jj in range(t):    n=ii()    arr=[0]*n    dc={}    #index={}    bc=[0]*n    lens=0    #ssp=set(arr)    for i in range(n):        arr[i]=input().strip()    ssp=set(arr)    for i in range(n):        if arr[i] in dc:            #kk=len(dc[arr[i]])            ll=int(arr[i][3])            while arr[i][:3]+str(ll) in ssp:                ll=(ll+1)%10;            bc[i]=arr[i][:3]+str(ll);ssp.add(bc[i])            dc[arr[i]].append(i)                                    else:            dc[arr[i]]=[i];            bc[i]=arr[i];            #index[arr[i]]=0;    for aa in dc:        lens+=len(dc[aa])-1    print(lens)    for i in range(n):        print(bc[i])                                                                                                                                                                                                                                                                                                                  
