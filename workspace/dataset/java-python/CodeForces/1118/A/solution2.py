q = int(input()) for i in range(q):	n,a,b = map(int,input().split(" ")) 	print(min(a*n,b*(n//2) + a*(n%2)))
