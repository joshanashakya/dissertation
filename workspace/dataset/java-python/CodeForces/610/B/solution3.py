n=int(input())a=list(map(int,input().strip().split(" "))) p=min(a)lf=[]rf=[]c1=0c2=0kc=-1for i in range(n):    if i==0:        if a[i]==p:            lf.append(i)            kc=1            c1+=1        else:                        lf.append(-1)            c1+=1    else:        if a[i]==p and kc==-1:            lf.append(i)            kc=1            c1+=1        else:            lf.append(lf[c1-1])            c1+=1for i in range(n-1,-1,-1):    if i==n-1:        if a[i]==p:            rf.append(i)            c2+=1        else:            rf.append(-1)            c2+=1    else:        if a[i]==p:            rf.append(i)            c2+=1        else:            rf.append(rf[c2-1])            c2+=1rf.reverse()#print(*lf)#print(*rf)ans=p*nkk=0for i in range(n):    if (lf[i]!=-1 and rf[i]!=-1 and a[i]!=p):        kk=max(kk,rf[i]-i)    elif (lf[i]!=-1 and a[i]!=p):        kk=max(kk,lf[i]+n-i)    elif (rf[i]!=-1 and a[i]!=p):                kk=max(kk,rf[i]-i)        ans+=kkprint(ans)            