a, b = map(int, input().split())d = {}for i in range(a):    f = list(input().split())    if int(f[1]) in d:        d[int(f[1])].append((int(f[2]), f[0]))    else:        d[int(f[1])] = [(int(f[2]), f[0])]for i in d:    d[i].sort()    d[i].reverse()for i in range(1, b + 1):    if len(d[i]) > 2 and d[i][2][0] == d[i][1][0]:        print('?')    else:        print(d[i][0][1], d[i][1][1])
