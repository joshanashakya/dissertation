import sysfrom

functools
import lru_cache, cmp_to_keyfrom

heapq
import merge, heapify, heappop, heappushfrom

math
import * from collections
import defaultdict as dd, deque, Counter as Cfrom

itertools
import combinations as comb, permutations as permfrom

bisect
import bisect_left as bl, bisect_right as br, bisect, insortfrom

time
import perf_counterfrom

fractions
import Fractionimport

copyfrom
copy
import deepcopyimport

timestarttime = time.time()
mod = int(pow(10, 9) + 7)
mod2 = 998244353 

def data(): return sys.stdin.readline().strip()


def out(*var, end="\n"): sys.stdout.write(' '.join(map(str, var)) + end)


def L(): return list(sp())


def sl(): return list(ssp())


def sp(): return map(int, data().split())


def ssp(): return map(str, data().split())


def l1d(n, val=0): return [val for i in range(n)]


def l2d(n, m, val=0): return [l1d(n, val) for j in range(m)]


try:  # sys.setrecursionlimit(int(pow(10,6)))    sys.stdin = open("input.txt", "r")    # sys.stdout = open("../output.txt", "w")except:    passdef pmat(A):    for ele in A:        print(*ele,end="\n")  n=L()[0]A=[]for i in range(n):    x,y=sl()    if y=="rat":        A.append([0,i,x])    elif y=="woman" or y=="child":        A.append([1,i,x])    elif y=="man":        A.append([2,i,x])    else:        A.append([3,i,x])A.sort()for ele in A:    print(ele[-1])                     endtime = time.time()# print(f"Runtime of the program is {endtime - starttime}")
