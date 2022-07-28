def f():	n = int(input())	a = [1,2,3,4]	print("YES")	for i in range(n):		x = input().split()		x = [int(j)%2 for j in x]		print(a[x[2]*2+x[3]])f()
