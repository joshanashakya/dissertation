n, x = map(int, input().split())l = []r = []for i in range(n):    v, m = map(int, input().split())    l.append(v)    r.append(m) i = 0now = 1c = 0while now <= r[-1]:    if now>r[i]:        i=i+1    if now+x <= l[i]:        now = now+x    elif now+x > l[i]:        c = c+r[i]-now+1        now = r[i]+1print(c)
