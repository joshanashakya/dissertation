n, k = map(int,input().split())S = [input() for i in range(n)] C = [[0]*n for i in range(n)]for i in range(n):    for j in range(n):        if S[i][j] == '#':            continue        if i+k-1 < n:            for di in range(k):                ni = i+di                if S[ni][j] == '#':                    break            else:                for di in range(k):                    ni = i+di                    C[ni][j] += 1        if j+k-1 < n:            for dj in range(k):                nj = j+dj                if S[i][nj] == '#':                    break            else:                for dj in range(k):                    nj = j+dj                    C[i][nj] += 1#print(C)maxc = 0ans = (1, 1)for i in range(n):    for j in range(n):        if C[i][j] >= maxc:            maxc = C[i][j]            ans = (i+1, j+1)print(*ans)