s = input()k = int(input())if len(s)%k!=0:	print("NO")else:	i,n,z = 0,len(s)//k,len(s)//k	while z <= len(s):		x = s[i:z]		if x != x[::-1]:			print("NO")			break		i+=n		z+=n	else:		print("YES")
