n,p=map(int,input().split(" "))l=[]for x in range(n):    pp=input()    l.append(pp)l.reverse()a=[1 for x in range(n)]ans=0.5*pfor x in range(1,n):    if l[x]=="halfplus":        a[x]=a[x-1]*2+1        ans=ans+int((a[x]/2)*p)    else:        a[x]=a[x-1]*2        ans=ans+int(a[x]//2)*pprint(int(ans))
