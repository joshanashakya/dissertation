def inp():    return map(int,input().split()) def check(arr,n,m):    for i in range(n):        for j in range(1, m):            if arr[i][j] <= arr[i][j-1]:                return 1    for i in range(m):        for j in range(1, n):            if arr[j][i] <= arr[j-1][i]:                return 1    return 0 n,m = inp()arr = []for i in range(n):    arr.append(list(inp()))brr = []for i in range(n):    brr.append(list(inp()))for i in range(n):    for j in range(m):        if arr[i][j]>brr[i][j]:            x = arr[i][j]            arr[i][j] = brr[i][j]            brr[i][j] = xf = check(arr,n,m)|check(brr,n,m)if f==1:    print("Impossible")else:    print("Possible")
