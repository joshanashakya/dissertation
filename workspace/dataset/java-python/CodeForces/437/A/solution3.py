d = {}ans = 0cnt = 0for i in range(4):    x = list(input().split("."))    d[x[0]] = len(x[1])  for x in d.keys():    flag = True    for y in d.keys():        if d[x] > (d[y]/2) and (x != y):            flag = False     if flag:        ans = x        cnt += 1  for x in d.keys():    flag = True    for y in d.keys():        if d[x] < (d[y]*2) and (x != y):            flag = False     if flag:        ans = x        cnt += 1 if cnt != 1:    print("C")else:    print(ans)