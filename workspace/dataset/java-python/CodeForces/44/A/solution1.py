n = int(input())arr = []ans = 0for i in range(n):	s = input()	if s not in arr:		arr.append(s)		ans += 1print(ans)
