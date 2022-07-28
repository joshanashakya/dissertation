n = int(input())d = dict(zip(range(1,n+1), map(int, input().split())))ans = [0]*nfor i in d:	node = i	s = set()	while node not in s:		s.add(node)		node = d[node]	ans[i-1] = node print(*ans) 
