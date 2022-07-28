n=int(input())a=list(map(int,input().split()))p=[];c=0for i in range(len(a)):	a.append(a[i])i=0while i<len(a):	if a[i]==1:		c+=1	else:		p.append(c)		c=0	i+=1print(max(p))
