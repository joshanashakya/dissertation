def so(l):	l=l.replace("11","1")	return ln,x,y= map(int,input().split())l=input()if("0" not in l):	print(0)else:	while("11"in l):		l=so(l)	l=l.split("1")	if(l[0]==""):		l.remove("")	if(l[-1]==""):		l.pop() 	a=len(l)-1	ans1 = (a+1)*y 	ans2 = a*x +y	print(min(ans1,ans2))
