from sys import stdin,stdoutstdin.readlinedef mp(): return list(map(int, stdin.readline().strip().split()))def it():return int(stdin.readline().strip())from collections import defaultdict as dd,Counter as C,dequefrom math import ceil,gcd  # R->S->Pfor _ in range(it()):	s = list(input())	r,sc,p = 0,0,0	for i in s:		if i == 'R':			r+=1		elif i == 'S':			sc+=1		else:			p+=1	if r == max(r,sc,p):		print('P'*len(s))	elif sc == max(r,sc,p):		print('R'*len(s))	else:		print('S'*len(s)) 
