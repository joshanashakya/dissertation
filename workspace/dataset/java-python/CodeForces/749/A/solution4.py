n = int(input())if n % 2 == 0:	print(n // 2)	print('2 ' * (n // 2), sep = ' ')else:	print((n - 3) // 2 + 1)	print('3', '2 ' * ((n - 3) // 2), sep = ' ')
