n, k = map(int, input().split())
l = list(map(int, input().split()))
l.sort(reverse=True)
s = sum(l)
s1 = 0
s2 = sans = 0
k = 100 - kfor
i in range(
    n - 1):  # ans=max(ans,(s1*k+100*s2)/((i+1)*k+100*(n-i-1)))	s1+=l[i]	s2-=l[i]	a=(s1*k+100*s2)/((i+1)*k+100*(n-i-1))	if a<=l[i] and a>=l[i+1]:		ans=max(ans,a)	# print (s1,s2,ans,i,s1*k+100*s2,(i+1)*k)if len(set(l))==1:	print (l[0])else:	print (ans)
