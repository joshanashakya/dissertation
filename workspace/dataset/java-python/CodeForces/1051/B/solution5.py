l, r = list(map(int, input().split())) a = []i = lwhile i <= r-1:	a.append([i, i+1])	i += 2 if a:	print('YES')	for i in a:		print(f'{i[0]} {i[1]}')else:	print('NO')
