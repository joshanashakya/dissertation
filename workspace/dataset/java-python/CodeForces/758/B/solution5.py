x = ['!','!','!','!']s = list(map(str,input()))for i in range(len(s)):	if s[i]!='!': x[i%4]=s[i]d = {'R':0,'B':0,'Y':0,'G':0}for i in range(len(s)):	if s[i]=='!': d[x[i%4]]+=1for i in d:	print(d[i],end=' ')
