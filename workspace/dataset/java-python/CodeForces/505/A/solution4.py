s = input()l = len(s)a = 'abcdefghijklmnopqrstuvwxyz'for i in range(len(a)):	for j in range(l+1):		x = s[:j]+a[i]+s[j:]		if x == x[::-1]:			print(x)			exit()else:	print("NA")
