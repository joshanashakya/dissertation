ll=lambda:map(int,input().split())t=lambda:int(input())ss=lambda:input()lx=lambda x:map(int,input().split(x))#from math import log10 ,log2,ceil,factorial as fac,gcd#from itertools import combinations_with_replacement as cs #from functools import reduce#from bisect import bisect_right as br,bisect_left as bl#from collections import Counter   #for _ in range(t()):def f():    s=list(ss())    try:        x=s.index('0')        p=""        for i in range(len(s)):            if i ==x:                continue            p+=s[i]        print(p)    except:        print(''.join(s[:len(s)-1]))                 '''     '''    f()
