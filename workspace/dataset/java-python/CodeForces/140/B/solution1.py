n = int(input()) frnd = [list(map(int, input().split() )) for _ in range(n)]ara = list(map(int, input().split() )) pref = [0]*(n+1)ans = [0] * n for i in range(n):	pref[ara[i]] = i  def ok(val, row):	for x in ara:		if x-1 == row:			continue		if x < val:			return 0		if x == val:			return 1  for ro in range(n):	for x in frnd[ro]:		if x - 1 == ro:			continue		if ok(x, ro):			ans[ro] = x			break for i in range(n):	print(ans[i], end=' ')print()   						  	   		  			 					 				
