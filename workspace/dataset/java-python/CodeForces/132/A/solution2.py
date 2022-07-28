s = input() e = 0for i in s:	a = ord(i)	b = format(a,'08b')	c = str(b)[::-1]	d = int(c, 2)	print ((e-d)%256)	e = d
