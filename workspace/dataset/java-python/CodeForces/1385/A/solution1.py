t = int(input())for _ in range(t):	l = list(map(int,input().split()))	l.sort()	if l[1]==l[2]:		print("Yes")		print(l[0],l[0],l[1])	else:		print("No")
