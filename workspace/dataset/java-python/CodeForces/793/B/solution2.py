n, m = map(int, input().split())a = []x, y = 0, 0  def f(c, x, y):    for i in range(x + 1, n):        if a[i][y] == 'T':            print('YES')            exit()        if a[i][y] == '.':            a[i][y] = c        elif a[i][y] != c:            break    for i in range(x - 1, -1, -1):        if a[i][y] == 'T':            print('YES')            exit()        if a[i][y] == '.':            a[i][y] = c        elif a[i][y] != c:            break    for j in range(y + 1, m):        if a[x][j] == 'T':            print('YES')            exit()        if a[x][j] == '.':            a[x][j] = c        elif a[x][j] != c:            break    for j in range(y - 1, -1, -1):        if a[x][j] == 'T':            print('YES')            exit()        if a[x][j] == '.':            a[x][j] = c        elif a[x][j] != c:            break  for i in range(n):    s = input()    for j in range(m):        if s[j] == 'S':            x, y = i, j    a.append(list(s))f('1', x, y)for i in range(n):    for j in range(m):        if a[i][j] == '1':            f('2', i, j)for i in range(n):    for j in range(m):        if a[i][j] == '2':            f('3', i, j)print('NO')  