t=int(input())for j in range(t):    n=int(input())    kol=[]    f,g=map(int,input().split())    kol.append([f,g])    flag=0    if g>f:        print('NO')        flag=1                for i in range(n-1):        p,c=map(int,input().split())        kol.append([p,c])         if (c>p or kol[i][0]>p or kol[i][1]>c or p-kol[i][0]<c-kol[i][1]) and flag==0:            print('NO')            flag=1    if flag==0:        print('YES')        