# aadiupadhyayimport os.pathfrom math import gcd, floor, ceilfrom collections import *import sysmod = 1000000007INF = float('inf')def st(): return list(sys.stdin.readline().strip())def li(): return list(map(int, sys.stdin.readline().split()))def mp(): return map(int, sys.stdin.readline().split())def inp(): return int(sys.stdin.readline())def pr(n): return sys.stdout.write(str(n)+"\n")def prl(n): return sys.stdout.write(str(n)+" ")  if os.path.exists('input.txt'):    sys.stdin = open('input.txt', 'r')    sys.stdout = open('output.txt', 'w')  n = inp()l = li()ans = [1 for i in range(n)]for i in range(n-2, -1, -1):    if l[i]*2 >= l[i+1]:        ans[i] = max(ans[i], 1+ans[i+1])pr(max(ans))
