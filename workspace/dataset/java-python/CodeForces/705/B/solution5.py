n = int(input())a = list(map(int,input().split()))odd = 0even = 0turn = 0for i in range(n):	if a[i] % 2 == 0:		even+= 1	if even % 2 != 0:		print(1)	else:		print(2)
