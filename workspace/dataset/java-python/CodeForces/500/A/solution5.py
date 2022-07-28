n,k=[int(i)for i in input().split()]a=[int(i)for i in input().split()]i=0while i<n:	if i==k-1:		print("YES")		break	else:		if i==n-1:			i=i+1		else:			i=i+a[i]else:	print("NO")
