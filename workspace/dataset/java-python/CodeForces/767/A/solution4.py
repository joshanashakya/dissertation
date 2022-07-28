n=int(input())l=[int(x) for x in input().split()]d=set()for i in l:	d.add(i)	while n in d:		print(n, end=' ')		n-=1	print()	
