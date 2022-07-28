n,k=[int(i)for i in input().split()]m=[int(i)for i in input().split()]m.sort()a=m[n-1]-m[0]for i in range(1,k-1):	if i+n-1>k-1:		break		c=m[i+n-1]-m[i]	if c<a:		a=m[i+n-1]-m[i]print(a)
