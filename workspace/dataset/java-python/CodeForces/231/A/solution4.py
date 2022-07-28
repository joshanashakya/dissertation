times = int(input())count=0for i in range(times):	a,b,c = map(int, input().split())	if a+b+c>=2:		count+=1print(count)
