n=int(input())m=int(input())l=[]for i in range(n):	l.append(int(input()))l.sort(reverse=True)s=0for i in range(n):	s+=l[i]	if s>=m:		print(i+1)		break
