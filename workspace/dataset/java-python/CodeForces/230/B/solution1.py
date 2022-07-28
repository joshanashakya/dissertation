n=1000000a=[1]*ns=set()for i in range(2,n):	if a[i]:		s.add(i*i)		for j in range(i*i,n,i):			a[j]=0input()for x in map(int,input().split()):	print(["NO","YES"][x in s])
