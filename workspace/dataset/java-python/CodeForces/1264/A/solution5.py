from sys import stdininput = stdin.readline for _ in range(int(input())):	n = int(input())	p = list(map(int,input().split()))	l,cou,x = p[0],1,[]	for i in range(1,n//2+1):		if l != p[i]:			l = p[i]			x.append(cou)			cou = 0		cou += 1	if len(x) < 3:		print(0,0,0)	else:		a,b,c,fl = x[0],0,0,0		for j in range(1,len(x)):			if not fl:			    b += x[j]			else:				c += x[j]			if b > a:				fl = 1		if a < b and a < c:		    print(a,b,c)		else:			print(0,0,0)