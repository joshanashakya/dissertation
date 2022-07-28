c, s = list(), input().split('"')for i in range(len(s)):	if i&1:		c.append(s[i])	else:		c.extend(s[i].split())print(*['<'+e+'>' for e in c],sep='\n')
