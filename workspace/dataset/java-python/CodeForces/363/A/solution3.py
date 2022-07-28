for i in input()[::-1]:	if int(i) - 5 < 0:		print('O-|',int(i)*'O','-','O'*(4 - int(i)), sep='')	else:		print('-O|', (int(i) - 5)*'O','-','O'*(4 - (int(i) - 5)), sep='') 
