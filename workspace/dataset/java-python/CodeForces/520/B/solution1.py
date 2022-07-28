def f(x,y):	if x>=y:		return (x-y)	else:		if y%2!=0:			return (f(x,y+1)+1)		else:			return (f(x,y/2)+1)						a,b=(input("").split())x=int(a)y=int(b)print(int(f(x,y)))
