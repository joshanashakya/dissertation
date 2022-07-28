if __name__ == '__main__':	n,a,b = map(int, input().split())	s = input()	f = a-1	t = b-1	if a >b:		f,t=t,f	if a == b or s[a-1] == s[b-1]:		print(0)	else:		print(1)
