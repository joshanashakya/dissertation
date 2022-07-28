for x in range(int(input())):	l=list(map(int,input().split()))	ma=max(l[:3])	di=0	for x in l[:3]:		if x!=ma:			di+=ma-x	if ((l[-1]-di)%3)==0 and (l[-1]-di)>=0:		print("YES")	else:		print("NO")
