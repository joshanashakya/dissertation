n, m, k = map(int, input().split()) a = map(int, input().split())b = map(int, input().split())ab = [(0, 0)] + list(zip(a, b)) l = list(range(n + 1)) def f(x):    if x == l[x]:      return x        l[x] = f(l[x])    return l[x] for i in range(m):    x, y = map(int, input().split())    x, y = f(x), f(y)     if x != y:      l[y] = x    p = [[] for j in range(n + 1)] for i in range(1, n + 1):  p[f(i)].append(i)    r = (k+1) * [0]r[0] = 1 for i in p:    if len(i) > 1:        l = [ab[x] for x in i]        x0 = sum(x[0] for x in l)        x1 = sum(x[1] for x in l)        l.append((x0, x1))        l.sort()            for j in range(k, -1, -1):            if r[j]:                for w, b in l:                    if j + w > k:                      break                    r[j + w] = max(r[j + w], r[j] + b)        elif len(i) == 1:        w, b = ab[i[0]]        for j in range(k - w, -1, -1):            if r[j]:              r[j + w] = max(r[j + w], r[j] + b)   res = max(r) - 1  print(res)
