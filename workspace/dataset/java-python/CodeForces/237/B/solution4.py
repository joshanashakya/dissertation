n = int(input())c = [0] + list(map(int, input().split()))m = sum(c)p, q, r, t = [0] * (m + 1), {}, [0] * m, [] k = 0for i in range(1, n + 1):    s = str(i) + ' '    for j in range(1, c[i] + 1):        r[k] = s + str(j)        k += 1k = 0for i in range(n):    for x in tuple(map(int, input().split())):        p[x], q[r[k]] = r[k], x        k += 1 k = 1for y in r:    a, b = q[y], p[k]    if p[k] != y:        t.append(y + ' ' + b)        p[a], q[b] = b, a    k += 1    print(len(t))print('\n'.join(t))