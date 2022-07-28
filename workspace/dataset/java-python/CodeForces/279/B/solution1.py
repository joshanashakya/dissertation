n, t = map(int, input().split())best = 0a = list(map(int, input().split()))j = 0s = 0for i in range(n):	s += a[i]	while s > t:		s -= a[j]		j += 1	best = max(best, i - j + 1)print(best)
