def checkRow(i, c):    cnt = 0


for j in range(m):        if
g[i][j] == c: cnt += 1     if cnt >= 2:        return True
return False  

def checkCol(j, c):    cnt = 0


for i in range(n):        if
g[i][j] == c: cnt += 1     if cnt >= 2:        return True
return False n, m = map(int, input().split()) g = [] for i in range(n):    g.append(list(input()))  res = [[0] * m for i
                                                                                                           in range(n)]
for i in range(n):    for
j in range(m):
if (checkRow(i, g[i][j])) or checkCol(j, g[i][j]):            res[i][j] = 1  for i in range(n):    for
j in range(m):
if res[i][j] == 0:            print(g[i][j], end='')    
