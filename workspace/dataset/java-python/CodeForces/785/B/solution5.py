a,b,c,d = [],[],[],[]n = int(input())for _ in range(n):	l1,r1 = map(int,input().split())	a.append(r1)	c.append(l1)m = int(input())for _ in range(m):	l2,r2 = map(int,input().split())	b.append(l2)	d.append(r2)if min(a)>=max(b) and min(d)>=max(c): print(0)else: print(max(max(b)-min(a),max(c)-min(d)))
