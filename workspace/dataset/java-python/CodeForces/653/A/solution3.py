n = int(input())t = sorted(list(map(int, input().split())))for i in range(n-2):	if t[i]+1 in t and t[i]+2 in t:		print("YES")		breakelse:	print("NO")
