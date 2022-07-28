n, m = map(int, input().split())
grid = [input() for _ in range(n)]
row = [[] for _ in range(n)]
column = [[] for _ in range(n)] for i in range(n):    letters = {}
for j in range(m):        if
grid[i][j] in letters: letters[grid[i][j]] += 1 else:            letters[grid[i][j]] = 1     for j in range(
    m):        if
letters[grid[i][j]] > 1: row[i].append('') else:            row[i].append(grid[i][j])
for i in range(m):    letters = {}
for j in range(n):        if
grid[j][i] in letters: letters[grid[j][i]] += 1 else:            letters[grid[j][i]] = 1     for j in range(
    n):        if
letters[grid[j][i]] > 1: column[j].append('') else:            column[j].append(grid[j][i]) for i in range(n):    for
j in range(m):
if row[i][j] != '' and column[i][j] != '':            print(row[i][j], end='')
