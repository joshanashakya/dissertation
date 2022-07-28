t=int(input())for i in range(t):	s=input()	l=s.split()	x=int(l[0])	y=int(l[1])	if x>=4 or x>=y or(x==2 and y==3):		print('YES')	else:		print('NO')
