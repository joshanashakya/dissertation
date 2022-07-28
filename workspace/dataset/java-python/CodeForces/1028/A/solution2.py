n, m = map(int, input().split())v = Falsefor i in range(n):	row = input()	if not v and 'B' in row:		s, e = row.find('B'), row.rfind('B')		c = (s+e)//2		r = i + c - s		v = True    print(r+1, c+1)
