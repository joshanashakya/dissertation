from collections import defaultdictfrom collections import dequeimport bisectimport heapqfrom math import sqrt, ceil def ri():    return int(input()) def rl():    return list(map(int, input().split())) t = ri()for _ in range(t):	n, d = rl()	ans = "NO"	for x in range(int(sqrt(d)) - 10, int(sqrt(d)) + 10):				if x >=0 and x <= n:			val = x + ceil(d / (x + 1))			if val <= n:				ans = "YES"				break	print(ans) 