n = int(input())graph = [] col = [0] * nrow = [0] * n for i in range(n):    graph.append(input()) for i in range(n):    for j in range(n):        if graph[i][j] == '.':            col[j] = 1            row[i] = 1 colHasDot = FalserowHasDot = False if 0 not in col:    colHasDot = Trueif 0 not in row:    rowHasDot = True if not colHasDot and not rowHasDot:    print("-1")    exit(0) for i in range(n):    j = 0    for j in range(n):        if graph[i][j] == '.':            if colHasDot:                if col[j]:                    print(i + 1, j + 1)                    col[j] = False            elif row[i]:                print(i + 1, j + 1)                break
