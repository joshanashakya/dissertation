import sys,os,iofrom sys import stdinfrom math import log, gcd, ceilfrom collections import defaultdict, deque, Counterfrom heapq import heappush, heappopfrom bisect import bisect_left , bisect_rightimport math   alphabets = list('abcdefghijklmnopqrstuvwxyz')  def isPrime(x):    for i in range(2,x):        if i*i>x:            break        if (x%i==0):            return False    return Truedef ncr(n, r, p):      num = den = 1    for i in range(r):        num = (num * (n - i)) % p        den = (den * (i + 1)) % p    return (num * pow(den,                      p - 2, p)) % pdef primeFactors(n):     l = []    while n % 2 == 0:         l.append(2)        n = n / 2    for i in range(3,int(math.sqrt(n))+1,2):         while n % i== 0:             l.append(int(i))            n = n / i     if n > 2:         l.append(n)    return list(set(l))def power(x, y, p) : 	res = 1	x = x % p 	if (x == 0) : 		return 0	while (y > 0) : 		if ((y & 1) == 1) : 			res = (res * x) % p 		y = y >> 1	 # y = y/2 		x = (x * x) % p 			return res def SieveOfEratosthenes(n):    prime = [True for i in range(n+1)]    p = 2    while (p * p <= n):        if (prime[p] == True):            for i in range(p * p, n+1, p):                prime[i] = False        p += 1    return primedef countdig(n):    c = 0    while (n > 0):        n //= 10        c += 1    return cdef si():    return input()def prefix_sum(arr):    r = [0] * (len(arr)+1)    for i, el in enumerate(arr):        r[i+1] = r[i] + el    return rdef divideCeil(n,x):    if (n%x==0):        return n//x    return n//x+1def ii():    return int(input())def li():    return list(map(int,input().split()))def ws(s): sys.stdout.write(s + '\n')def wi(n): sys.stdout.write(str(n) + '\n')def wia(a): sys.stdout.write(' '.join([str(x) for x in a]) + '\n')def power_set(L):     cardinality=len(L)    n=2 ** cardinality    powerset = []        for i in range(n):        a=bin(i)[2:]        subset=[]        for j in range(len(a)):            if a[-j-1]=='1':                subset.append(L[j])        powerset.append(subset)    powerset_orderred=[]    for k in range(cardinality+1):        for w in powerset:            if len(w)==k:                powerset_orderred.append(w)            return powerset_orderreddef fastPlrintNextLines(a):    # 12    # 3    # 1    #like this    #a is list of strings    print('\n'.join(map(str,a))) def sortByFirstAndSecond(A):    A = sorted(A,key = lambda x:x[0])    A = sorted(A,key = lambda x:x[1])    return list(A) #__________________________TEMPLATE__________________OVER_______________________________________________________  if(os.path.exists('input.txt')):    sys.stdin = open("input.txt","r") ; sys.stdout = open("output.txt","w") # else:#     input = io.BytesIO(os.read(0, os.fstat(0).st_size)).readline  def solve():    n,k = li()    l = [['.' for i in range(n)] for j in range(4)]    print("YES")    if k%2==0:        for i in range(1,k//2+1):            l[1][i]='#'            l[2][i]='#'    else:        if (k>n-2):                        for i in range(1,n-1):                l[1][i]='#'            k-=(n-2)        if k>0:            i = n//2            if k%2==1:                l[2][i]='#'                k-=1            i = n//2+1            for i in range(n//2+1,n//2+1+k//2):                l[2][i]='#'            k = k//2            for i in range(n//2-1,-1,-1):                if k==0:                    break                k-=1                l[2][i]='#'    for i in l:        print(''.join(i))  t = 1# t = int(input())for _ in range(t):    solve()    
