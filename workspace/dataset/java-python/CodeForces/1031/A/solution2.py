# MasterKali from sys import stdinfrom collections import Counterfrom math import sqrt, factorial, log10, log, floor, ceilfrom itertools import permutations, combinations, combinations_with_replacement input = stdin.readlinedef li(): return list(map(int, input().split()))def lis(): return list(map(str, input().split()))def mp(): return map(int, input().split())def inp(): return int(input())def inps(): return str(input().strip())def pr(n): return stdout.write(str(n)+"\n") INF = float('inf')  def solve():	w, h, k = mp()		res = 0	while (k > 0):		res += 2*w+2*h-4		w-=4		h-=4		k-=1 	print(res)   t = 1for i in range(t):		solve() 
