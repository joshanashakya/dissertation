n,m = map(int,input().split())ma = []for i in range(n):    ma.append(input())x = [0] * ny = [0] * mfor i in range(n):    for j in range(m):        if ma[i][j] == "*":            x[i] += 1            y[j] += 1ans = 0for i in range(n):    for j in range(m):        if ma[i][j] == "*":            ans += (x[i] - 1) * (y[j] - 1)print(ans)