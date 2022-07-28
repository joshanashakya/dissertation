x = input()k = 0for i in range(len(x)):	t = x.find('bear',i)	if t >= 0: k+=len(x)-t-3print(k)
