def pr(v):    n=len(v)    fw=open('output.txt','w')    for c in range(n-1):        s=''.join(v[c])        fw.write(s + '\n')    s=''.join(v[n-1])    fw.write(s)    fw.close() def gbn(v,t):    n=len(v)    tn=len(t)    bl=list('*'*tn)    nv=[]    for c in range(n*tn):        nv.append([])    for x in range(n):        for z in range(n):            if v[z][x]=='.':                for h in range(tn):                    nv[z*tn+h]+=t[h]            else:                for h in range(tn):                    nv[z*tn+h]+=bl    return nv	def fact(v,k):    t=v.copy()    for c in range(k):        v=gbn(v,t)    return v  fr=open('input.txt','r')ss=fr.readlines()fr.close() for c in range(len(ss)):    l=len(ss[c])    ss[c]=ss[c][:l-1]    n,k=map(int,ss[0].split(' '))v=[]for c in range(n):    v.append(list(ss[c+1]))nv=fact(v,k-1)pr(nv)