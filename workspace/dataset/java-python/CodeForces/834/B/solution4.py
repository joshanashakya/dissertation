n,k = map(int, input().strip().split(' '))s=input()s=list(s)l1=[2*10**6]*26l2=[0]*26for i in range(n):    o=ord(s[i])-65    if l1[o]>i:        l1[o]=i    if l2[o]<i:        l2[o]=ii=0while(i<len(l1)):    if l1[i]==2000000 and l2[i]==0:        del l1[i]        del l2[i]    else:        i+=1for i in range(len(l1)-1):    for j in range(i+1,len(l1)):        if l1[i]>l1[j]:            l1[i],l1[j]=l1[j],l1[i]            l2[i],l2[j]=l2[j],l2[i]l=len(l1)t=0c=0for i in range(l):    f=0    if l1[i]!=-1:        t=l2[i]        if i==l-1:            c+=1            break        for j in range(i+1,l):            if f==0:                f=1                c+=1            if l1[j]>t:                f=1                t=l2[j]                l1[j]=-1                l2[j]=-1 if k>=c:    print('NO')else:    print('YES')        
