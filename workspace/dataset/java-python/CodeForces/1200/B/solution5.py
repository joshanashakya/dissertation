from sys import stdininput=lambda : stdin.readline()from math import ceil,sqrt,gcdfor _ in range(int(input())):	n,m,k=map(int,input().split())	l=list(map(int,input().split()))	flag='YES'	for i in range(n-1):		if l[i+1]>l[i]:			if l[i+1]-l[i]>k:				if m<l[i+1]-l[i]-k:					flag='NO'					break				else:					m-=(l[i+1]-l[i]-k)					# print('df')			elif l[i+1]-l[i]<k:				m+=min(k-l[i+1]+l[i],l[i])				# print("fhh")		else:			m+=l[i]-l[i+1]+min(k,l[i+1])		# print(m)	print(flag)