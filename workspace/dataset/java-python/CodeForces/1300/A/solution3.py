def q1300a():	n = int(input())	for _ in range(n):		arr_len = int(input())		arr = [int(num) for num in input().split()]		subproblem(arr_len, arr) def subproblem(arr_len, arr):	zero_count = 0	for i in range(len(arr)):		if(arr[i] == 0):			zero_count += 1			arr[i] = 1	if(sum(arr) == 0):		zero_count += 1	print(zero_count) q1300a()