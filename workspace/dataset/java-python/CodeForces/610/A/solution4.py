n = int(input())if n&1 == 1:	print(0)elif n&3 == 0:	print((n>>2)-1)else:	print(n>>2)
