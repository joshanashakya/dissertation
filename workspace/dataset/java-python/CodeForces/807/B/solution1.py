s=4000i=(s//50)%475# i=213allvals=[]while ((len(allvals)==0) or (((i*96+42)%475)!=allvals[0])):	i=(i*96+42)%475	allvals.append(i)# print(allvals)p,x,y=[int(x) for x in input().split(' ')] CurrState=(x//50)%475 me=p-26whereMe=allvals.index(me)acceptingStates=[]for i in range(25):	acceptingStates.append(allvals[whereMe-i-1])negAcc=[(x-475) for x in acceptingStates]acceptingStates.sort()negAcc.sort() # print(acceptingStates)sa=set(acceptingStates) maxNeg=0if(y%50<=x%50):	maxNeg=(x-y)//50else:	maxNeg=(x-y)//50 # print(maxNeg) minVisitabeState=(CurrState-maxNeg+475)%475# print(minVisitabeState)minVisitabeStates=[minVisitabeState]for i in range(10000):	(minVisitabeStates.append(minVisitabeStates[-1]+1))# print(minVisitabeStates[:20])aornot=[None]*10000for i in range(10000):	aornot[i]=int(minVisitabeStates[i] in sa)# print(aornot[:20])# mypos=minVisitabeStates.index(CurrState)# print(mypos) fl=1for i in range(mypos+1):	if(aornot[i]):		print(0)		fl=0		breakif(fl):	facc=aornot.index(1)	if(facc%2!=mypos%2):		facc+=1	print((facc-mypos)//2) 
