n,m = map(int,input().split())a = list(map(int,input().split()))count = mans = 0for i in range(len(a)):	k = min(a)	if k<0:		ans = ans -k		count-=1		a[a.index(k)]=1	else:		break	if count==0:		breakprint(ans)
