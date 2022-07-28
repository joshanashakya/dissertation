a,c=map(int,input().split())b,i=0,1while a>0 or c>0:	b+=i*(((c%3)-(a%3))%3)	i*=3	a//=3	c//=3print(b)
