# MasterKali from sys import stdinfrom collections import Counter, defaultdict, dequefrom math import sqrt, factorial, log10, log, floor, ceilfrom itertools import permutations, combinations, combinations_with_replacement, product input = stdin.readlinedef li(): return list(map(int, input().split()))def lis(): return list(map(str, input().split()))def mp(): return map(int, input().split())def inp(): return int(input())def inps(): return str(input().strip())def pr(n): return stdout.write(str(n)+"\n") def primes(pmax):	D = {}	q = 2	while q <= pmax:		if q not in D:			yield q			D[q*q] = [q]		else:			for p in D[q]:				D.setdefault(p+q, []).append(p)			del D[q]		q+=1 def gcd(i, j):	while j > 0:		i, j = j, i%j	return i  INF = float('inf') def check(i, n):	return 0<=i<n def isValid(r, c, a):	return a[r][c] == '.' def solve():	n = inp()	a = []	for i in range(n):		x = list(inps())		a.append(x)		for i in range(n):		for j in range(n):			if a[i][j] == '.':				if check(i+2, n) and check(j+1, n) and check(j-1, n):					if isValid(i+2, j, a) and isValid(i+1, j, a)\					and isValid(i+1, j-1, a) and isValid(i+1, j+1, a):							a[i+1][j] = '#'							a[i+2][j] = '#'							a[i+1][j-1] = '#'							a[i+1][j+1] = '#'					else: return "NO"				else: return "NO"	return "YES"			   t = 1for i in range(t):		print(solve())