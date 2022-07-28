n=int(input()) l=list(map(int,input().split())) ans=0m=float('inf')for i in l:	if i%2 and m>i:		m=i	ans+=i if ans%2:	ans-=m print(ans)
