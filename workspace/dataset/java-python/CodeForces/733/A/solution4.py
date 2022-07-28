a=input()b=list(a)v = ['A', 'E', 'I', 'O', 'U', 'Y']m = 0last = -1for i in range(len(b)):	if b[i] in v: 		m = max(m, i - last)		last = iprint (max(m, len(b) - last))
