import math as mtimport sys, stringfrom collections import Counter, defaultdictinput = sys.stdin.readline MOD = 1000000007PI = 3.14159265358979323 I = lambda : int(input())S = lambda : input()M = lambda : map(int, input().split())Ms = lambda : map(str, input().split()) ARR = lambda : list(map(int, input().split())) def solve():	n,m,k = M()	ar = ARR()	diff = [ar[i]-ar[i-1]+1 for i in range(1,n)]		if len(diff) == 0:		print(1)		return		diff.sort()	ans = 0	for i in range(n-k):		ans += diff[i]		ans += (n - 2*(n-k))	print(ans)  tc = 1# tc = I()for _ in range(tc):	solve()