c = []for i in range(3):    b = []    b = list(map(int,input().split()))    c.append(b)a = [[1,1,1],[1,1,1],[1,1,1]]for i in range(3):    for j in range(3):        c[i][j] = c[i][j] % 2 for i in range(3):    for j in range(3):        if c[i][j] == 1:                            if a[i][j] == 0:                    a[i][j] = 1                else:                    a[i][j] = 0                if i - 1 >= 0:                    if a[i- 1][j] == 0:                        a[i-1][j] = 1                    else:                        a[i - 1][j] = 0                 if j - 1 >= 0:                    if a[i][j - 1] == 0:                        a[i][j - 1] = 1                    else:                        a[i][j - 1] = 0                 if i + 1 <= 2:                    if a[i + 1][j] == 0:                        a[i + 1][j] = 1                    else:                        a[i + 1][j] = 0                 if j + 1 <= 2:                    if a[i][j + 1] == 0:                        a[i][j + 1] = 1                    else:                        a[i][j + 1] = 0  s = ""for i in range(3):    s = ""    for j in range(3):        s += str(a[i][j])    print(s)
