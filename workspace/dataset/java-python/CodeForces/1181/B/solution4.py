n = int(input())s = input()i = n // 2j = n // 2 + n % 2while s[i] == '0':	i -= 1while j < n and s[j] == '0':	j += 1ans1 = 9999999999ans12 = 0if i != 0:	s1 = s[:i]	s12 = s[i:]	ans1 = int(s1)	ans12 = int(s12)ans2 = 99999999999ans22 = 0if 	j != n:	s2 = s[j:]	s22 = s[:j]	ans2 = int(s2)	ans22 = int(s22)print(min(ans1 + ans12, ans2 + ans22))