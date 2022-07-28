d1={} for i in range (int(input())):    s1=input()    if(s1 in d1):        d1[s1]+=1    else:        d1[s1]=1l1=list(d1.values())l2=list(d1.keys())print(l2[l1.index(max(l1))])
