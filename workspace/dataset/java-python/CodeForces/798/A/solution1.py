s = input()s1 = s[:len(s)//2]if len(s)%2 == 0:	s2 = s[len(s)//2:]else:	s2 = s[len(s)//2 + 1:] s2 = s2[-1::-1]#print(f'{s1} {s2}')c = 0for i in range(len(s1)):	if s1[i] != s2[i]:		c += 1	if c > 1:		break if c == 1:	print('YES')else:	if c == 0:		if len(s)%2 == 0:			print('NO')		else:			print('YES')	else:		print('NO')
