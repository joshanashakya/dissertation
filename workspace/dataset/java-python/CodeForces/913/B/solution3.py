n=int(input())arr = [0]*(n+2)arri = [False]*(n+2)itrmap = dict()mitrmap = dict()# root = 1# previnp = 0for i in range(n-1):	inp = int(input())	# if previnp!=inp:	# 	itr = i+2	# 	previnp = inp	# arr[inp]+=1	# itrmap[inp]=[(itr,i+2)]	# maplist = list(itrmap.keys())	# #maplist.sort()	# if inp>=itrmap[root][0] and inp<=itrmap[root][1]:	# 	pass	# else:	# 	for j in maplist:	# 		if inp>=itrmap[j][0] and inp<=itrmap[j][1]:	# 			root = j	# 			break	# if inp>=itrmap[root][0] and inp<=itrmap[root][1] and arri[inp]==False:	# 	arr[root]-=1	# 	arri[inp]=True# 	print(maplist,root)# print(arr)# print(itrmap)# flag = 0# for j in maplist:# 	if arr[j]<3:# 		flag = 1# 		break # if flag == 1:# 	print("No")# else:# 	print("Yes")	arr[i+2]=inp	try:		itrmap[inp].append(i+2)		mitrmap[inp]+=1	except:		itrmap[inp] = [i+2]		mitrmap[inp] = 1	try:		# pass		if arri[inp]==False:			mitrmap[arr[inp]]-=1			arri[inp]=True	except:		pass # print(arr)# print(itrmap)# print(mitrmap)maplist = list(mitrmap.keys())flag = 0for j in maplist:	if (mitrmap[j])<3:		flag = 1		breakif flag == 1:	print("No")else:	print("Yes")
