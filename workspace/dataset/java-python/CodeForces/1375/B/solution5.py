for _ in range(int(input())):    m,n=map(int,input().split())    l=[[int(i) for i in input().split()] for k in range(m)]    f=0    for i in range(m):        for j in range(n):            ct=0            if i-1>=0:                ct+=1            if i+1<m:                ct+=1            if j-1>=0:                ct+=1            if j+1<n:                ct+=1            if l[i][j]>ct:                f=1                break            else:                l[i][j]=ct        if f==1:                        break    if f==1:        print('NO')    else:        print('YES')        for i in l:            print(*i)                
