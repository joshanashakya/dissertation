import syssys.setrecursionlimit

(1000000)  

def dfs(t, u, v, chek, plate):    chek[t][u][v] = 1


plate[t][u][v] = 0
if plate[t + 1][u][v] == '.':        dfs(t + 1, u, v, chek, plate)
if plate[t][u + 1][v] == '.':        dfs(t, u + 1, v, chek, plate)
if plate[t][u - 1][v] == '.':        dfs(t, u - 1, v, chek, plate)
if plate[t][u][v + 1] == '.':        dfs(t, u, v + 1, chek, plate)
if plate[t][u][v - 1] == '.':        dfs(t, u, v - 1, chek, plate)
if plate[t - 1][u][v] == '.':        dfs(t - 1, u, v, chek, plate)  k, n, m = map(int, input().split())
chek = [[[0] * (m + 2) for i in range(n + 2)] for j in range(k + 2)]
plate = [[[0] * (m + 2) for i in range(n + 2)]]
for i in range(1, k + 1):    z = input()
plate.append([[0] * (m + 2)])
for j in range(n):        a = input()
b = [0]
for elem in a:            b.append(elem)
b.append(0)
plate[i].append(b)
plate[i].append([0] * (m + 2))
plate.append([[0] * (m + 2) for i in range(n + 2)])
z = input()
x, y = map(int, input().split())
dfs(1, x, y, chek, plate)
coun = 0
for i in range(k + 2):    for
j in range(n + 2):
for t in range(m + 2):            if
chek[i][j][t]: coun += 1
print(coun)
