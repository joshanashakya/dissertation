n,k=map(int,input().split())l=list(map(int,input().split()))d={}for i in l:    if(i in d):        d[i]+=1    else:        d[i]=1if(len(d)<k):    print('NO')else:    print('YES')    d1={}    c=0    for i in range(n):        if(c<k and l[i] not in d1):            c+=1            print(i+1,end=' ')            d1[l[i]]=1         
