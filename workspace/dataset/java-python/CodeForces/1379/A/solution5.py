########################################################################################################################   Author:     BlackFyre#   Language:   PyPy 3.7####################################################################################################################### from sys import stdin, stdout, setrecursionlimitfrom math import floor, gcd, fabs, factorial, fmod, sqrt, inf, log, log2from random import seed, randintfrom datetime import datetimefrom collections import defaultdict as dd, dequefrom heapq import merge, heapify, heappop, heappush, nsmallestfrom bisect import bisect_left as bl, bisect_right as br, bisectfrom collections import defaultdict as ddmod = pow(10, 9) + 7mod2 = 998244353# setrecursionlimit(3000) def inp(): return stdin.readline().strip()def iinp(): return int(inp())def out(var, end="\n"): stdout.write(str(var) + "\n")def outa(*var, end="\n"): stdout.write(' '.join(map(str, var)) + end)def lmp(): return list(mp())def mp(): return map(int, inp().split())def smp(): return map(str, inp().split())def l1d(n, val=0): return [val for i in range(n)]def l2d(n, m, val=0): return [l1d(m, val) for j in range(n)]def remadd(x, y): return 1 if x % y else 0def ceil(a, b): return (a + b - 1) // bdef def_value(): return 0def def_inf(): return inf def cnt(s,x):    c = 0    for i in range(n-6):        if s[i:i+7]==x:            c+=1    return c for _ in range(iinp()):    n = iinp()    s = inp()    x = "abacaba"    c = cnt(s,x)    if c>1: print("NO")    elif c==1:        ans =""        for i in range(n):            if s[i]=='?': ans+="x"            else: ans+=s[i]        print("YES")        print(ans)    else:        ans = ""        flg = False        for i in range(n-6):            ans = ""            f = True            for j in range(7):                if s[i+j]!=x[j] and s[i+j]!='?':                    f = False                    break            if f:                 for j in range(i):                    if s[j]=='?': ans+="x"                    else: ans+=s[j]                ans += x                for j in range(i+7,n):                    if s[j]=='?': ans+="x"                    else: ans+=s[j]                if cnt(ans,x)==1:                    flg = True                    break        if flg:            print("YES")            print(ans)        else: print("NO")
