import math,sys,bisect,heapq,osfrom collections import defaultdict,Counter,dequefrom itertools import groupby,accumulatefrom functools import lru_cache#sys.setrecursionlimit(200000000)int1 = lambda x: int(x) - 1def input(): return sys.stdin.readline().rstrip('\r\n')#input = iter(sys.stdin.buffer.read().decode().splitlines()).__next__aj = lambda: list(map(int, input().split()))def list3d(a, b, c, d): return [[[d] * c for j in range(b)] for i in range(a)]#MOD = 1000000000 + 7def Y(c):  print(["NO","YES"][c])def y(c):  print(["no","yes"][c])def Yy(c):  print(["No","Yes"][c]) def primeF(n): 	A =set()	while n % 2 == 0: 		A.add(2) 		n = n // 2	for i in range(3,int(math.sqrt(n))+1,2): 		while n % i== 0: 			A.add(i) 			n = n // i 	if n > 2: 		A.add(n) 	return list(A) def solve():	n, = aj()	if n<=2:		print(n)	else:		A = primeF(n)		# print(A)		if A[0] == n:			print(n)		elif len(A) > 1:			print(1)		else:			print(A[0])     try:	#os.system("online_judge.py")	sys.stdin = open('input.txt', 'r') 	sys.stdout = open('output.txt', 'w')except:	pass solve()