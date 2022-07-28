def solution():	n=int(input())	arr=list(map(int,input().split()))	if sum(arr)%n:		print(n-1)	else:		print(n) 	     	return			   solution()
