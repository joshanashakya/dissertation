n,m=[int(x) for x in input().split()]friends=[set() for i in range(n+1)]for i in range(m):	a,b=[int(x) for x in input().split()]	friends[a].add(b)	friends[b].add(a)recognition=[]for i in range(n+1):	recognition.append(len(friends[i])) total=[] for i in range(n-1):	for j in range(i,n):		if i in friends[j]:			for k in range(j,n+1):				if i in friends[k] and j in friends[k]:					total.append(recognition[i]+recognition[j]+recognition[k]-6) if total:	print(min(total))else:	print(-1)