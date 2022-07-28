t = int(input())for _ in range(t):	n = int(input())	l = [2**i for i in range(1,n+1)]	# print(l)	d = l[-1] + sum(l[:n//2 -1])	print(2*d-sum(l))
