def check(matrix, getindex = False, isfirst = False):    indices = set()    canbe = True    for row in matrix:        count = 0        for i, value in enumerate(row):            if value != i+1 :                indices.update([i])                count += 1        if count >2:            canbe = False        if count >4 and isfirst:            print("NO")            exit()    if getindex:        return list(indices)    return canbe  n, m = map(int, input().split())matrix = []for i in range(n):    row = [int(x) for x in input().split()]    matrix.append(row) indices  = check(matrix, True, True)canbesort = check(matrix) for i in indices:    if canbesort:        break    for j in indices[1:]:        for k in range(n):            matrix[k][i], matrix[k][j] = matrix[k][j], matrix[k][i]            canbesort = check(matrix)         if canbesort:            break        for k in range(n):            matrix[k][i], matrix[k][j] = matrix[k][j], matrix[k][i] print(canbesort and 'YES' or 'NO')
