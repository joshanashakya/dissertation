from sys import stdin, stdoutfrom math import floor, gcd, fabs, factorial, fmod, sqrt, inf, log, truncfrom collections import defaultdict as dd, dequefrom heapq import merge, heapify, heappop, heappush, nsmallestfrom bisect import bisect_left as bl, bisect_right as br, bisect        mod = pow(10, 9) + 7mod2 = 998244353        def inp(): return stdin.readline().strip()def iinp(): return int(inp())def out(var, end="\n"): stdout.write(str(var)+"\n")def outa(*var, end="\n"): stdout.write(' '.join(map(str, var)) + end)def lmp(): return list(mp())def mp(): return map(int, inp().split())def smp(): return map(str, inp().split())def l1d(n, val=0): return [val for i in range(n)]def l2d(n, m, val=0): return [l1d(m, val) for j in range(n)]def remadd(x, y): return 1 if x%y else 0def ceil(a,b): return (a+b-1)//b  def isprime(x):    if x<=1: return False    if x in (2, 3): return True    if x%2 == 0: return False    for i in range(3, int(sqrt(x))+1, 2):        if x%i == 0: return False    return True n = iinp()s = list(inp())ts = s.copy()ml = []for i in range(len(s)-1):    if s[i]=='B':        ml.append(i+1)        s[i] = 'W'        s[i+1] = 'B' if s[i+1]=='W' else 'W'if set(s)=={'W'}:    print(len(ml))    print(*ml)else:    ml = []    for i in range(len(ts)-1):        if ts[i]=='W':            ml.append(i+1)            ts[i] = 'B'            ts[i+1] = 'B' if ts[i+1]=='W' else 'W'    if set(ts)=={'B'}:        print(len(ml))        print(*ml)    else:        print(-1)