for _ in range(1):    n = int(input())    a = []    q = 0    if(n%2 != 0):        print(-1)    else:        for i in range(1,n+1):            a.append(i)        for i in range(0,n,2):            t = a[i]            a[i] = a[i+1]            a[i+1] = t        print(*a) 
