n,k=map(int,input().split()) y=[int(i) for i in input().split()] y=[5-i for i in y] y.sort(reverse=True) # print(y) ct=0 for i in range(len(y)):	if i%3==2:		if y[i]>=k:			ct+=1 print(ct)
