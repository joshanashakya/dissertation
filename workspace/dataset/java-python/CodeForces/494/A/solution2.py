s = input()n = len(s)p, curr = n - 1, 0while s[p] != '#':	if s[p] == ')': curr += 1	else: curr -= 1	p -= 1	if curr < 0:		print(-1)		exit()cnt_hash, curr = s.count('#'), 0for i in range(p):	if s[i] == '(': curr += 1	else: curr -= 1	if curr < 0:		print(-1)		exit()res = s.count('(') - s.count(')') - (cnt_hash - 1)if res <= 0:	print(-1)	exit()cnt_hash -= 1print('\n'.join('1'*cnt_hash))print(s.count('(') - s.count(')') - cnt_hash)
