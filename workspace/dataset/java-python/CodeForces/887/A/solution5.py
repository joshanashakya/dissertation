n=input()if len(n)==n.count('0'):	print('NO')else:	while n[0] == "0":		n = n[1:]	if n.count('0')>=6 and n[0]=='1':		print('YES')	else:		print('NO')
