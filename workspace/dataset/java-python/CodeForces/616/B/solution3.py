try:    n,m = map(int, input().split())    c = []    z = []    for i in range(n):        x = list(map(int, input().split()))        z.append(min(x))        c.append(x)    print(max(z))except:    pass
