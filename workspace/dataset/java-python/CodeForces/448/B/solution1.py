# from math import *# from itertools import combinationsfrom sys import stdininput = stdin.readline def issub(a, b):    i = 0    for ch in a:        if i < len(b) and ch == b[i]:            i += 1    return i == len(b) s, t = input().strip(), input().strip()if issub(s, t):    print("automaton")elif sorted(s) == sorted(t):    print("array")elif issub(sorted(s), sorted(t)):    print("both")else:    print("need tree")
