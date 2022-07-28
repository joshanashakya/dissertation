n=int(input())l=[2]cs=2for i in range(2,n+1):	xs=i*(i+1)	ys=xs*xs	ax=ys-cs	ax=ax//i	cs=xs	l.append(ax) for i in range(len(l)):	print(l[i])
