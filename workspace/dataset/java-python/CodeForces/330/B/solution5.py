n, m = map(int, input().split())g = [set() for i in range(n)]for i in range(m):    a, b = map(int, input().split())    a -= 1    b -= 1    g[a].add(b)    g[b].add(a)for i in range(n):    ok = True    for j in range(n):        if i==j: continue        if i in g[j]:            ok = False            break    if ok:        print(n-1)        for j in range(n):            if i != j:                print(i+1, j+1)        quit()
