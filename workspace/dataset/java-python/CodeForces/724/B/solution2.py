def cntmisp(a):    return(sum([int(a[i]!=(i+1)) for i in range(len(a))])) n,m=[int(x) for x in input().split(' ')]a=[]for i in range(n):    a.append([int(x) for x in input().split(' ')]) cnts=[cntmisp(x) for x in a] fl=0if(max(cnts)<=2):    print("YES")else:    for p1 in range(m-1):        for p2 in range(p1+1,m):            A=[]            for i in range(n):                subA=[]                for p in range(m):                    if(p==p1):                        subA.append(a[i][p2])                    elif(p==p2):                        subA.append(a[i][p1])                    else:                        subA.append(a[i][p])                A.append(list(subA))            newcnts=[cntmisp(x) for x in A]            if(max(newcnts)<=2):                fl=1    print("YES" if(fl) else "NO") 