a=[i for i in input()]b=sorted([i for i in input()], reverse=True)i, p =0, 0while i<len(a) and p<len(b):	if a[i]<b[p]:		a[i]=b[p]		p+=1	i+=1print(''.join(a))
