n,d,e = int(input()),int(input()),int(input())*5 minn = nfor i in range(d):    for j in range(e):        if i+j!=0:            k=n%(d*i+e*j)%d%e            if minn>k:                minn=kprint(minn)
