n,q = map(int,input().split())from collections import defaultdict def DFS(d,s,t):	if len(s) == t:		# print(s)		return 1	c = 0	for i in d[s[0]]:		s1 = i + s[1:] 		# print(s1)		c = c + DFS(d,s1,t)	return cd  = defaultdict(list)for i in range(q):	s1,s2 = input().split()	d[s2].append(s1)  print(DFS(d,"a",n))
