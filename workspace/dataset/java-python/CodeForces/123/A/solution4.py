import bisects=input()b=sorted(s)n=len(s)ch=[]ct=[]i=0while i<n:    t=b[i]    c=0    while t==b[i]:        c=c+1        i=i+1        if i==n:            break    ch.append([c,t])    ct.append(c)q=len(ct)ct.sort()ch.sort()color=[1,1]+[0]*(n-1)p=[]x=[0]*(n+1)for i in range(2,n+1):    if x[i]==0:        for j in range(2*i,n+1,i):            x[j]=1for i in range(2,n+1):    if x[i]==0:        p.append(i)for i in p:    co=i    for j in range(i,n+1,i):        if color[j]:            co=color[j]            break    for j in range(i,n+1,i):        color[j]=codc={}for i in range(1,n+1):    dc[color[i]]=dc.get(color[i],0)+1ans=[' ']*(n+1)f=0for i in range(1,n+1):    if ans[i]==' ':        j=bisect.bisect_left(ct,dc[color[i]])        if j==q:            f=1            break        else:            char=ch[j][1]            for z in range(i,n+1):                if color[z]==color[i]:                    ans[z]=char            ct[j]=ct[j]-dc[color[i]]            ch[j][0]=ch[j][0]-dc[color[i]]            ct.sort()            ch.sort()if f:    print('NO')else:    print('YES')    s=''    for i in range(1,n+1):        s=s+ans[i]    print(s)
