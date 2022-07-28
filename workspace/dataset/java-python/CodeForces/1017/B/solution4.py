n = int(input())a = input()b = input()x = 0y = 0z = 0for i in range(n):	if(b[i] == '0'):		if(a[i] == '1'):			x+=1		else:			y+=1	else:		if(a[i] == '1'):			z+=1print(y * z + x * a.count('0'))
