from sys import stdin,stdoutstdin.readlinedef mp(): return list(map(int, stdin.readline().strip().split()))def it():return int(stdin.readline().strip())from collections import defaultdict as dd,Counter as C,dequefrom math import ceil,gcd def factors(n):	s=set()	i=2	while i*i <= n:		if n%i==0:			s.add(i)			s.add(n//i)		i+=1	return sorted(list(s)) for _ in range(it()):	n = it()	x = factors(n)	# print(x)	if x:		if x[-1] + x[-1] == n:			print(x[-1],x[-1])		else:			print(x[-1],n-x[-1])	else:		print(1,n-1) 