n,k = [int(x) for x in input().split()]s = 0goodset = set([str(x) for x in range(k+1)])for i in range(n):	num = input()	if  goodset.issubset(set(num)):		s+=1print(s)
