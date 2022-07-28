import syst = int(sys.stdin.readline())
for _ in range(t):    r, c = map(int, sys.stdin.readline().split())
grid = [[0 for i in range(c + 2)]] + [[0] for j in range(r)] + [[0 for i in range(c + 2)]]
for i in range(1, r + 1):        inp = sys.stdin.readline().strip()
for j in range(c):            if
inp[j] == "*": grid[i].append(1) else:                grid[i].append(0)
grid[i].append(
    0)  # for i in grid:    #    print(i)    for i in range(r, 0, -1):        for j in range(1, c+1):            #print(i, j)            if grid[i][j] == 1:                grid[i][j] += min(grid[i+1][j-1], grid[i+1][j], grid[i+1][j+1])    ans = 0    for i in range(r, 0, -1):        for j in range(1, c+1):            ans += grid[i][j]    print(ans)    #for i in grid:    #    print(i)
