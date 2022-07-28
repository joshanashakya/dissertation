k=int(input())p=input()n=sorted(map(int,p))s=sum(n)if s>=k:	print(0)else:	i=0	while(s<k):		s=s+9-n[i]		i+=1	print(i)	
