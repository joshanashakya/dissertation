import sys, functools, collections, bisect, math,
    heapqinput = sys.stdin.readline  # print = sys.stdout.writesys.setrecursionlimit(200000)mod = 10**9 + 7 t = int(input())for _ in range(t):    n,k = map(int,input().strip().split())    arr = list(map(int,input().strip().split()))    x = min(arr)    ans = 0    for i in arr:        ans += (k-i)//x    ans -= (k-x)//x    print(ans)
