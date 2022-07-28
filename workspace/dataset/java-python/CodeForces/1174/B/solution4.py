n=int(input())l=list(map(int, input().split()))c=0for i in range(n):	c+=l[i]%2if(c!=0 and c!=n):	l.sort()print(*l)
