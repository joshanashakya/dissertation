if __name__ == '__main__':	l1,r1,l2,r2,k = map(int, input().split())	if l2 > l1:		l1 = l2	if r2 < r1:		r1 = r2	print(max(r1-l1+1-(l1<=k<=r1),0))
