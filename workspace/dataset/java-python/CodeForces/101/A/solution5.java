# abacaba m= raw_input()n=input()x={}v={}v1 = {}count=0 for i in m:	if i in x:		x[i] +=1			else:		x[i] = 1 sorted_set = sorted([(x[i],i) for i in x]) for (v,i) in sorted_set:	if v > n:		break;	n-=v	m = m.replace(i,'') # print len(set(m))# print m for j in m:	if j in v1:		pass	else:		v1[j]= 1print len(v1)print m    
