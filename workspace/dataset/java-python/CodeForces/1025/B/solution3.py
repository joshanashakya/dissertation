from collections import defaultdict, deque, Counterfrom sys import stdin, stdoutfrom heapq import heappush, heappopimport mathimport ioimport osimport mathimport bisect # input = io.BytesIO(os.read(0, os.fstat(0).st_size)).readline# python3 15.py<in>opdef primeFactors(n):    while n % 2 == 0:        return 2    for i in range(3, int(math.sqrt(n))+1, 2):        while n % i == 0:            return i    if n > 2:        return n    return -1 def gcd(a,b):    if (b == 0):         return a    return gcd(b, a%b) input = io.BytesIO(os.read(0, os.fstat(0).st_size)).readlinen = int(input())dd = []d = defaultdict(lambda:0)temp = 0for _ in range(n):    a, b = map(int, input().split())    dd.append([a, b])    a = a*b    temp = gcd(a, temp)for i in range(n):    if(math.gcd(temp, dd[i][1]) != 1):        temp = math.gcd(dd[i][1], temp)    elif(math.gcd(temp, dd[i][0]) != 1):        temp = math.gcd(dd[i][0], temp)    else:        print(-1)        exit()print(primeFactors(temp))        
