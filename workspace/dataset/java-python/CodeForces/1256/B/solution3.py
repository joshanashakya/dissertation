# your code goes hereimport math def lexo(a,s,n):	if s>=n-1:		return a	m=s	for i in range(s,n):		if a[i]<a[m]:			m=i	a[s:n]=[a[m]]+a[s:m]+a[(m+1):n]	if m==s:		return lexo(a,m+1,n)	else:		return lexo(a,m,n) t=int(input())for k in range(t):	n=int(input())	a=list(map(int,input().split()))	print(*lexo(a,0,n))# your code goes here