links=[[],[],[],[],[],[]]n,q=map(int,input().split())for _ in range(q):	a,b=input().split()	links[ord(b)-ord('a')].append(a[0])  def func(b,depth):	if depth==n:		return 1	count=0	for a in links[ord(b)-ord('a')]:		count+=func(a,depth+1)	return countprint(func('a',1))