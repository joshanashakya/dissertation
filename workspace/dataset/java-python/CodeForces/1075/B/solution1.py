n, m = map(int, input().split())x = list(map(int, input().split()))t = list(map(int, input().split()))d = {}for i in range(n+m):    if t[i]==1:        d[i]=0aux = [float('inf')]*(n+m)c = -1for i in range(n+m):    if t[i]==1:        c=i    else:        if c!=-1:            aux[i] = x[i]-x[c]c = -1left = 0i1 = t.index(1)i2 = t[::-1].index(1)d[i1]+=i1d[n+m-(i2+1)]+=i2for i in range(n+m-1, -1, -1):    if t[i]==1:        c = i        d[c]+=left        left = 0    else:        if c!=-1:            y = x[c]-x[i]            if y<aux[i] and aux[i]!=float('inf'):                d[c]+=1            else:                left+=1ans = []for i in d:    ans.append(d[i])    print(*ans)                        