n,k=[*map(int,input().split())]l=[*map(int,input().split())]d={}for i in range(n):    if l[i] in d:        d[l[i]]=d[l[i]]+1    else:        d[l[i]]=1if max(d.values())>k or k>n:    print('NO')else:    print('YES')    li=[]    for i in range(n):        li.append([l[i],i])    li.sort(key=lambda x:x[0])    la=[]    for i in range(n):        la.append([i%k+1,li[i][1]])    la.sort(key=lambda x:x[1])    for i in range(n):        print(la[i][0],end=' ')