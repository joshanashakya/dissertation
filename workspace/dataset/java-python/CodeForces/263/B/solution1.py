n,k = list(map(int, input().split()))a = list(map(int, input().split())) if k <= n:	a.sort(reverse = True)	print(f"{a[k - 1]} {a[k - 1]}")else:	print(-1)
