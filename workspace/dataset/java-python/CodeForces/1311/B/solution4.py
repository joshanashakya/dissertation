def solve(n,m,a,p):	a = [(v,ai) for ai,v in enumerate(a)]	sorted_a = sorted(a)	target_idx = {}	for si in range(n):		v,ai = sorted_a[si]		target_idx[ai] = si 	for v,ai in a:		ti = target_idx[ai]		if ai < ti:			less,more = ai,ti		else:			less,more = ti,ai		for j in range(less,more):			if j not in p:				return 'NO'	return 'YES' if __name__ == '__main__':	T = int(input())	for t in range(T):		n,m = tuple(map(int,input().split()))		a = list(map(int,input().split()))		p = set(map(lambda x:int(x)-1,input().split()))		print(solve(n,m,a,p))
