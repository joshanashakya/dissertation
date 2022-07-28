s=input()l=[0]*26 for i in s:	l[ord(i)%97]+=1 c=0for i in l:	if i%2==1:		c+=1 if (c%2==1 or c==0):	print("First")else:	print("Second")
