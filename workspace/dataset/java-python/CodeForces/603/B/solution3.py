MOD=int(1e9+7)n,k=map(int,input().split())if k<2:p=n-(1-k)else:	t=1	a=k	while a!=1:		a=a*k%n		t+=1	p=(n-1)//tprint(pow(n,p,MOD))
