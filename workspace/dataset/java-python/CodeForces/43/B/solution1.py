def solution():	st1=input()	st2=input() 	dicty1={}	dicty2={}	LET='ABCDEFGHIJKLMNOPQRSTUVWXYZ'	LET+=LET.lower() 	for c in LET:				dicty1[c]=0		dicty2[c]=0 	for c in st1:		if c!=' ':			dicty1[c]+=1 	for c in st2:		if c!=' ':			dicty2[c]+=1  	for c in dicty2:		if dicty2[c]>dicty1[c]:			print('NO')			return	print('YES')	    	return    solution()
