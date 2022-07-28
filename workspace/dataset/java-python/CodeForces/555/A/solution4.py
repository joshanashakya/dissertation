n,k=map(int,input().split())l=0g=kfor i in range(k):	s,*x=map(int,input().split())	if x[0]==1:		for i in range(s):			if x[i]!=i+1:				i-=1				break		i+=1		breakans=(n-1)+(n-k)-2*(i-1)print(ans)
