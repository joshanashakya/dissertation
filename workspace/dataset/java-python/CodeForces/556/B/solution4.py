n = int(input())a = list(map(int,input().split()))x = (0 - a[0]) % nfor i in range(1,n):	if (a[i] + x*(-1)**i) % n != i:		print('No')		exit(0)print('Yes')
