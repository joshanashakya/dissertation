k,a,b,v=map(int,input().split())ans = 0while a>0:	sec = min(k,b+1)	if sec<=0:		ans+=1		a-=v	else:		a-=sec*v	ans+=1	b=b-sec+1print(ans)
