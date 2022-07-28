import sys, functools, collections, bisect, math,
    heapqinput = sys.stdin.readline  # print = sys.stdout.writesys.setrecursionlimit(300000)mod = 998244353 t = int(input())for _ in range(t):    n = int(input())    arr = list(map(int,input().strip().split()))    s = sum(arr)    x = math.ceil(s/(n-1))    x = max(x,max(arr))    ans = ((x*(n-1))-s)    print(ans)
