if __name__ == '__main__':	n = int(input())	l = list(map(int, input().split()))	l.sort()	wins = 1	j = (2*n)-1	if l[n-1] != l[n]:		print('YES')	else:		print('NO')
