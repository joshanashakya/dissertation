n = int(input())ct = 0while n>9:	m = str(n)	n = 0	for x in m:		n+=int(x)	# print(n)	ct+=1print(ct)
