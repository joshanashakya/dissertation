n,k=map(int,input().split())a=list(map(int,input().split()))fours,twos,ones=n,2*n,0# fill all the fours firstfor i in range(k):	while(a[i]>=4):		a[i]-=4		if fours:fours-=1		elif twos>=2:twos-=2		else:			print('NO')			exit()# any threes left?for i in range(k):	if a[i]==3:		a[i]=0		if fours:fours-=1		elif twos>=2:twos-=2		else:			print('NO')			exit()# any twos left?for i in range(k):	if a[i]==2:		a[i]=0		if twos:twos-=1		elif fours:			fours-=1			ones+=1		elif ones>=2:ones-=2		else:			print('NO')			exit()ones+=2*fours+twosif a.count(1)>ones:	print('NO')else:	print('YES')
