n=int(input())a=[list(map(int,input().split())) for i in range(n)] b=[[0 for j in range(n)] for i in range(n)]c=[[0 for j in range(n)] for i in range(n)] for i in range(n):    for j in range(i,n):        if(i==j):            b[i][j]=a[i][j]/1        else:            x=(a[i][j]+a[j][i])/2            b[i][j]=x            b[j][i]=x            c[i][j]=a[i][j]-x            c[j][i]=a[j][i]-xfor i in b:    for j in i:        print("{0:.8f}".format(j),end=" ")    print()            for i in c:    for j in i:        print("{0:.8f}".format(j),end=" ")    print()    
