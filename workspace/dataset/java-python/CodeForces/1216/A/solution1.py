n = int(input())s = input()t, i, count = '', 0, 0while i < n-1:	if s[i:i+2] != 'ab' and s[i:i+2] != 'ba':		t += 'ab'		count += 1	else:		t += s[i:i+2]	i += 2print(count)print(t)
