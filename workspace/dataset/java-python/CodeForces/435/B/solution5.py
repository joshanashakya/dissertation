a,k=map(int,input().split())a=list(str(a))b=""while(len(a)>0):	m=a.index(max(a[:k+1]))	k-=m	b+=a[m]	a.pop(m)print(b)
