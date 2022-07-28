n, k = map(int, input().split())a = sorted(list(map(int, input().split())))result = 0for i in a:	if (i-a[0])%k!=0:		print(-1)		exit()	else:		result+=(i-a[0])//kprint(result)
