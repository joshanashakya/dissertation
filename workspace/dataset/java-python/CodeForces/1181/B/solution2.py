n = int(input())s = input()t1 = (n + 1) // 2t2 = t1 - 1while t2 > 0 and s[t2] == '0':	t2 -= 1while t1 < n and s[t1] == '0':	t1 += 1r = int(s)if t2 > 0:	r = min(r, int(s[0:t2]) + int(s[t2:]))if t1 < n: 	r = min(r, int(s[0:t1]) + int(s[t1:]))print(r)
