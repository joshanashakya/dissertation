import random, mathfrom copy import deepcopy as dcfrom bisect import bisect_left, bisect_right # Function to call the actual solutiondef solution(li, x, k):	li.sort()	# print(li) 	s = 0 	tot = 0	for i in range(len(li)):		l = math.ceil(li[i]/x)*x + (k-1) * x		r = l + x - 1		l = max(l, li[i])		mid = bisect_left(li, l)		up = bisect_right(li, r)		tot += up - mid		# print(l, r)	return tot # Function to take inputdef input_test():	n, x, k = map(int, input().strip().split(" "))	li = list(map(int, input().strip().split(" ")))	out = solution(li, x, k)	print(out)  input_test()# test()