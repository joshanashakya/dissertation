team_1=input()team_2=input()n=int(input())ll=[]for i in range(n):	mi, te, num, card=map(str, input().split())	ll.append((int(mi), te, int(num), card))ll.sort(key=lambda x :x[0]) team_1_p=[0 for x in range(101)]team_2_p=[0 for x in range(101)]d_1, d_2={}, {}sol=[]for l in ll:	if l[1]=='h':		if l[3]=='r':			if l[2] not in d_1:				sol.append((team_1, l[2], l[0]))				d_1[l[2]]=True		elif l[3]=='y':			if team_1_p[l[2]]==0:				team_1_p[l[2]]+=1			else:				if l[2] not in d_1:					sol.append((team_1, l[2], l[0]))					d_1[l[2]]=True	if l[1]=='a':		if l[3]=='r':			if l[2] not in d_2:				sol.append((team_2, l[2], l[0]))				d_2[l[2]]=True		elif l[3]=='y':			if team_2_p[l[2]]==0:				team_2_p[l[2]]+=1			else:				if l[2] not in d_2:					sol.append((team_2, l[2], l[0]))					d_2[l[2]]=True for x in sol:	print(*x)
