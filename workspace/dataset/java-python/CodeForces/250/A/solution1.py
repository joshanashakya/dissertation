n = int(input())lst = list(map(int,input().split()))k = 0m = 0folders = []for i in range(n):	if lst[i] < 0:		k+=1	if k == 3:		folders.append(i-m)		m = i		k = 1	if m<n:	folders.append(n-m)print(len(folders))for i in range(len(folders)):	if i == len(folders)-1:		print(folders[i],end='\n')	else:		print(folders[i],end=' ')