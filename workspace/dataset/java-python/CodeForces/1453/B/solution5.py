import math, sys, bisect, heapq, osfrom

collections
import defaultdict, Counter, dequefrom

itertools
import groupby, accumulatefrom

functools
import \
    lru_cache  # sys.setrecursionlimit(200000000)int1 = lambda x: int(x) - 1def input(): return sys.stdin.readline().rstrip('\r\n')#input = iter(sys.stdin.buffer.read().decode().splitlines()).__next__aj = lambda: list(map(int, input().split()))def list3d(a, b, c, d): return [[[d] * c for j in range(b)] for i in range(a)]#MOD = 1000000000 + 7def Y(c):  print(["NO","YES"][c])def y(c):  print(["no","yes"][c])def Yy(c):  print(["No","Yes"][c]) def solve():	for _ in range(int(input())):		n,= aj()		A = aj()		if len(set(A)) == 1:			print(0)		else:			ans = sum([abs(i-j) for i,j in zip(A,A[1:])])			max_chng = max(abs(A[1] - A[0]),abs(A[-2] - A[-1]))			for i in range(1,n-1):				max_chng = max(max_chng,abs(A[i] - A[i-1]) + abs(A[i+1] - A[i]) - abs(A[i-1] - A[i+1]))			print(ans - max_chng)		    try:	#os.system("online_judge.py")	sys.stdin = open('input.txt', 'r') 	sys.stdout = open('output.txt', 'w')except:	pass solve()
