s = input()flag = 97rotation = 0for i in range(len(s)):	diff = abs(flag-ord(s[i]))	if diff > 13:		diff = 26 - diff	rotation += diff	flag = ord(s[i]) print(rotation)
