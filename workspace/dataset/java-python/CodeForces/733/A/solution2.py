s=[x for x in input()]n=len(s)v=['A','E','I','O','U','Y']pos=[-1]for i in range(len(s)):	if(v.count(s[i])):		pos.append(i)pos.append(n)d=[]for i in range(1,len(pos)):	d.append(pos[i]-pos[i-1])print(max(d))
