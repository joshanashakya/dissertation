n, m = map(int, input().split()) min_i = 51max_i = 0min_j = 51max_j = 0 pattern = list() for i in range(n):	s = input()	pattern.append(s) 	temp = s.find("*")	if temp != -1:		min_j = min(temp, min_j)		max_j = max(max_j, s.rfind("*"))		min_i = min(i, min_i)		max_i = max(i, max_i) for i in range(n):	if min_i <= i <= max_i:		print(pattern[i][min_j: max_j+1])