import sys, functools, collections, bisect, math,
    heapqinput = sys.stdin.readline  # print = sys.stdout.writesys.setrecursionlimit(300000)mod = 998244353 t = int(input())for _ in range(t):    n,w = map(int,input().strip().split())    arr = list(map(int,input().strip().split()))    curr = math.ceil(w/2)    a = []    for i in range(n):        a.append((arr[i],i+1))    a.sort()    ind = bisect.bisect_left(a,(curr,0))    if ind < n and a[ind][0] <= w:        print(1)        print(a[ind][1])        continue        b = []    s = 0    for i in range(ind):        b.append(str(a[i][1]))        s += a[i][0]        if s >= curr:            print(len(b))            print(' '.join(b))            break    else:        print(-1)
