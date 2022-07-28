n,d=map(int,input().split())a=list(map(int,input().split()))sets=0a.sort()for i in range(0,n-1):	A=a[i]	for j in range(i+1,n):		B=a[j]		diff=B-A		if diff<=d:			sets+=1		else:			breakprint(2*sets)
