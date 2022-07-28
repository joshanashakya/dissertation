n, k=map(int, input().split())a=[x+1 for x in range(n)]for m in map(int, input().split()):	m%=len(a)	print(a[m], end=" ")	a=a[m+1:]+a[:m]print()
