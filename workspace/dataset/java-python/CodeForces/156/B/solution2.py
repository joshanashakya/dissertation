import sysinput=lambda:sys.stdin.readline().strip()print=lambda s:sys.stdout.write(str(s)+"\n")a,b=map(int,input().split())r=[0]*ac1=[0]*(a+1)c2=[0]*(a+1)f=0for i in range(a):	n=int(input())	r[i]=n	if n>0:c1[n]+=1	else:		f+=1		c2[-n]+=1possible=[False]*(a+1)# print(c1,c2)np=0#number of suspectsfor i in range(1,a+1):	if c1[i]+f-c2[i]==b:		#f-c2[i] is truth		possible[i]=True		np+=1# print(possible)for i in range(a):	if r[i]>0:#he said +		if possible[r[i]] and np==1:#unique			print("Truth")		elif not possible[r[i]]:#Lie			print("Lie")		else:			print("Not defined")	else:#claims r[i] is not		r[i]*=-1		if possible[r[i]] and np==1:print("Lie")		elif not possible[r[i]]:print("Truth")		else:print("Not defined")# print (possible)