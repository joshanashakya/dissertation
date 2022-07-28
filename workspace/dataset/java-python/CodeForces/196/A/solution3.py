s=list(input())a=list(set(s))a.sort(reverse=True)l=[]k=0for j in range(len(a)):	for i in range(k,len(s)):		if(a[j]==s[i]):			l.append(s[i])			k=iprint("".join(l))
