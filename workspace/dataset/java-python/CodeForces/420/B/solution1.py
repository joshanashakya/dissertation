n, m = map(int, input().split()) covers_all = set(range(1, n+1)) in_there = set([]) occurred = set([])minus_delete_candidates = set([])plus_delete_candidates = set([]) for i in range(m):	a, b = input().split()	b = int(b)	if a == '+':		in_there.add(b)		covers_all -= (plus_delete_candidates - in_there)		plus_delete_candidates = set([])		if occurred and b not in occurred:			covers_all.discard(b)	else:		if b in in_there:			in_there.remove(b)		else:			covers_all -= minus_delete_candidates			minus_delete_candidates = set([])		if in_there:			covers_all.discard(b)		else:			plus_delete_candidates.add(b)	occurred.add(b)	if b in covers_all:		minus_delete_candidates.add(b)print(len(covers_all))if covers_all:	print(' '.join(map(str, sorted(list(covers_all)))))