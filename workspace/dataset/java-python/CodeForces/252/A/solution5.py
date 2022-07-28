n = int(input())a = list(map(int,input().split()))b = []for i in range(n):	x = a[i]	b.append(x)	for j in range(i+1,n):		x ^= a[j]		b.append(x)print(max(b))
