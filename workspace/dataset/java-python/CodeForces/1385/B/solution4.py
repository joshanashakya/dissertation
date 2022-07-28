for s in [*open(0)][2::2]:	a = list(map(int, s.split()))	ans = []; used = set()	for n in a:		if n in used: continue		ans.append(n); used.add(n)	print(*ans)
