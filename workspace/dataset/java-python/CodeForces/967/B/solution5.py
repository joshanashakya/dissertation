n,a,b=map(int,input().split())if n==1:	print('0')	exit()l=list(map(int,input().split()))s=sum(l)z=sorted(l[1:],reverse=True)for i in range(n-1):	if l[0]*a/s>=b:		print(i)		exit()	s-=z[i]print(i+1)
