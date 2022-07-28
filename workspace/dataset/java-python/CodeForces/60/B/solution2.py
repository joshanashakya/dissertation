directions = [[0, 0, 1], [0, 0, -1], [0, 1, 0], [0, -1, 0], [1, 0, 0], [-1, 0, 0]]
line = input().split()
k = int(line[0])
n = int(line[1])
m = int(line[2])
input() graph = []
for layer in range(k):    for
line in range(n): graph.append(input())
input() line = input().split()
x = int(line[0])
y = int(line[1])  visited = [False] * (k * n * m) 

def dfs(vertex):    if


visited[n * m * vertex[0] + m * vertex[1] + vertex[2]]:
return else:        visited[n * m * vertex[0] + m * vertex[1] + vertex[2]] = True
for direction in directions:        position_to_look = []
invalid = False
for i in range(3):            position_to_look.append(vertex[i] + direction[i])
for coordinate in position_to_look:            if
coordinate < 0: invalid = True
if position_to_look[0] >= k or position_to_look[1] >= n or position_to_look[2] >= m:            invalid = True
if invalid:            continue
if graph[n * position_to_look[0] + position_to_look[1]][position_to_look[2]] == '.':            dfs(
    position_to_look) dfs([0, x - 1, y - 1])
counter = 0
for vertex in visited:    if
vertex: counter += 1 print(counter)
