n, m, k = map(int, input().split())p = [int(x) for x in input().split()]t = 0i = 0op = 0while(i<m):    cmp = ((p[i]-t-1)//k+1)*k    i += 1    temp = t    t += 1    op += 1    while(i<m):        if p[i]-temp<=cmp:            i += 1            t += 1        else:            breakprint(op)