from sys import stdin,stdoutstdin.readlinedef mp(): return list(map(int, stdin.readline().strip().split()))def it():return int(stdin.readline().strip())from collections import defaultdict as dd,Counter as C,dequefrom math import ceil n = it()l = mp()ans =1flag= 0for i in range(n):	if l[i] == 1 and flag == 0:		ind = i		flag = 1	elif l[i] == 1 and flag:		ans*=(i-ind)		ind = iif not flag:	print(0)else:	print(ans)