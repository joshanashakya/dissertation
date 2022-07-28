p = 10cnt = 0r = 1for c in input():	c = int(c)	if c + p == 9:		cnt += 1	else:		if cnt > 0 and cnt % 2 == 0:			r *= cnt//2 + 1		cnt = 0	p = cif cnt > 0 and cnt % 2 == 0:	r *= cnt//2 + 1print(r)
