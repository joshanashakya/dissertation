import sys, mathimport

heapq from collections import
    dequeinput = sys.stdin.readline   # inputdef ip(): return int(input())def sp(): return str(input().rstrip()) def mip(): return map(int, input().split())def msp(): return map(str, input().split()) def lmip(): return list(map(int, input().split()))def lmsp(): return list(map(str, input().split())) #gcd, lcmdef gcd(x, y):    while y:        x, y = y, x % y    return x def lcm(x, y):    return x * y // gcd(x, y) #primedef isprime(x):    if x==1: return False    for i in range(2, int(x**0.5)+1):        if x%i==0:            return False    return True # Union Find# p = {i:i for i in range(1, n+1)}def find(x):    if x == p[x]:        return x    q = find(p[x])    p[x] = q    return q def union(x, y):    global n    x = find(x)    y = find(y)     if x != y:        p[y] = x ############### Main! ############### tm = {1:1,2:5,3:-100,4:-100,5:2,6:-100,7:-100,8:8,9:-100,0:0}def mirror(tim):    time = [tim[0]//10, tim[0]%10, tim[1]//10, tim[1]%10]    qq = sum([tm[time[-1]], tm[time[-2]], tm[time[-3]], tm[time[-4]]])    if qq<0: return [-100,-100]    return [tm[time[-1]]*10 + tm[time[-2]], tm[time[-3]]*10 + tm[time[-4]]] t = ip()while t:    t -= 1    n, m = mip()    a = list(map(int, input().split(":")))    while True:        if sum(mirror(a)) != -200 and mirror(a)[0] < n and mirror(a)[1] < m: break        a[1]+=1        if a[1] == m:            a[1] = 0            a[0] += 1        if a[0] == n:            a[0] = 0    for i in range(2):        a[i] = str(a[i])        if len(a[i]) == 1:            a[i] = '0'+a[i]    print(a[0]+':'+a[1])  ######## Priest W_NotFoundGD ########
