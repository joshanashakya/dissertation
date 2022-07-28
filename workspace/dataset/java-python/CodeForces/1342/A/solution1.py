for _ in range(int(input())):	x,y=[int(i)for i in input().split()]	a,b=[int(i)for i in input().split()]	print(min((max(x,y)-min(x,y))*a+min(x,y)*b,(x+y)*a))
