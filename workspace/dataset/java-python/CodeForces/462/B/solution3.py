from collections import Counterdef f(arr,k):	x=[0]*26	for i in arr:		x[ord(i)-ord("A")]+=1	ans=0	for j in sorted(x,reverse=True):		if j<=k:			k-=j			ans+=j**2		else:			ans+=k**2			k=0			break	return ans  a,b=map(int,input().strip().split())lst=input()print(f(lst,b))