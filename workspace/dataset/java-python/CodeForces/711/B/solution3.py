#map(int,input().split())#list(map(int,input().split()))def check(l):    sdiag1=sdiag2=0    l1=[]    l2=[]    l3=[]    l4=[]    n=len(l)    for i in range(n):        srow=scol=0        for j in range(n):            srow+=l[j][i]            scol+=l[i][j]        l1.append(srow)        l2.append(scol)    for i in range(n):        sdiag1+=l[i][i]        sdiag2+=l[n-i-1][i]    l3.append(sdiag1)    l4.append(sdiag2)    if set(l1)==set(l2):        if set(l2)==set(l3):            if set(l3)==set(l4):                return True    return False    ttt=int(input())l=[]for _ in range(ttt):    l1=list(map(int,input().split()))    l=l+[l1]#print(l)ke=0for i in range(ttt):    for j in range(ttt):        if l[i][j]==0:            i1=i;j1=j;ke=1;break    if ke==1:        breakfor i in range(ttt):    if i!=i1:        su=sum(l[i])    else:        sut=sum(l[i])if len(l)!=1:    l[i1][j1]=su-sut    if su-sut>0:                if(su-sut==0):            print(-1)        elif (check(l)):            print(su-sut)        else:            print(-1)    else:        print(-1)else:    print(1)        '''n,m=map(int,input().split())    st=input()    for i in range(m):        l,r=map(int,input().split())        se=[0]        x=0        for j in range(0,l-1):            if st[j]=="-":                x=x-1                se=se+[x]            else:                x=x+1                se=se+[x]        for j in range(r,n):            if st[j]=="-":                x=x-1                se=se+[x]            else:                x=x+1                se=se+[x]        print(len(set(se)))'''        