def lis(arr):	n = len(arr) 	# Declare the list (array) for LIS and	# initialize LIS values for all indexes	lis = [1]*n 	# Compute optimized LIS values in bottom up manner	for i in range (1 , n):		for j in range(0 , i):			if arr[i] >= arr[j] and lis[i]< lis[j] + 1 :				lis[i] = lis[j]+1 	# Initialize maximum to 0 to get	# the maximum of all LIS	return max(len(lst)-max(lis),0) a,b=map(int,input().strip().split())lst=[]for i in range(a):	x,y=map(float,input().strip().split())	lst.append(x) print(lis(lst))