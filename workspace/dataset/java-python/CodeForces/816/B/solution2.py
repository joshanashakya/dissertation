#!/usr/bin/env pythonimport sysfrom collections import *  def solve():    n, k, q = li()    arr = [0]*2000010    maxm = -1*sys.maxsize    minm = sys.maxsize    for _ in range(n):        l, r = li()        arr[l] += 1        arr[r+1] -= 1    pref = [0]*2000010    # pref[0] = arr[0]    for i in range(1, 2000010):        arr[i] += arr[i-1]    for i in range(1, 2000010):        arr[i] = arr[i] >= k    for i in range(1, 2000010):        arr[i] += arr[i-1]    for _ in range(q):        a, b = li()        print(arr[b] - arr[a-1])  def main():    # T = inp()    T = 1    for _ in range(T):        solve()  def input(): return sys.stdin.readline().rstrip("\r\n")def st(): return list(sys.stdin.readline().strip())def li(): return list(map(int, sys.stdin.readline().split()))def mp(): return map(int, sys.stdin.readline().split())def inp(): return int(sys.stdin.readline())def pr(n): return sys.stdout.write(str(n)+"\n")def prl(n): return sys.stdout.write(str(n)+" ")  if __name__ == "__main__":    main()