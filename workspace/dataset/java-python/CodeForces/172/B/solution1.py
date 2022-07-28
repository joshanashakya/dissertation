a,b,m,r=map(int,input().split())d={}i=1while 1:	r=(a*r+b)%m;t=d.get(r,0)	if t:i-=t;break	d[r]=i;i+=1print()print(i)
