x,y,a,b=list(map(int,input().split()))ans=[]for i in range(b,y+1):	for j in range(a,x+1):		if i<j:			ans.append([j,i])print(len(ans))ans.sort()for i in ans:	print(*i) 
