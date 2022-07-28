n=int(input())l=[]for __ in range(n):	a=int(input())	l.append(a) ans=2*n-1ans+=l[0] for i in range(n-1):	ans+=abs(l[i+1]-l[i]) print(ans)
