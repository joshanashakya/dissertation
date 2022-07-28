letters=[chr(i) for i in range(ord('a'),ord('z')+1)]n,k=map(int,input().split())ans=''i=0while n > 0:	j=0	while j < k and n > 0:		ans+=letters[j]		j+=1		n-=1print(ans) 
