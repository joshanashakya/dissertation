 def check(a,x):	for i in range(len(a)):		if a[i] < len(a) - i:			return False	return True n=int(input())a=list(map(int,input().split()))a=sorted(a) piles = [] for i in a:	if len(piles) == 0:		piles.append([i])	else:		flg=1		for j in range(len(piles)):			if len(piles[j])<=i:				piles[j].append(i)				flg=0				break		if flg:			piles.append([i]) print(len(piles))   
