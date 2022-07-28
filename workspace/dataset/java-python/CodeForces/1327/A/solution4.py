for i in range(int(input())):	n, k = map(int, input().split())	if k%2 == n%2 and n >= k*k:		print("YES")	else:		print("NO")
