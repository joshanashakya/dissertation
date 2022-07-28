from sys import stdinfrom math import inf  def readline():    return map(int, stdin.readline().strip().split())  def dijkstra():  # , parent):    n, d = readline()    a = [0] + list(readline()) + [0]    x = [0] * n    y = [0] * n    # parent = [-1] * n  #  In case you want to know the path traveled    for i in range(n):        x[i], y[i] = readline()    lower_cost = [inf] * n    lower_cost[0] = 0    visited = [False] * n    for i in range(n - 1):        lower_value = inf        position = 0        for j in range(n):            if visited[j] or lower_value <= lower_cost[j]:                continue            lower_value = lower_cost[j]            position = j        visited[position] = True        for k in range(n):            if not visited[k]:                diff = lower_cost[position] + d * (abs(x[k] - x[position]) + abs(y[k] - y[position])) - a[position]                if lower_cost[k] > diff:                    lower_cost[k] = diff                    # parent[k] = position    return lower_cost[-1]  if __name__ == '__main__':    print(dijkstra())
