from sys import stdin ,stdoutfrom os import pathrd = lambda:stdin.readline().strip()wr = stdout.writeif(path.exists('input.txt')):    stdin = open("input.txt","r")import time ,math#------------------------------------=x,y =map(int,rd().split())mylist = list(map(int,rd().split()))mn = 100000first = 0k = 1while k <= 1000:	counter = None	if mylist[0] == k :		counter = 0	else:		counter =  1		arr = [k]	for i in range(1,len(mylist)):		if k+(i*y) != mylist[i]:			counter+=1	if counter< mn :		mn = counter		first = k 	if mn == 0 :		break	k+=1 arr = [first]for _ in range(len(mylist)-1):	arr.append(arr[-1]+y)if mn == 0  :	print(0)else:	print(mn)	for i in range(len(mylist)):		res = arr[i]- mylist[i]		if res != 0 :			if res< 0 :				print('-',i+1,abs(res))			else:				print('+',i+1,abs(res))
