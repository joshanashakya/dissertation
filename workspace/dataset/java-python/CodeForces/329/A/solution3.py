n = int(input())i = 0grid = [] while i < n:    grid.append(input())    i += 1 row = [False] * ncol = [False] * n# print(hex(id(row)))# print(hex(id(col)))i = 0 while i < n:    j = 0    while j < n:        if grid[i][j] == '.':            col[j] = True            row[i] = True        j += 1    i += 1 vert = (sum(col) == n)horiz = (sum(row) == n) if not vert and not horiz:    print("-1")    exit(0) i = 0while i < n:    j = 0    while j < n:        if grid[i][j] == '.':            if vert:                if col[j]:                    print(str(i+1) + " " + str(j+1))                    col[j] = False            elif row[i]:                    print(str(i+1) + " " + str(j+1))                    break        j += 1    i += 1