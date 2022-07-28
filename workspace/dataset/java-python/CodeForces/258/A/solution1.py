def solution():	st=input()	n=len(st)		for i in range(n):		if st[i]=='0':			print(st[:i]+st[i+1:])			return	print(st[:-1])  	return		   solution()
