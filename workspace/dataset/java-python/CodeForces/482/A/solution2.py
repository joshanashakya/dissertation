n,k=map(int,input().split())a=[i+1 for i in range(n)]j=n;ans=[];d=1;t=0for i in range(k):	if i%2==0:		ans.append(j)		j-=1	else:		ans.append(d)		d+=1if k%2==0:	for i in range(d,j+1):		ans.append(i)else:	for i in range(j,d-1,-1):		ans.append(i)print(*ans)