def solution():	n,k=map(int,input().split()) 	arr=list(map(int,input().split())) 	k-=1	num=arr[k]	for i in range(k,n):		if arr[i]!=num:			print(-1)			return 	curr=k-1	while curr>=0 and arr[curr]==num:		curr-=1 	 	print(curr+1)  	return    solution()