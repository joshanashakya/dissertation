c = 0for i in range(int(input().split()[0])):	a = input().split()	while len(a):		if '1' in [a.pop(), a.pop()]:			c+=1print(c)
