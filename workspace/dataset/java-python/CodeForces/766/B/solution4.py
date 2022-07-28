n=int(input())a=sorted([int(x) for x in input().split()])for i in range(1,n-1):	if (a[i-1]+a[i]>a[i+1]):		print("YES")		exit()print("NO")
