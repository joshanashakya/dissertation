n = int(input()) a = [[0,0]]*nb = [[0,0]]*nj = 0; k = 0for i in range(n):	x, y = input().split()	a[i] = [int(x), 0]	b[i] = [int(y), 0]	if a[j][0] < b[k][0]:		a[j][1] = 1		j += 1	else:		b[k][1] = 1		k += 1 s1 = ''; s2 = ''for i in range(n//2):	s1 += '1'	s2 += '1' for i in range(n//2, n):	s1 += str(a[i][1])	s2 += str(b[i][1]) print(s1)print(s2) 
