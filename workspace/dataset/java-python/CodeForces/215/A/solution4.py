from collections import defaultdictn=input()front=list(map(int,input().split()))m=input()rear=list(map(int,input().split()))ans=defaultdict(int)for i in front:	for j in rear:		if j/i==j//i:			ans[j//i]+=1print(ans[max(ans.keys())])
