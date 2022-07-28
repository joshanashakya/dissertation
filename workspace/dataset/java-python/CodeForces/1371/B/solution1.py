for _ in range(int(input())):	a,b=map(int,input().split())	print(min(1+(a*(a-1)//2),b*(b+1)//2))
