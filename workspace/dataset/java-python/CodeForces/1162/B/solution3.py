def check(a, n, m):    for i in range(n):         if(sorted(a[i])!=a[i] or len(a[i]) != len(set(a[i]))):            return 0     return 1 n, m = map(int, input().split())a  =[]b = []a1 = []b1 = []for i in range(m):    a1.append([0]*n)    b1.append([0]*n)for i in range(n):    l = [int(x) for x in input().split()]    a.append(l)        for i in range(n):    l = [int(x) for x in input().split()]    b.append(l)  for i in range(n):    for j in range(m):        x = a[i][j]        y = b[i][j]        a[i][j] = min(x, y)        b[i][j] = max(x, y)  for i in range(n):    for j in range(m):        a1[j][i] = a[i][j]        b1[j][i] = b[i][j]  if(check(a, n, m) == 1 and check(a1, m, n) == 1 and check(b, n, m) == 1 and check(b1, m, n) == 1):    print("Possible")else:    print("Impossible")