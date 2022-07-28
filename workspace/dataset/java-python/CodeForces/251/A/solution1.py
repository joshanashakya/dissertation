n,d=list(map(int,input().split()))array=list(map(int,input().split()))start=0end=0ans=0 while end<n:	while array[end]-array[start]>d:		start+=1	k=end-start	ans+=k*(k-1)//2	end+=1print(ans)
