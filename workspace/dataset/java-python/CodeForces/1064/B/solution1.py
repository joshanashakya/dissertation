n=int(input(""))l=[]for k in range(n):	b = int(input(""))	l.append(b)final=[]for i in l:	c=0	while i>0:		if i%2==1:			c=c+1		i=int(i/2)	final.append(c)for j in final:	print(2**j)
