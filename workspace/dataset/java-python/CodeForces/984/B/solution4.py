n, m = map(int, input().split())S = [input() for i in range(n)] res = [[0]*m for i in range(n)]d = [(-1, -1), (-1, 0), (-1, 1), (0, -1), (0, 1), (1, -1), (1, 0), (1, 1)]for i in range(n):    for j in range(m):        if S[i][j] == '*':            for di, dj in d:                ni, nj = i+di, j+dj                if 0 <= ni < n and 0 <= nj < m:                    if S[ni][nj] != '*':                        res[ni][nj] += 1#print(res)for i in range(n):    for j in range(m):        if S[i][j] == '*':            continue        elif S[i][j] == '.':            if res[i][j] != 0:                print('NO')                exit()        else:            if int(S[i][j]) != res[i][j]:                print('NO')                exit()else:    print('YES')