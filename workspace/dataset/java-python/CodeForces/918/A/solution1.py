a, b = 1, 1k = int(input())n = 1while n <= k:	if n == b:		print("O", end = "")		a, b = b, a + b	else:		print("o", end = "")	n = n + 1
