n=int(input().strip())a=[]for i in range(n):    s=input().strip()    a.append(s)b=list(map(int,input().strip().split()))c=[]while (True):    k=-1    for i in range(n):        if (b[i]==0):            k=i            break    if (k==-1):        break    else:        c.append(k+1)        for i in range(n):            if (a[k][i]=='1'):                b[i]-=1tot=len(c)print(tot)for x in c:    tot=tot-1    print(x,end=' ') if (tot!=0) else print(x,end='\n')