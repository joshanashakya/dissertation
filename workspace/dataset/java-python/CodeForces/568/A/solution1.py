def f(s):    for i in range(len(s)//2+1):        if s[i]!=s[-1-i]:            return False    return Truez = 1200000arr = [1]*zarr[0],arr[1] = 0,0for i in range(2,1096):    for j in range(i*i,z,i):        arr[j] = 0cntpal = cntprm = 0i = 1p,q = map(int,input().split())k = p/qm = kwhile i<1200000:    if f(str(i)):        cntpal += 1    if arr[i]:        cntprm += 1    if cntprm/cntpal<=k:        n = i    i += 1print(n)