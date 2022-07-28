if __name__ == '__main__':	n = int(input())	l = input().split()	d = dict()	for i in l:		s = sorted(set(i))		j = ''		for i in range (len(s)):			j+=s[i]		d.setdefault(j,0)		d[j]+=1	print(len(d))
