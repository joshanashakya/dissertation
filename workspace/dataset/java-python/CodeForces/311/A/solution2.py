n,k = map(int,input().split())tot = ((n*(n-1))/2) if tot <= k:    print("no solution")else:    for i in range(1,n+1):        print(0,i)
