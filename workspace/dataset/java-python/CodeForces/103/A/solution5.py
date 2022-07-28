n=int(input())l=list(map(int,input().split()))m=0for i in range(len(l)):	if l[i]>1:		m+=(l[i]*(i+1))-i	else:		m+=1print(m) 
