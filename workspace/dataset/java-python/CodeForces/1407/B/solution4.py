# friends approchfrom math import gcdfor _ in range(int(input())):	x = int(input())	*li, = map(int, input().split())	#li.sort()#nlogn	a = max(li)	li.remove(a)	hcf = a	li1 = [a]	for i in range(x-1):		m,q = 0,0		for j in li:			if m <gcd(hcf,j ):				m = gcd(hcf,j)				q = j		li1+= [ q]		li.remove(q)		hcf = m 	print(*li1)    
