#tattiidef lis(arr):	n = len(arr)	dp= [1]*n 	for i in range (1 , n):		for j in range(0 , i):			if arr[i] >= arr[j] :				dp[i] = max(dp[i],dp[j]+1)	return max(len(lst)-max(dp),0) a,b=map(int,input().strip().split())lst=[]for i in range(a):	x,y=map(float,input().strip().split())	lst.append(x) print(lis(lst))
