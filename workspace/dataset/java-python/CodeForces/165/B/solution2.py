def possible(v,k):	ans = v	prev = k	while v//k>0:		ans+= (v//k)		k*=prev	return ansn,k = map(int,input().split())low = khigh = nans = float("inf")while low<high:	mid = low+((high-low)//2)	if possible(mid,k)>=n:		high = mid	else:		low = mid+1print(high)