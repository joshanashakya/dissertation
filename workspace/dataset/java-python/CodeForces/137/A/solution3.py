import sysfrom math import sqrt, log, log2, ceil, log10, gcd, floor, pow, sin, cos, tan, pi, inf, factorialfrom copy import copy, deepcopyfrom sys import exit, stdin, stdoutfrom collections import Counter, defaultdict, dequefrom itertools import permutationsimport heapqfrom bisect import bisect_left from bisect import bisect_right# sys.setrecursionlimit(100000000)mod = 1000000007iinp = lambda: int(sys.stdin.readline())inp = lambda: sys.stdin.readline().strip()strl = lambda: list(inp().strip().split(" "))intl = lambda: list(map(int, inp().split(" ")))mint = lambda: map(int, inp().split())flol = lambda: list(map(float, inp().split(" ")))flush = lambda: stdout.flush()# ========================================================Functions====================================================def solve():    s=inp()    s1=[s[0]]    c=0    for i in range(1,len(s)):        if len(s1)==0:            s1.append(s[i])        else:            if s1[-1]!=s[i]:                c+=1                # print("#2")                s1.clear()                s1.append(s[i])            else:                s1.append(s[i])                if len(s1)==5:                    # print("#3")                    c+=1                    s1.clear()    if s1:        c+=1    print(c)    return           # ========================================================Main Code=====================================================# t=iinp()t=1for _ in range(t):        solve()
