def solve(n, k):	primes = set([*range(2, n + 1)]) 	for i in range(2, int(n**(1/2)) + 1): 		if i in primes: 			j = 2			while i*j < n:				if i*j in primes:					primes.remove(i*j)				j += 1	primesL = list(primes) 	total = 0	for i in range(len(primesL) - 2):		if (primesL[i] + primesL[i + 1] + 1) in primes: 			total += 1 	if total >= k: 		print("YES")	else: print("NO") n, k = map(int, input().split(" "))solve(n, k)