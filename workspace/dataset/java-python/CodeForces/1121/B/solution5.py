x=int(input())s=list(map(int,input().split()))d={}for n in range(x):	for k in range(n+1,x):		j=s[n]+s[k]		if j  in d.keys():			d[j]+=1		else:			d[j]=1print(max(d.values()))
