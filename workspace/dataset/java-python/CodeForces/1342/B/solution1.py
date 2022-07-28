n = int(input())for _ in range(n):	a = input()	b = len(set(a))	if b==1:print(a)	else:		if a[0]=="0":print("01"*len(a))		else:print("10"*len(a))
