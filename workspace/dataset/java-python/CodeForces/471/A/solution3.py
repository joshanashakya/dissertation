a = list(map(int,input().split()))for i in range(6):	if a.count(a[i])>=4:		v = a[i]		breakelse:	print("Alien")	exit()for i in range(4):	a.remove(v)a.sort()if a[0]<a[1]:	print("Bear")elif a[0]==a[1]:	print("Elephant")else:	print("Alien")