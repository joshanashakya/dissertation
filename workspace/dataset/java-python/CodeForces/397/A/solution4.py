n=int(input())f=1start=[]end=[]main=[]res=[]for i in range(n):	num=list(map(int,input().split()))	main.append(num[0])	main.append(num[1])	if f==1:		f=0		als=num[0]		ale=num[1]		continue	start.append(num[0])	end.append(num[1])m=max(main)#print(main)res=[1]*mfor i in range(als,ale):	res[i]=0for j in range(len(start)):	for i in range(start[j],end[j]):		res[i]=1#print(res)print(res.count(0))
