n = int(input())goodcars = 0res = []for i in range(n):	a = list(map(int, input().split()))	accept = 0	for j in range(n):		if a[j] == 1 or a[j] == 3:			accept = 1			break	if accept == 0:		goodcars += 1		res.append(i + 1)print(goodcars)print(*res)
