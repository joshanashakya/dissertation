from math import sqrt, floor, ceil # 3# 2# 17# 46n = int(input())val = 2ar = [0] * nfor i in range(1, n + 1):	num = (ceil(val / ((i + 1) * i))) * ((i + 1) * i) ** 2 - val	val = ceil(val / ((i + 1) * i)) * ((i + 1) * i)	print(num // i)
