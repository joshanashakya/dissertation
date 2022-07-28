x,y=map(int,input().split())n=int(input())l=[x,y]for i in range(4):	a=y-x	x=y	y=a	l.append(y)# print(l)j=n%6-1if j==-1:	j=5print(l[j]%1000000007)
