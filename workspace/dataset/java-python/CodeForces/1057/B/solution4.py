n=int(input()) l=[*map(int,input().split())]mx=0mxs=0'''for i in range(n-1):    t=100    total=l[i]    if total>=t:        mxs+=1        print(l[i])    for j in range(i+1,n):        t+=100        total+=l[j]        if total>=t:            mxs+=1            print(l[j])        else:            break    mx=max(mx,mxs)print(mx)     '''m=0for i in range(n):    s=0    for j in range(i,n):        s=s+l[j]        if(s>(j-i+1)*100):            m=max(m,j-i+1)print(m)