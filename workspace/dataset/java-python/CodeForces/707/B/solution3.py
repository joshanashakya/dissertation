import sysinput =sys.stdin.readline x,y,z = map(int, input().split())dict1 = {}for _ in range(y):	a,b,c = map(int, input().split())	if a in dict1.keys():		dict1[a].append([b,c])	else:		dict1[a] = [[b,c]]	if b in dict1.keys():		dict1[b].append([a,c])	else:		dict1[b] = [[a,c]]ans  =1e18if z:	*li, = map(int, input().split())	li = set(li)	for i in dict1.keys():		for j in dict1[i]:			if i in li and j[0] in li:				continue			elif i in li or j[0] in li:				ans  = min(ans, j[1])print(-1 if ans==1e18 else ans)